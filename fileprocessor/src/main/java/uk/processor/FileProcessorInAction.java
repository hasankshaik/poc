package uk.processor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import uk.processor.schema.Documents;

public class FileProcessorInAction {
	private static final String resource = "F:/DEVELOPEMENT/MOJ/poc/fileprocessor/src/main/resources/";
	private static final String PNLD_XSD_SCHEMA_LOCATION = resource + "HDocumentSchema.xsd";
	private static final String PNLD_DATA_FILES_LOCATION = resource + "H1.xml";
	private static final String FILES_LOCATION = resource + "Simple.zip";

	public static void main(String... args) throws Exception {
		FileProcessorInAction fileProcessorInAction = new FileProcessorInAction();
		fileProcessorInAction.readFromZip();
		// new FileProcessor().parseAndValidatePnld();
	}

	public Documents parseAndValidatePnld(InputStream inStream) throws Exception {

		JAXBContext context = JAXBContext.newInstance(Documents.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = factory.newSchema(new StreamSource(new FileInputStream(PNLD_XSD_SCHEMA_LOCATION)));
		Validator validator = schema.newValidator();

		StreamSource file = null;

		try {
			file = new StreamSource(inStream);
			validator.validate(file);
			return (Documents) unmarshaller.unmarshal(new StreamSource(inStream));
		} catch (SAXException saxException) {
			throw new Exception(
					String.format("Error validating PNLD file %s against provided XSD", file.getPublicId()));
		}

		// reader.close();
	}
	public Documents someMethod(InputStream is) throws JAXBException {
		File file = new File(PNLD_DATA_FILES_LOCATION);
		JAXBContext jaxbContext = JAXBContext.newInstance(Documents.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Documents customer = (Documents) jaxbUnmarshaller.unmarshal(is);
		System.out.println(customer.getDocument().getPnldref());
		return customer;
	}
	private void readFromZip() throws Exception {
		FileInputStream fis = new FileInputStream(FILES_LOCATION);
		byte[] data = Files.readAllBytes(Paths.get(FILES_LOCATION));
		final String encoded = Base64.getEncoder().encodeToString(data);
		// System.out.println(" => " + encoded);
		byte[] decode = Base64.getDecoder().decode(encoded);
		InputStream myInputStream = new ByteArrayInputStream(decode);
		ZipInputStream zin = new ZipInputStream(myInputStream);

		ZipEntry ze;
		Set<Documents> parsedPnld = new HashSet<>();
		while ((ze = zin.getNextEntry()) != null) {
			if (!ze.isDirectory()) {
				System.out.println("======== Unzipping == " + ze.getName());
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				for (int c = zin.read(); c != -1; c = zin.read()) {
//					System.out.write(c);
					out.write(c);
				}
				InputStream is = new ByteArrayInputStream(out.toByteArray());
				Documents x = someMethod(is);
				System.out.println(x);
			}
			zin.closeEntry();
		}
		zin.close();
	}
}
