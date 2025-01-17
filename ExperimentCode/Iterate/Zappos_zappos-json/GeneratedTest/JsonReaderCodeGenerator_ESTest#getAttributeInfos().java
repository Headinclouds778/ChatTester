// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:55:24 GMT 2024
 */
package com.zappos.json;




import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonBeanAttribute;
import com.zappos.json.JsonBeanIntrospector;
import com.zappos.json.JsonReaderCodeGenerator;
import com.zappos.json.JsonReaderInvoker;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaTimeInstantFormatter;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonReaderCodeGenerator_ESTest extends JsonReaderCodeGenerator_ESTest_scaffolding {
    


    
    
    @Test
    public void testGetAttributeInfos() {
        // Create a TypeInfo instance with a specific type
        Class<?> type = String.class;
        TypeInfo typeInfo = new TypeInfo(type);

        // Add some AttributeInfo objects to the TypeInfo instance
        AttributeInfo attrInfo1 = new AttributeInfo("attr1");
        AttributeInfo attrInfo2 = new AttributeInfo("attr2");
        typeInfo.getAttributeInfos().add(attrInfo1);
        typeInfo.getAttributeInfos().add(attrInfo2);

        // Retrieve the AttributeInfo objects using getAttributeInfos()
        List<AttributeInfo> attributeInfos = typeInfo.getAttributeInfos();

        // Check if the retrieved list contains the added AttributeInfo objects
        assertEquals(2, attributeInfos.size());
        assertTrue(attributeInfos.contains(attrInfo1));
        assertTrue(attributeInfos.contains(attrInfo2));
    }
}
