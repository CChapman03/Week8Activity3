package com.ciaranchapman.week8activity3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ndfdXMlBindingStubTest
{
    @Test
    public void latLongListZipCode() throws Exception
    {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53711");
        assertEquals("Result did not match expected value", JAXBXMLToJava.getLatLong(), result);
    }
}
