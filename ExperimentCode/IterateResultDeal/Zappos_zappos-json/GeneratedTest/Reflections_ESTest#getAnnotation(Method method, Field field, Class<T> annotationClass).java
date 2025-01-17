// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:11:21 GMT 2024
 */
package com.zappos.json.util;









import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.util.Reflections;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Reflections_ESTest extends Reflections_ESTest_scaffolding {
    


    
    
    
    
        @TestAnnotation
        public String testField;
}

    
    
    @Test
    public void testGetAnnotation_FieldAnnotationPrioritizedOverMethodAnnotation() throws NoSuchFieldException, NoSuchMethodException {
        Field field = ReflectionsTest.class.getDeclaredField("testField");
        Method method = Reflections.class.getDeclaredMethod("getAnnotation", Method.class, Field.class, Class.class);

        TestAnnotation fieldAnnotation = field.getAnnotation(TestAnnotation.class);
        assertNull(method.getAnnotation(TestAnnotation.class));

        TestAnnotation result = Reflections.getAnnotation(method, field, TestAnnotation.class);

        assertEquals(fieldAnnotation, result);
    }
}
