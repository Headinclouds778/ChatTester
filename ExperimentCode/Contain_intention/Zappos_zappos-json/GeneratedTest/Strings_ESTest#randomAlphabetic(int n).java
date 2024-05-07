// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/Strings_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:13:31 GMT 2024
 */
package com.zappos.json.util;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.util.Strings;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Strings_ESTest extends Strings_ESTest_scaffolding {
    @Test
    public void testRandomAlphabetic() {
        int n = 10;
        String randomString = Strings.randomAlphabetic(n);

        // Check if the generated string has the correct length
        assertEquals(n, randomString.length());

        // Check if all characters in the generated string are alphabetic
        for (char c : randomString.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }

        // Check if the generated string contains only uppercase or lowercase letters
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        for (char c : randomString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }
        assertTrue(hasUpperCase && hasLowerCase);
    }
}