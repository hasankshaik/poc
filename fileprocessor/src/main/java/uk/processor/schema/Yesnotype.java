package uk.processor.schema;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for yesnotype.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="yesnotype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "yesnotype")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                comments = "JAXB RI v2.2.8-b130911.1802")
public enum Yesnotype {

    @XmlEnumValue("Yes") YES("Yes"), @XmlEnumValue("No") NO("No");
    private final String value;

    Yesnotype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Yesnotype fromValue(String v) {
        for (Yesnotype c : Yesnotype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

