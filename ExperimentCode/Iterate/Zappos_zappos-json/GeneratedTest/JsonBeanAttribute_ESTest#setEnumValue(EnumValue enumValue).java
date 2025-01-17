// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/JsonBeanAttribute_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:48:09 GMT 2024
 */
package com.zappos.json;




import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonBeanAttribute;
import com.zappos.json.annot.JsonEnum;
import com.zappos.json.format.JavaDateFormatter;
import com.zappos.json.format.ValueFormatter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonBeanAttribute_ESTest extends JsonBeanAttribute_ESTest_scaffolding {
    


    
    
    @Test
    public void testSetEnumValue() {
        // Given
        EnumValue enumValue = new EnumValue(); // Create a new EnumValue instance
        JsonBeanAttribute jsonBeanAttribute = new JsonBeanAttribute(); // Create a new JsonBeanAttribute instance

        // When
        JsonBeanAttribute result = jsonBeanAttribute.setEnumValue(enumValue); // Call the setEnumValue method

        // Then
        assertSame(enumValue, result.enumValue); // Check if the enumValue property was set correctly
        assertSame(jsonBeanAttribute, result); // Check if the updated instance is returned for fluent chaining
    }
}
