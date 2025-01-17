// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/format/NoOpValueFormatter_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:46:01 GMT 2024
 */
package com.zappos.json.format;
import com.zappos.json.ZapposJson;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.NoOpValueFormatter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class NoOpValueFormatter_ESTest extends NoOpValueFormatter_ESTest_scaffolding {
    @Test
    public void testFormat() {
        // Create a new instance of NoOpValueFormatter
        NoOpValueFormatter formatter = new NoOpValueFormatter();

        // Create a mock ZapposJson object
        ZapposJson zapposJson = new ZapposJson();

        // Create a mock object
        Object object = new Object();

        // Call the format method and assert that it throws UnsupportedOperationException
        try {
            formatter.format(zapposJson, object);
            fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Test passed
        }
    }
}
