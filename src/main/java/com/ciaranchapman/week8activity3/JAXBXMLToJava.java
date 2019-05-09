package com.ciaranchapman.week8activity3;

import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
 
public class JAXBXMLToJava
{
 public static String getLatLong()
 {
  String latlong = "";

  try {
 
   // create JAXB context and initializing Marshaller
   JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
 
   Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
 
   // specify the location and name of xml file to be read
   //File XMLfile = new File("com/ciaranchapman/week8activity3/latLonResponse.xsd");
 
   // this will create Java object - country from the XML file
   DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader("com/ciaranchapman/week8activity3/latLonResponse.xsd"));

   latlong = dwml.getLatLonList();

   System.out.println(latlong);

  }
  catch (JAXBException e)
  {
   // some exception occured
   e.printStackTrace();
  }

  return latlong;
 }
}