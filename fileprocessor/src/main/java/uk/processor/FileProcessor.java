package uk.processor;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
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

public class FileProcessor {
	private static final String resource = "F:/DEVELOPEMENT/MOJ/poc/fileprocessor/src/main/resources/";
	private static final String PNLD_XSD_SCHEMA_LOCATION = resource + "HDocumentSchema.xsd";
	private static final String PNLD_DATA_FILES_LOCATION = resource + "H1.xml";

	public static void main(String... args) throws Exception {
		// readFromZip();
		new FileProcessor().someMethod();
	}

	private final ClassLoader classLoader = getClass().getClassLoader();

	public void someMethod() throws JAXBException {
		File file = new File(PNLD_DATA_FILES_LOCATION);
		JAXBContext jaxbContext = JAXBContext.newInstance(Documents.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Documents customer = (Documents) jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer.getDocument().getPnldref());
	}

	public Set<Documents> parseAndValidatePnld() throws Exception {

		Set<Documents> parsedPnld = new HashSet<>();

		JAXBContext context = JAXBContext.newInstance(Documents.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = factory.newSchema(new StreamSource(new FileInputStream(PNLD_XSD_SCHEMA_LOCATION)));
		Validator validator = schema.newValidator();

		StreamSource file = null;

		try {
			file = new StreamSource(new FileInputStream(PNLD_DATA_FILES_LOCATION));
			validator.validate(file);
			Documents document = (Documents) unmarshaller.unmarshal(file);
			parsedPnld.add(document);
		} catch (SAXException saxException) {
			throw new Exception(
					String.format("Error validating PNLD file %s against provided XSD", file.getPublicId()));
		} catch (IOException ioException) {
			throw new Exception(String.format("Error reading file %s", file.getPublicId()));
		}

		// reader.close();
		return parsedPnld;
	}

	private static void readFromZip() throws FileNotFoundException, IOException, UnsupportedEncodingException {
		String fileName = "D:/MOJ/_DownloadsAndData/Simple.zip";
		FileInputStream fis = new FileInputStream(fileName);
		byte[] data = Files.readAllBytes(Paths.get(fileName));
		final String encoded = Base64.getEncoder().encodeToString(data);
		// System.out.println(" => " + encoded);
		byte[] decode = Base64.getDecoder().decode(encoded);
		InputStream myInputStream = new ByteArrayInputStream(decode);
		ZipInputStream zin = new ZipInputStream(myInputStream);

		ZipEntry ze;
		while ((ze = zin.getNextEntry()) != null) {
			if (!ze.isDirectory()) {
				System.out.println("======== Unzipping == " + ze.getName());
				for (int c = zin.read(); c != -1; c = zin.read()) {
					System.out.write(c);
				}
			}
			zin.closeEntry();
		}
		zin.close();
	}
}
