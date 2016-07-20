package uk.processor.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="document">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pnldref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="english" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="title" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="120"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="additionalkeywords" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="additionalkeyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="standardoffencewording" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="legislation" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="350"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="pointstoprove" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="investigatoractions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="investigatoraction" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="policeandcpschargingresponsibilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="notes" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="4000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="standardstatementoffacts" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="4000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="indictment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indictmentindicator" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{}yntype"/>
 *                                       &lt;element name="description" type="{}yesnotype"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="structuredindictmentindicator" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{}yntype"/>
 *                                       &lt;element name="description" type="{}yesnotype"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="indictmenttitle" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="welshindictmenttitle" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indictmentcountcode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="0"/>
 *                                   &lt;maxLength value="13"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="unstructuredindictmentstandardwording" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="structuredindictmentstandardwording" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="welshunstructuredindictmentstandardwording" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="welshstructuredindictmentstandardwording" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="welsh" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="welshoffencetitle" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="120"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="welshstandardoffencewording" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="welshstandardstatementoffacts" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="4000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="welshlegislation" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="350"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="other" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="powersofarrest" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="modeoftrial" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="consents" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="consent" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="code">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="timelimitforprosecutions" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="penalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="geographicregion" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="codes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cjsoffencecode">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="7"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="previouscjsoffencecode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="7"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="recordableonpncindicator" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{}yntype"/>
 *                                       &lt;element name="description" type="{}yesnotype"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="pncacpooffencecode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="([A][a][/]|[A][t][/]|[I][/]|[C][/]){0,1}[0-9]{1,3}.[0-9]{1,2}.[0-9]{1,3}.[0-9]{1,2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="notifiabletomoj" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{}yntype"/>
 *                                       &lt;element name="description" type="{}yesnotype"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="mojstatscode">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="6"/>
 *                                   &lt;pattern value="[0-9]{3}/[0-9]{2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="mopireviewgroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="mopinoteslink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="disqualificationclass" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dvlacode" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="maxpenaltypoints" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="2"/>
 *                                   &lt;maxInclusive value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="minpenaltypoints" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="2"/>
 *                                   &lt;maxInclusive value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="seatbeltoffence" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fptissuedbypolice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="fptgraduated" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="fptgraduatedhigh" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="pndissuedbypolice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="pndissuedbylocalauthorities" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="pndissuedbyothers" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="roadsidedeposits" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="libra" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="libracategory" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fineindicator" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{}yntype">
 *                                             &lt;length value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{}yesnotype"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="maxfinetypemagct" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="maxfinemagct" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minInclusive value="0.01"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                   &lt;maxExclusive value="1000000000000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="maxfinetypecrownct" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="maxfinecrownct" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minInclusive value="0.01"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                   &lt;maxExclusive value="1000000000000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="custodialindicator" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{}yntype"/>
 *                                       &lt;element name="description" type="{}yesnotype"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="maxcustodialsentenceunitmagct" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="4"/>
 *                                             &lt;maxLength value="6"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="maxcustodialsentencelengthmagct" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="999"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="maxcustodialsentenceunitcrownct" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="4"/>
 *                                             &lt;maxLength value="6"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="maxcustodialsentencelengthcrownct" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="999"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="complexpenaltydetails" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="4000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="miscode" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="hoproceedingscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ancillary">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="offencestartdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="offenceenddate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="datecreated" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="auditofamendments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="legislationcode" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateoflastupdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="fptupdatedate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="offencewordinggroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groups" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"document"})
@XmlRootElement(name = "documents")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                comments = "JAXB RI v2.2.8-b130911.1802")
public class Documents {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                    comments = "JAXB RI v2.2.8-b130911.1802")
    protected Documents.Document document;

    /**
     * Gets the value of the document property.
     *
     * @return possible object is {@link Documents.Document }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                    comments = "JAXB RI v2.2.8-b130911.1802")
    public Documents.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value allowed object is {@link Documents.Document }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                    comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocument(Documents.Document value) {
        this.document = value;
    }


    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="pnldref" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="english" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="title" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="120"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="additionalkeywords" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="additionalkeyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="standardoffencewording" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="legislation" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="350"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="pointstoprove" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="investigatoractions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="investigatoraction" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="policeandcpschargingresponsibilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="notes" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="4000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="standardstatementoffacts" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="4000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="indictment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="indictmentindicator" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{}yntype"/>
     *                             &lt;element name="description" type="{}yesnotype"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="structuredindictmentindicator" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{}yntype"/>
     *                             &lt;element name="description" type="{}yesnotype"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="indictmenttitle" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="welshindictmenttitle" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indictmentcountcode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="0"/>
     *                         &lt;maxLength value="13"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="unstructuredindictmentstandardwording" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="structuredindictmentstandardwording" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="welshunstructuredindictmentstandardwording" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="welshstructuredindictmentstandardwording" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="welsh" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="welshoffencetitle" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="120"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="welshstandardoffencewording" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="welshstandardstatementoffacts" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="4000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="welshlegislation" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="350"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="other" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="powersofarrest" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="modeoftrial" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="consents" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="consent" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="code">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="timelimitforprosecutions" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="penalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="geographicregion" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="codes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cjsoffencecode">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="7"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="previouscjsoffencecode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="7"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="recordableonpncindicator" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{}yntype"/>
     *                             &lt;element name="description" type="{}yesnotype"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="pncacpooffencecode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="([A][a][/]|[A][t][/]|[I][/]|[C][/]){0,1}[0-9]{1,3}.[0-9]{1,2}.[0-9]{1,3}.[0-9]{1,2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="notifiabletomoj" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{}yntype"/>
     *                             &lt;element name="description" type="{}yesnotype"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="mojstatscode">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="6"/>
     *                         &lt;pattern value="[0-9]{3}/[0-9]{2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="mopireviewgroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="mopinoteslink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="disqualificationclass" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dvlacode" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maxpenaltypoints" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="2"/>
     *                         &lt;maxInclusive value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="minpenaltypoints" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="2"/>
     *                         &lt;maxInclusive value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="seatbeltoffence" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fptissuedbypolice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="fptgraduated" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="fptgraduatedhigh" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="pndissuedbypolice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="pndissuedbylocalauthorities" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="pndissuedbyothers" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="roadsidedeposits" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="libra" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="libracategory" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fineindicator" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{}yntype">
     *                                   &lt;length value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{}yesnotype"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maxfinetypemagct" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maxfinemagct" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minInclusive value="0.01"/>
     *                         &lt;fractionDigits value="2"/>
     *                         &lt;maxExclusive value="1000000000000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="maxfinetypecrownct" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maxfinecrownct" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minInclusive value="0.01"/>
     *                         &lt;fractionDigits value="2"/>
     *                         &lt;maxExclusive value="1000000000000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="custodialindicator" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{}yntype"/>
     *                             &lt;element name="description" type="{}yesnotype"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maxcustodialsentenceunitmagct" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="4"/>
     *                                   &lt;maxLength value="6"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maxcustodialsentencelengthmagct" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="1"/>
     *                         &lt;maxInclusive value="999"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="maxcustodialsentenceunitcrownct" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="4"/>
     *                                   &lt;maxLength value="6"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maxcustodialsentencelengthcrownct" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="1"/>
     *                         &lt;maxInclusive value="999"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="complexpenaltydetails" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="4000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="miscode" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="hoproceedingscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ancillary">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="offencestartdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="offenceenddate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="datecreated" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="auditofamendments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="legislationcode" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateoflastupdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="fptupdatedate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="offencewordinggroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groups" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"pnldref", "english", "indictment", "welsh", "other", "codes",
                    "libra", "ancillary"})
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                    comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Document {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected String pnldref;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected Documents.Document.English english;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected Documents.Document.Indictment indictment;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected Documents.Document.Welsh welsh;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected Documents.Document.Other other;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected Documents.Document.Codes codes;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected Documents.Document.Libra libra;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected Documents.Document.Ancillary ancillary;
        @XmlAttribute(name = "type", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        protected String type;

        /**
         * Gets the value of the pnldref property.
         *
         * @return possible object is {@link String }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public String getPnldref() {
            return pnldref;
        }

        /**
         * Sets the value of the pnldref property.
         *
         * @param value allowed object is {@link String }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPnldref(String value) {
            this.pnldref = value;
        }

        /**
         * Gets the value of the english property.
         *
         * @return possible object is {@link Documents.Document.English }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public Documents.Document.English getEnglish() {
            return english;
        }

        /**
         * Sets the value of the english property.
         *
         * @param value allowed object is {@link Documents.Document.English }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setEnglish(Documents.Document.English value) {
            this.english = value;
        }

        /**
         * Gets the value of the indictment property.
         *
         * @return possible object is {@link Documents.Document.Indictment }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public Documents.Document.Indictment getIndictment() {
            return indictment;
        }

        /**
         * Sets the value of the indictment property.
         *
         * @param value allowed object is {@link Documents.Document.Indictment }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setIndictment(Documents.Document.Indictment value) {
            this.indictment = value;
        }

        /**
         * Gets the value of the welsh property.
         *
         * @return possible object is {@link Documents.Document.Welsh }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public Documents.Document.Welsh getWelsh() {
            return welsh;
        }

        /**
         * Sets the value of the welsh property.
         *
         * @param value allowed object is {@link Documents.Document.Welsh }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setWelsh(Documents.Document.Welsh value) {
            this.welsh = value;
        }

        /**
         * Gets the value of the other property.
         *
         * @return possible object is {@link Documents.Document.Other }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public Documents.Document.Other getOther() {
            return other;
        }

        /**
         * Sets the value of the other property.
         *
         * @param value allowed object is {@link Documents.Document.Other }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setOther(Documents.Document.Other value) {
            this.other = value;
        }

        /**
         * Gets the value of the codes property.
         *
         * @return possible object is {@link Documents.Document.Codes }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public Documents.Document.Codes getCodes() {
            return codes;
        }

        /**
         * Sets the value of the codes property.
         *
         * @param value allowed object is {@link Documents.Document.Codes }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setCodes(Documents.Document.Codes value) {
            this.codes = value;
        }

        /**
         * Gets the value of the libra property.
         *
         * @return possible object is {@link Documents.Document.Libra }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public Documents.Document.Libra getLibra() {
            return libra;
        }

        /**
         * Sets the value of the libra property.
         *
         * @param value allowed object is {@link Documents.Document.Libra }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setLibra(Documents.Document.Libra value) {
            this.libra = value;
        }

        /**
         * Gets the value of the ancillary property.
         *
         * @return possible object is {@link Documents.Document.Ancillary }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public Documents.Document.Ancillary getAncillary() {
            return ancillary;
        }

        /**
         * Sets the value of the ancillary property.
         *
         * @param value allowed object is {@link Documents.Document.Ancillary }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setAncillary(Documents.Document.Ancillary value) {
            this.ancillary = value;
        }

        /**
         * Gets the value of the type property.
         *
         * @return possible object is {@link String }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         *
         * @param value allowed object is {@link String }
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public void setType(String value) {
            this.type = value;
        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="offencestartdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="offenceenddate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="datecreated" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="auditofamendments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="legislationcode" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateoflastupdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="fptupdatedate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="offencewordinggroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groups" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "",
                        propOrder = {"offencestartdate", "offenceenddate", "datecreated",
                                        "auditofamendments", "legislationcode", "lastupdate",
                                        "dateoflastupdate", "fptupdatedate", "offencewordinggroup",
                                        "groups"})
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Ancillary {

            @XmlSchemaType(name = "date")
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected XMLGregorianCalendar offencestartdate;
            @XmlSchemaType(name = "date")
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected XMLGregorianCalendar offenceenddate;
            @XmlSchemaType(name = "date")
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected XMLGregorianCalendar datecreated;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String auditofamendments;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Ancillary.Legislationcode legislationcode;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String lastupdate;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected XMLGregorianCalendar dateoflastupdate;
            @XmlSchemaType(name = "date")
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected XMLGregorianCalendar fptupdatedate;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String offencewordinggroup;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Ancillary.Groups groups;

            /**
             * Gets the value of the offencestartdate property.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public XMLGregorianCalendar getOffencestartdate() {
                return offencestartdate;
            }

            /**
             * Sets the value of the offencestartdate property.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setOffencestartdate(XMLGregorianCalendar value) {
                this.offencestartdate = value;
            }

            /**
             * Gets the value of the offenceenddate property.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public XMLGregorianCalendar getOffenceenddate() {
                return offenceenddate;
            }

            /**
             * Sets the value of the offenceenddate property.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setOffenceenddate(XMLGregorianCalendar value) {
                this.offenceenddate = value;
            }

            /**
             * Gets the value of the datecreated property.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public XMLGregorianCalendar getDatecreated() {
                return datecreated;
            }

            /**
             * Sets the value of the datecreated property.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setDatecreated(XMLGregorianCalendar value) {
                this.datecreated = value;
            }

            /**
             * Gets the value of the auditofamendments property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getAuditofamendments() {
                return auditofamendments;
            }

            /**
             * Sets the value of the auditofamendments property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setAuditofamendments(String value) {
                this.auditofamendments = value;
            }

            /**
             * Gets the value of the legislationcode property.
             *
             * @return possible object is {@link Documents.Document.Ancillary.Legislationcode }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Ancillary.Legislationcode getLegislationcode() {
                return legislationcode;
            }

            /**
             * Sets the value of the legislationcode property.
             *
             * @param value allowed object is {@link Documents.Document.Ancillary.Legislationcode }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setLegislationcode(Documents.Document.Ancillary.Legislationcode value) {
                this.legislationcode = value;
            }

            /**
             * Gets the value of the lastupdate property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getLastupdate() {
                return lastupdate;
            }

            /**
             * Sets the value of the lastupdate property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setLastupdate(String value) {
                this.lastupdate = value;
            }

            /**
             * Gets the value of the dateoflastupdate property.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public XMLGregorianCalendar getDateoflastupdate() {
                return dateoflastupdate;
            }

            /**
             * Sets the value of the dateoflastupdate property.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setDateoflastupdate(XMLGregorianCalendar value) {
                this.dateoflastupdate = value;
            }

            /**
             * Gets the value of the fptupdatedate property.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public XMLGregorianCalendar getFptupdatedate() {
                return fptupdatedate;
            }

            /**
             * Sets the value of the fptupdatedate property.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setFptupdatedate(XMLGregorianCalendar value) {
                this.fptupdatedate = value;
            }

            /**
             * Gets the value of the offencewordinggroup property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getOffencewordinggroup() {
                return offencewordinggroup;
            }

            /**
             * Sets the value of the offencewordinggroup property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setOffencewordinggroup(String value) {
                this.offencewordinggroup = value;
            }

            /**
             * Gets the value of the groups property.
             *
             * @return possible object is {@link Documents.Document.Ancillary.Groups }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Ancillary.Groups getGroups() {
                return groups;
            }

            /**
             * Sets the value of the groups property.
             *
             * @param value allowed object is {@link Documents.Document.Ancillary.Groups }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setGroups(Documents.Document.Ancillary.Groups value) {
                this.groups = value;
            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Groups {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"link"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Legislationcode {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String link;

                /**
                 * Gets the value of the link property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getLink() {
                    return link;
                }

                /**
                 * Sets the value of the link property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setLink(String value) {
                    this.link = value;
                }

            }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cjsoffencecode">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="7"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="previouscjsoffencecode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="7"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="recordableonpncindicator" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{}yntype"/>
         *                   &lt;element name="description" type="{}yesnotype"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="pncacpooffencecode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="([A][a][/]|[A][t][/]|[I][/]|[C][/]){0,1}[0-9]{1,3}.[0-9]{1,2}.[0-9]{1,3}.[0-9]{1,2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="notifiabletomoj" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{}yntype"/>
         *                   &lt;element name="description" type="{}yesnotype"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mojstatscode">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="6"/>
         *               &lt;pattern value="[0-9]{3}/[0-9]{2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="mopireviewgroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mopinoteslink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="disqualificationclass" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dvlacode" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maxpenaltypoints" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="2"/>
         *               &lt;maxInclusive value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="minpenaltypoints" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="2"/>
         *               &lt;maxInclusive value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="seatbeltoffence" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fptissuedbypolice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="fptgraduated" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="fptgraduatedhigh" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="pndissuedbypolice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="pndissuedbylocalauthorities" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="pndissuedbyothers" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="roadsidedeposits" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "",
                        propOrder = {"cjsoffencecode", "previouscjsoffencecode",
                                        "recordableonpncindicator", "pncacpooffencecode",
                                        "notifiabletomoj", "mojstatscode", "mopireviewgroup",
                                        "mopinoteslink", "disqualificationclass", "dvlacode",
                                        "maxpenaltypoints", "minpenaltypoints", "seatbeltoffence",
                                        "fptissuedbypolice", "fptgraduated", "fptgraduatedhigh",
                                        "pndissuedbypolice", "pndissuedbylocalauthorities",
                                        "pndissuedbyothers", "roadsidedeposits"})
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Codes {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String cjsoffencecode;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String previouscjsoffencecode;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Codes.Recordableonpncindicator recordableonpncindicator;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String pncacpooffencecode;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Codes.Notifiabletomoj notifiabletomoj;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String mojstatscode;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Codes.Mopireviewgroup mopireviewgroup;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String mopinoteslink;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Codes.Disqualificationclass disqualificationclass;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Codes.Dvlacode dvlacode;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Integer maxpenaltypoints;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Integer minpenaltypoints;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Codes.Seatbeltoffence seatbeltoffence;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected BigDecimal fptissuedbypolice;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected BigDecimal fptgraduated;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected BigDecimal fptgraduatedhigh;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected BigDecimal pndissuedbypolice;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected BigDecimal pndissuedbylocalauthorities;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected BigDecimal pndissuedbyothers;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Codes.Roadsidedeposits roadsidedeposits;

            /**
             * Gets the value of the cjsoffencecode property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getCjsoffencecode() {
                return cjsoffencecode;
            }

            /**
             * Sets the value of the cjsoffencecode property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setCjsoffencecode(String value) {
                this.cjsoffencecode = value;
            }

            /**
             * Gets the value of the previouscjsoffencecode property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getPreviouscjsoffencecode() {
                return previouscjsoffencecode;
            }

            /**
             * Sets the value of the previouscjsoffencecode property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPreviouscjsoffencecode(String value) {
                this.previouscjsoffencecode = value;
            }

            /**
             * Gets the value of the recordableonpncindicator property.
             *
             * @return possible object is {@link Documents.Document.Codes.Recordableonpncindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Codes.Recordableonpncindicator getRecordableonpncindicator() {
                return recordableonpncindicator;
            }

            /**
             * Sets the value of the recordableonpncindicator property.
             *
             * @param value allowed object is
             *        {@link Documents.Document.Codes.Recordableonpncindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setRecordableonpncindicator(
                            Documents.Document.Codes.Recordableonpncindicator value) {
                this.recordableonpncindicator = value;
            }

            /**
             * Gets the value of the pncacpooffencecode property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getPncacpooffencecode() {
                return pncacpooffencecode;
            }

            /**
             * Sets the value of the pncacpooffencecode property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPncacpooffencecode(String value) {
                this.pncacpooffencecode = value;
            }

            /**
             * Gets the value of the notifiabletomoj property.
             *
             * @return possible object is {@link Documents.Document.Codes.Notifiabletomoj }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Codes.Notifiabletomoj getNotifiabletomoj() {
                return notifiabletomoj;
            }

            /**
             * Sets the value of the notifiabletomoj property.
             *
             * @param value allowed object is {@link Documents.Document.Codes.Notifiabletomoj }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setNotifiabletomoj(Documents.Document.Codes.Notifiabletomoj value) {
                this.notifiabletomoj = value;
            }

            /**
             * Gets the value of the mojstatscode property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getMojstatscode() {
                return mojstatscode;
            }

            /**
             * Sets the value of the mojstatscode property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMojstatscode(String value) {
                this.mojstatscode = value;
            }

            /**
             * Gets the value of the mopireviewgroup property.
             *
             * @return possible object is {@link Documents.Document.Codes.Mopireviewgroup }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Codes.Mopireviewgroup getMopireviewgroup() {
                return mopireviewgroup;
            }

            /**
             * Sets the value of the mopireviewgroup property.
             *
             * @param value allowed object is {@link Documents.Document.Codes.Mopireviewgroup }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMopireviewgroup(Documents.Document.Codes.Mopireviewgroup value) {
                this.mopireviewgroup = value;
            }

            /**
             * Gets the value of the mopinoteslink property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getMopinoteslink() {
                return mopinoteslink;
            }

            /**
             * Sets the value of the mopinoteslink property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMopinoteslink(String value) {
                this.mopinoteslink = value;
            }

            /**
             * Gets the value of the disqualificationclass property.
             *
             * @return possible object is {@link Documents.Document.Codes.Disqualificationclass }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Codes.Disqualificationclass getDisqualificationclass() {
                return disqualificationclass;
            }

            /**
             * Sets the value of the disqualificationclass property.
             *
             * @param value allowed object is
             *        {@link Documents.Document.Codes.Disqualificationclass }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setDisqualificationclass(
                            Documents.Document.Codes.Disqualificationclass value) {
                this.disqualificationclass = value;
            }

            /**
             * Gets the value of the dvlacode property.
             *
             * @return possible object is {@link Documents.Document.Codes.Dvlacode }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Codes.Dvlacode getDvlacode() {
                return dvlacode;
            }

            /**
             * Sets the value of the dvlacode property.
             *
             * @param value allowed object is {@link Documents.Document.Codes.Dvlacode }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setDvlacode(Documents.Document.Codes.Dvlacode value) {
                this.dvlacode = value;
            }

            /**
             * Gets the value of the maxpenaltypoints property.
             *
             * @return possible object is {@link Integer }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Integer getMaxpenaltypoints() {
                return maxpenaltypoints;
            }

            /**
             * Sets the value of the maxpenaltypoints property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxpenaltypoints(Integer value) {
                this.maxpenaltypoints = value;
            }

            /**
             * Gets the value of the minpenaltypoints property.
             *
             * @return possible object is {@link Integer }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Integer getMinpenaltypoints() {
                return minpenaltypoints;
            }

            /**
             * Sets the value of the minpenaltypoints property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMinpenaltypoints(Integer value) {
                this.minpenaltypoints = value;
            }

            /**
             * Gets the value of the seatbeltoffence property.
             *
             * @return possible object is {@link Documents.Document.Codes.Seatbeltoffence }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Codes.Seatbeltoffence getSeatbeltoffence() {
                return seatbeltoffence;
            }

            /**
             * Sets the value of the seatbeltoffence property.
             *
             * @param value allowed object is {@link Documents.Document.Codes.Seatbeltoffence }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setSeatbeltoffence(Documents.Document.Codes.Seatbeltoffence value) {
                this.seatbeltoffence = value;
            }

            /**
             * Gets the value of the fptissuedbypolice property.
             *
             * @return possible object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public BigDecimal getFptissuedbypolice() {
                return fptissuedbypolice;
            }

            /**
             * Sets the value of the fptissuedbypolice property.
             *
             * @param value allowed object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setFptissuedbypolice(BigDecimal value) {
                this.fptissuedbypolice = value;
            }

            /**
             * Gets the value of the fptgraduated property.
             *
             * @return possible object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public BigDecimal getFptgraduated() {
                return fptgraduated;
            }

            /**
             * Sets the value of the fptgraduated property.
             *
             * @param value allowed object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setFptgraduated(BigDecimal value) {
                this.fptgraduated = value;
            }

            /**
             * Gets the value of the fptgraduatedhigh property.
             *
             * @return possible object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public BigDecimal getFptgraduatedhigh() {
                return fptgraduatedhigh;
            }

            /**
             * Sets the value of the fptgraduatedhigh property.
             *
             * @param value allowed object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setFptgraduatedhigh(BigDecimal value) {
                this.fptgraduatedhigh = value;
            }

            /**
             * Gets the value of the pndissuedbypolice property.
             *
             * @return possible object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public BigDecimal getPndissuedbypolice() {
                return pndissuedbypolice;
            }

            /**
             * Sets the value of the pndissuedbypolice property.
             *
             * @param value allowed object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPndissuedbypolice(BigDecimal value) {
                this.pndissuedbypolice = value;
            }

            /**
             * Gets the value of the pndissuedbylocalauthorities property.
             *
             * @return possible object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public BigDecimal getPndissuedbylocalauthorities() {
                return pndissuedbylocalauthorities;
            }

            /**
             * Sets the value of the pndissuedbylocalauthorities property.
             *
             * @param value allowed object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPndissuedbylocalauthorities(BigDecimal value) {
                this.pndissuedbylocalauthorities = value;
            }

            /**
             * Gets the value of the pndissuedbyothers property.
             *
             * @return possible object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public BigDecimal getPndissuedbyothers() {
                return pndissuedbyothers;
            }

            /**
             * Sets the value of the pndissuedbyothers property.
             *
             * @param value allowed object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPndissuedbyothers(BigDecimal value) {
                this.pndissuedbyothers = value;
            }

            /**
             * Gets the value of the roadsidedeposits property.
             *
             * @return possible object is {@link Documents.Document.Codes.Roadsidedeposits }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Codes.Roadsidedeposits getRoadsidedeposits() {
                return roadsidedeposits;
            }

            /**
             * Sets the value of the roadsidedeposits property.
             *
             * @param value allowed object is {@link Documents.Document.Codes.Roadsidedeposits }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setRoadsidedeposits(Documents.Document.Codes.Roadsidedeposits value) {
                this.roadsidedeposits = value;
            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Disqualificationclass {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Dvlacode {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Mopireviewgroup {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{}yntype"/>
             *         &lt;element name="description" type="{}yesnotype"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Notifiabletomoj {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yntype code;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yesnotype description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yntype getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(Yntype value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yesnotype getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(Yesnotype value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{}yntype"/>
             *         &lt;element name="description" type="{}yesnotype"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Recordableonpncindicator {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yntype code;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yesnotype description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yntype getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(Yntype value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yesnotype getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(Yesnotype value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Roadsidedeposits {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Seatbeltoffence {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="title" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="120"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="additionalkeywords" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="additionalkeyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="standardoffencewording" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="legislation" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="350"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="pointstoprove" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="investigatoractions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="investigatoraction" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="policeandcpschargingresponsibilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="notes" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="4000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="standardstatementoffacts" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="4000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "",
                        propOrder = {"title", "additionalkeywords", "standardoffencewording",
                                        "legislation", "pointstoprove", "investigatoractions",
                                        "policeandcpschargingresponsibilities", "notes",
                                        "standardstatementoffacts"})
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public static class English {

            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String title;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.English.Additionalkeywords additionalkeywords;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String standardoffencewording;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String legislation;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String pointstoprove;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.English.Investigatoractions investigatoractions;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String policeandcpschargingresponsibilities;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String notes;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String standardstatementoffacts;

            /**
             * Gets the value of the title property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the additionalkeywords property.
             *
             * @return possible object is {@link Documents.Document.English.Additionalkeywords }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.English.Additionalkeywords getAdditionalkeywords() {
                return additionalkeywords;
            }

            /**
             * Sets the value of the additionalkeywords property.
             *
             * @param value allowed object is {@link Documents.Document.English.Additionalkeywords }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setAdditionalkeywords(Documents.Document.English.Additionalkeywords value) {
                this.additionalkeywords = value;
            }

            /**
             * Gets the value of the standardoffencewording property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getStandardoffencewording() {
                return standardoffencewording;
            }

            /**
             * Sets the value of the standardoffencewording property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setStandardoffencewording(String value) {
                this.standardoffencewording = value;
            }

            /**
             * Gets the value of the legislation property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getLegislation() {
                return legislation;
            }

            /**
             * Sets the value of the legislation property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setLegislation(String value) {
                this.legislation = value;
            }

            /**
             * Gets the value of the pointstoprove property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getPointstoprove() {
                return pointstoprove;
            }

            /**
             * Sets the value of the pointstoprove property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPointstoprove(String value) {
                this.pointstoprove = value;
            }

            /**
             * Gets the value of the investigatoractions property.
             *
             * @return possible object is {@link Documents.Document.English.Investigatoractions }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.English.Investigatoractions getInvestigatoractions() {
                return investigatoractions;
            }

            /**
             * Sets the value of the investigatoractions property.
             *
             * @param value allowed object is
             *        {@link Documents.Document.English.Investigatoractions }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setInvestigatoractions(
                            Documents.Document.English.Investigatoractions value) {
                this.investigatoractions = value;
            }

            /**
             * Gets the value of the policeandcpschargingresponsibilities property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getPoliceandcpschargingresponsibilities() {
                return policeandcpschargingresponsibilities;
            }

            /**
             * Sets the value of the policeandcpschargingresponsibilities property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPoliceandcpschargingresponsibilities(String value) {
                this.policeandcpschargingresponsibilities = value;
            }

            /**
             * Gets the value of the notes property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getNotes() {
                return notes;
            }

            /**
             * Sets the value of the notes property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setNotes(String value) {
                this.notes = value;
            }

            /**
             * Gets the value of the standardstatementoffacts property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getStandardstatementoffacts() {
                return standardstatementoffacts;
            }

            /**
             * Sets the value of the standardstatementoffacts property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setStandardstatementoffacts(String value) {
                this.standardstatementoffacts = value;
            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="additionalkeyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"additionalkeyword"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Additionalkeywords {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected List<String> additionalkeyword;

                /**
                 * Gets the value of the additionalkeyword property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list, not a snapshot.
                 * Therefore any modification you make to the returned list will be present inside
                 * the JAXB object. This is why there is not a <CODE>set</CODE> method for the
                 * additionalkeyword property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getAdditionalkeyword().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list {@link String }
                 *
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public List<String> getAdditionalkeyword() {
                    if (additionalkeyword == null) {
                        additionalkeyword = new ArrayList<String>();
                    }
                    return this.additionalkeyword;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="investigatoraction" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"investigatoraction"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Investigatoractions {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected List<Documents.Document.English.Investigatoractions.Investigatoraction> investigatoraction;

                /**
                 * Gets the value of the investigatoraction property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list, not a snapshot.
                 * Therefore any modification you make to the returned list will be present inside
                 * the JAXB object. This is why there is not a <CODE>set</CODE> method for the
                 * investigatoraction property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getInvestigatoraction().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Documents.Document.English.Investigatoractions.Investigatoraction }
                 *
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public List<Documents.Document.English.Investigatoractions.Investigatoraction> getInvestigatoraction() {
                    if (investigatoraction == null) {
                        investigatoraction =
                                        new ArrayList<Documents.Document.English.Investigatoractions.Investigatoraction>();
                    }
                    return this.investigatoraction;
                }


                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content contained within
                 * this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {"code", "description"})
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public static class Investigatoraction {

                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String code;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String description;

                    /**
                     * Gets the value of the code property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the description property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setDescription(String value) {
                        this.description = value;
                    }

                }

            }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="indictmentindicator" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{}yntype"/>
         *                   &lt;element name="description" type="{}yesnotype"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="structuredindictmentindicator" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{}yntype"/>
         *                   &lt;element name="description" type="{}yesnotype"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="indictmenttitle" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="welshindictmenttitle" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indictmentcountcode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="0"/>
         *               &lt;maxLength value="13"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="unstructuredindictmentstandardwording" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="structuredindictmentstandardwording" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="welshunstructuredindictmentstandardwording" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="welshstructuredindictmentstandardwording" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "",
                        propOrder = {"indictmentindicator", "structuredindictmentindicator",
                                        "indictmenttitle", "welshindictmenttitle",
                                        "indictmentcountcode",
                                        "unstructuredindictmentstandardwording",
                                        "structuredindictmentstandardwording",
                                        "welshunstructuredindictmentstandardwording",
                                        "welshstructuredindictmentstandardwording"})
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Indictment {

            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Indictment.Indictmentindicator indictmentindicator;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Indictment.Structuredindictmentindicator structuredindictmentindicator;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String indictmenttitle;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String welshindictmenttitle;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String indictmentcountcode;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String unstructuredindictmentstandardwording;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String structuredindictmentstandardwording;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String welshunstructuredindictmentstandardwording;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String welshstructuredindictmentstandardwording;

            /**
             * Gets the value of the indictmentindicator property.
             *
             * @return possible object is {@link Documents.Document.Indictment.Indictmentindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Indictment.Indictmentindicator getIndictmentindicator() {
                return indictmentindicator;
            }

            /**
             * Sets the value of the indictmentindicator property.
             *
             * @param value allowed object is
             *        {@link Documents.Document.Indictment.Indictmentindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setIndictmentindicator(
                            Documents.Document.Indictment.Indictmentindicator value) {
                this.indictmentindicator = value;
            }

            /**
             * Gets the value of the structuredindictmentindicator property.
             *
             * @return possible object is
             *         {@link Documents.Document.Indictment.Structuredindictmentindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Indictment.Structuredindictmentindicator getStructuredindictmentindicator() {
                return structuredindictmentindicator;
            }

            /**
             * Sets the value of the structuredindictmentindicator property.
             *
             * @param value allowed object is
             *        {@link Documents.Document.Indictment.Structuredindictmentindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setStructuredindictmentindicator(
                            Documents.Document.Indictment.Structuredindictmentindicator value) {
                this.structuredindictmentindicator = value;
            }

            /**
             * Gets the value of the indictmenttitle property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getIndictmenttitle() {
                return indictmenttitle;
            }

            /**
             * Sets the value of the indictmenttitle property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setIndictmenttitle(String value) {
                this.indictmenttitle = value;
            }

            /**
             * Gets the value of the welshindictmenttitle property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getWelshindictmenttitle() {
                return welshindictmenttitle;
            }

            /**
             * Sets the value of the welshindictmenttitle property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWelshindictmenttitle(String value) {
                this.welshindictmenttitle = value;
            }

            /**
             * Gets the value of the indictmentcountcode property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getIndictmentcountcode() {
                return indictmentcountcode;
            }

            /**
             * Sets the value of the indictmentcountcode property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setIndictmentcountcode(String value) {
                this.indictmentcountcode = value;
            }

            /**
             * Gets the value of the unstructuredindictmentstandardwording property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getUnstructuredindictmentstandardwording() {
                return unstructuredindictmentstandardwording;
            }

            /**
             * Sets the value of the unstructuredindictmentstandardwording property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setUnstructuredindictmentstandardwording(String value) {
                this.unstructuredindictmentstandardwording = value;
            }

            /**
             * Gets the value of the structuredindictmentstandardwording property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getStructuredindictmentstandardwording() {
                return structuredindictmentstandardwording;
            }

            /**
             * Sets the value of the structuredindictmentstandardwording property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setStructuredindictmentstandardwording(String value) {
                this.structuredindictmentstandardwording = value;
            }

            /**
             * Gets the value of the welshunstructuredindictmentstandardwording property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getWelshunstructuredindictmentstandardwording() {
                return welshunstructuredindictmentstandardwording;
            }

            /**
             * Sets the value of the welshunstructuredindictmentstandardwording property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWelshunstructuredindictmentstandardwording(String value) {
                this.welshunstructuredindictmentstandardwording = value;
            }

            /**
             * Gets the value of the welshstructuredindictmentstandardwording property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getWelshstructuredindictmentstandardwording() {
                return welshstructuredindictmentstandardwording;
            }

            /**
             * Sets the value of the welshstructuredindictmentstandardwording property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWelshstructuredindictmentstandardwording(String value) {
                this.welshstructuredindictmentstandardwording = value;
            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{}yntype"/>
             *         &lt;element name="description" type="{}yesnotype"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Indictmentindicator {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yntype code;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yesnotype description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yntype getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(Yntype value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yesnotype getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(Yesnotype value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{}yntype"/>
             *         &lt;element name="description" type="{}yesnotype"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Structuredindictmentindicator {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yntype code;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yesnotype description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yntype getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(Yntype value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yesnotype getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(Yesnotype value) {
                    this.description = value;
                }

            }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="libracategory" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fineindicator" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{}yntype">
         *                         &lt;length value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{}yesnotype"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maxfinetypemagct" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maxfinemagct" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minInclusive value="0.01"/>
         *               &lt;fractionDigits value="2"/>
         *               &lt;maxExclusive value="1000000000000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="maxfinetypecrownct" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maxfinecrownct" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minInclusive value="0.01"/>
         *               &lt;fractionDigits value="2"/>
         *               &lt;maxExclusive value="1000000000000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="custodialindicator" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{}yntype"/>
         *                   &lt;element name="description" type="{}yesnotype"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maxcustodialsentenceunitmagct" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="4"/>
         *                         &lt;maxLength value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maxcustodialsentencelengthmagct" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="1"/>
         *               &lt;maxInclusive value="999"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="maxcustodialsentenceunitcrownct" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="4"/>
         *                         &lt;maxLength value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maxcustodialsentencelengthcrownct" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="1"/>
         *               &lt;maxInclusive value="999"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="complexpenaltydetails" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="4000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="miscode" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="hoproceedingscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "",
                        propOrder = {"libracategory", "fineindicator", "maxfinetypemagct",
                                        "maxfinemagct", "maxfinetypecrownct", "maxfinecrownct",
                                        "custodialindicator", "maxcustodialsentenceunitmagct",
                                        "maxcustodialsentencelengthmagct",
                                        "maxcustodialsentenceunitcrownct",
                                        "maxcustodialsentencelengthcrownct",
                                        "complexpenaltydetails", "miscode", "hoproceedingscode"})
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Libra {

            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Libra.Libracategory libracategory;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Libra.Fineindicator fineindicator;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Libra.Maxfinetypemagct maxfinetypemagct;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected BigDecimal maxfinemagct;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Libra.Maxfinetypecrownct maxfinetypecrownct;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected BigDecimal maxfinecrownct;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Libra.Custodialindicator custodialindicator;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Libra.Maxcustodialsentenceunitmagct maxcustodialsentenceunitmagct;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Integer maxcustodialsentencelengthmagct;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Libra.Maxcustodialsentenceunitcrownct maxcustodialsentenceunitcrownct;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Integer maxcustodialsentencelengthcrownct;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String complexpenaltydetails;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Libra.Miscode miscode;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String hoproceedingscode;

            /**
             * Gets the value of the libracategory property.
             *
             * @return possible object is {@link Documents.Document.Libra.Libracategory }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Libra.Libracategory getLibracategory() {
                return libracategory;
            }

            /**
             * Sets the value of the libracategory property.
             *
             * @param value allowed object is {@link Documents.Document.Libra.Libracategory }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setLibracategory(Documents.Document.Libra.Libracategory value) {
                this.libracategory = value;
            }

            /**
             * Gets the value of the fineindicator property.
             *
             * @return possible object is {@link Documents.Document.Libra.Fineindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Libra.Fineindicator getFineindicator() {
                return fineindicator;
            }

            /**
             * Sets the value of the fineindicator property.
             *
             * @param value allowed object is {@link Documents.Document.Libra.Fineindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setFineindicator(Documents.Document.Libra.Fineindicator value) {
                this.fineindicator = value;
            }

            /**
             * Gets the value of the maxfinetypemagct property.
             *
             * @return possible object is {@link Documents.Document.Libra.Maxfinetypemagct }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Libra.Maxfinetypemagct getMaxfinetypemagct() {
                return maxfinetypemagct;
            }

            /**
             * Sets the value of the maxfinetypemagct property.
             *
             * @param value allowed object is {@link Documents.Document.Libra.Maxfinetypemagct }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxfinetypemagct(Documents.Document.Libra.Maxfinetypemagct value) {
                this.maxfinetypemagct = value;
            }

            /**
             * Gets the value of the maxfinemagct property.
             *
             * @return possible object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public BigDecimal getMaxfinemagct() {
                return maxfinemagct;
            }

            /**
             * Sets the value of the maxfinemagct property.
             *
             * @param value allowed object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxfinemagct(BigDecimal value) {
                this.maxfinemagct = value;
            }

            /**
             * Gets the value of the maxfinetypecrownct property.
             *
             * @return possible object is {@link Documents.Document.Libra.Maxfinetypecrownct }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Libra.Maxfinetypecrownct getMaxfinetypecrownct() {
                return maxfinetypecrownct;
            }

            /**
             * Sets the value of the maxfinetypecrownct property.
             *
             * @param value allowed object is {@link Documents.Document.Libra.Maxfinetypecrownct }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxfinetypecrownct(Documents.Document.Libra.Maxfinetypecrownct value) {
                this.maxfinetypecrownct = value;
            }

            /**
             * Gets the value of the maxfinecrownct property.
             *
             * @return possible object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public BigDecimal getMaxfinecrownct() {
                return maxfinecrownct;
            }

            /**
             * Sets the value of the maxfinecrownct property.
             *
             * @param value allowed object is {@link BigDecimal }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxfinecrownct(BigDecimal value) {
                this.maxfinecrownct = value;
            }

            /**
             * Gets the value of the custodialindicator property.
             *
             * @return possible object is {@link Documents.Document.Libra.Custodialindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Libra.Custodialindicator getCustodialindicator() {
                return custodialindicator;
            }

            /**
             * Sets the value of the custodialindicator property.
             *
             * @param value allowed object is {@link Documents.Document.Libra.Custodialindicator }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setCustodialindicator(Documents.Document.Libra.Custodialindicator value) {
                this.custodialindicator = value;
            }

            /**
             * Gets the value of the maxcustodialsentenceunitmagct property.
             *
             * @return possible object is
             *         {@link Documents.Document.Libra.Maxcustodialsentenceunitmagct }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Libra.Maxcustodialsentenceunitmagct getMaxcustodialsentenceunitmagct() {
                return maxcustodialsentenceunitmagct;
            }

            /**
             * Sets the value of the maxcustodialsentenceunitmagct property.
             *
             * @param value allowed object is
             *        {@link Documents.Document.Libra.Maxcustodialsentenceunitmagct }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxcustodialsentenceunitmagct(
                            Documents.Document.Libra.Maxcustodialsentenceunitmagct value) {
                this.maxcustodialsentenceunitmagct = value;
            }

            /**
             * Gets the value of the maxcustodialsentencelengthmagct property.
             *
             * @return possible object is {@link Integer }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Integer getMaxcustodialsentencelengthmagct() {
                return maxcustodialsentencelengthmagct;
            }

            /**
             * Sets the value of the maxcustodialsentencelengthmagct property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxcustodialsentencelengthmagct(Integer value) {
                this.maxcustodialsentencelengthmagct = value;
            }

            /**
             * Gets the value of the maxcustodialsentenceunitcrownct property.
             *
             * @return possible object is
             *         {@link Documents.Document.Libra.Maxcustodialsentenceunitcrownct }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Libra.Maxcustodialsentenceunitcrownct getMaxcustodialsentenceunitcrownct() {
                return maxcustodialsentenceunitcrownct;
            }

            /**
             * Sets the value of the maxcustodialsentenceunitcrownct property.
             *
             * @param value allowed object is
             *        {@link Documents.Document.Libra.Maxcustodialsentenceunitcrownct }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxcustodialsentenceunitcrownct(
                            Documents.Document.Libra.Maxcustodialsentenceunitcrownct value) {
                this.maxcustodialsentenceunitcrownct = value;
            }

            /**
             * Gets the value of the maxcustodialsentencelengthcrownct property.
             *
             * @return possible object is {@link Integer }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Integer getMaxcustodialsentencelengthcrownct() {
                return maxcustodialsentencelengthcrownct;
            }

            /**
             * Sets the value of the maxcustodialsentencelengthcrownct property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMaxcustodialsentencelengthcrownct(Integer value) {
                this.maxcustodialsentencelengthcrownct = value;
            }

            /**
             * Gets the value of the complexpenaltydetails property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getComplexpenaltydetails() {
                return complexpenaltydetails;
            }

            /**
             * Sets the value of the complexpenaltydetails property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setComplexpenaltydetails(String value) {
                this.complexpenaltydetails = value;
            }

            /**
             * Gets the value of the miscode property.
             *
             * @return possible object is {@link Documents.Document.Libra.Miscode }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Libra.Miscode getMiscode() {
                return miscode;
            }

            /**
             * Sets the value of the miscode property.
             *
             * @param value allowed object is {@link Documents.Document.Libra.Miscode }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMiscode(Documents.Document.Libra.Miscode value) {
                this.miscode = value;
            }

            /**
             * Gets the value of the hoproceedingscode property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getHoproceedingscode() {
                return hoproceedingscode;
            }

            /**
             * Sets the value of the hoproceedingscode property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setHoproceedingscode(String value) {
                this.hoproceedingscode = value;
            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{}yntype"/>
             *         &lt;element name="description" type="{}yesnotype"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Custodialindicator {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yntype code;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yesnotype description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yntype getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(Yntype value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yesnotype getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(Yesnotype value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{}yntype">
             *               &lt;length value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{}yesnotype"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Fineindicator {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yntype code;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected Yesnotype description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yntype getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link Yntype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(Yntype value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public Yesnotype getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link Yesnotype }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(Yesnotype value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Libracategory {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="4"/>
             *               &lt;maxLength value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Maxcustodialsentenceunitcrownct {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="4"/>
             *               &lt;maxLength value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Maxcustodialsentenceunitmagct {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Maxfinetypecrownct {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Maxfinetypemagct {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Miscode {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="powersofarrest" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="modeoftrial" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="consents" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="consent" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="code">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="timelimitforprosecutions" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="penalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="geographicregion" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"powersofarrest", "modeoftrial", "consents",
                        "timelimitforprosecutions", "penalty", "geographicregion"})
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Other {

            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String powersofarrest;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Other.Modeoftrial modeoftrial;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Other.Consents consents;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String timelimitforprosecutions;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String penalty;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected Documents.Document.Other.Geographicregion geographicregion;

            /**
             * Gets the value of the powersofarrest property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getPowersofarrest() {
                return powersofarrest;
            }

            /**
             * Sets the value of the powersofarrest property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPowersofarrest(String value) {
                this.powersofarrest = value;
            }

            /**
             * Gets the value of the modeoftrial property.
             *
             * @return possible object is {@link Documents.Document.Other.Modeoftrial }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Other.Modeoftrial getModeoftrial() {
                return modeoftrial;
            }

            /**
             * Sets the value of the modeoftrial property.
             *
             * @param value allowed object is {@link Documents.Document.Other.Modeoftrial }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setModeoftrial(Documents.Document.Other.Modeoftrial value) {
                this.modeoftrial = value;
            }

            /**
             * Gets the value of the consents property.
             *
             * @return possible object is {@link Documents.Document.Other.Consents }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Other.Consents getConsents() {
                return consents;
            }

            /**
             * Sets the value of the consents property.
             *
             * @param value allowed object is {@link Documents.Document.Other.Consents }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setConsents(Documents.Document.Other.Consents value) {
                this.consents = value;
            }

            /**
             * Gets the value of the timelimitforprosecutions property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getTimelimitforprosecutions() {
                return timelimitforprosecutions;
            }

            /**
             * Sets the value of the timelimitforprosecutions property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setTimelimitforprosecutions(String value) {
                this.timelimitforprosecutions = value;
            }

            /**
             * Gets the value of the penalty property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getPenalty() {
                return penalty;
            }

            /**
             * Sets the value of the penalty property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPenalty(String value) {
                this.penalty = value;
            }

            /**
             * Gets the value of the geographicregion property.
             *
             * @return possible object is {@link Documents.Document.Other.Geographicregion }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public Documents.Document.Other.Geographicregion getGeographicregion() {
                return geographicregion;
            }

            /**
             * Sets the value of the geographicregion property.
             *
             * @param value allowed object is {@link Documents.Document.Other.Geographicregion }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setGeographicregion(Documents.Document.Other.Geographicregion value) {
                this.geographicregion = value;
            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="consent" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="code">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"consent"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Consents {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected List<Documents.Document.Other.Consents.Consent> consent;

                /**
                 * Gets the value of the consent property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list, not a snapshot.
                 * Therefore any modification you make to the returned list will be present inside
                 * the JAXB object. This is why there is not a <CODE>set</CODE> method for the
                 * consent property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getConsent().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Documents.Document.Other.Consents.Consent }
                 *
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public List<Documents.Document.Other.Consents.Consent> getConsent() {
                    if (consent == null) {
                        consent = new ArrayList<Documents.Document.Other.Consents.Consent>();
                    }
                    return this.consent;
                }


                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content contained within
                 * this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="code">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {"code", "description"})
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public static class Consent {

                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String code;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String description;

                    /**
                     * Gets the value of the code property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the description property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                    date = "2016-02-12T11:41:43+00:00",
                                    comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setDescription(String value) {
                        this.description = value;
                    }

                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Geographicregion {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content contained within this
             * class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"code", "description"})
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Modeoftrial {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String code;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                protected String description;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver",
                                date = "2016-02-12T11:41:43+00:00",
                                comments = "JAXB RI v2.2.8-b130911.1802")
                public void setDescription(String value) {
                    this.description = value;
                }

            }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="welshoffencetitle" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="120"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="welshstandardoffencewording" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2500"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="welshstandardstatementoffacts" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="4000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="welshlegislation" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="350"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"welshoffencetitle", "welshstandardoffencewording",
                        "welshstandardstatementoffacts", "welshlegislation"})
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-02-12T11:41:43+00:00",
                        comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Welsh {

            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String welshoffencetitle;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String welshstandardoffencewording;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String welshstandardstatementoffacts;
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            protected String welshlegislation;

            /**
             * Gets the value of the welshoffencetitle property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getWelshoffencetitle() {
                return welshoffencetitle;
            }

            /**
             * Sets the value of the welshoffencetitle property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWelshoffencetitle(String value) {
                this.welshoffencetitle = value;
            }

            /**
             * Gets the value of the welshstandardoffencewording property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getWelshstandardoffencewording() {
                return welshstandardoffencewording;
            }

            /**
             * Sets the value of the welshstandardoffencewording property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWelshstandardoffencewording(String value) {
                this.welshstandardoffencewording = value;
            }

            /**
             * Gets the value of the welshstandardstatementoffacts property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getWelshstandardstatementoffacts() {
                return welshstandardstatementoffacts;
            }

            /**
             * Sets the value of the welshstandardstatementoffacts property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWelshstandardstatementoffacts(String value) {
                this.welshstandardstatementoffacts = value;
            }

            /**
             * Gets the value of the welshlegislation property.
             *
             * @return possible object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public String getWelshlegislation() {
                return welshlegislation;
            }

            /**
             * Sets the value of the welshlegislation property.
             *
             * @param value allowed object is {@link String }
             *
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver",
                            date = "2016-02-12T11:41:43+00:00",
                            comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWelshlegislation(String value) {
                this.welshlegislation = value;
            }

        }

    }

}
