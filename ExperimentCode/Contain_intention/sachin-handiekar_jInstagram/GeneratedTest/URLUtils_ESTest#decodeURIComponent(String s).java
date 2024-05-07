// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/URLUtils_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:48:19 GMT 2024
 */
package org.jinstagram.http;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.UnsupportedEncodingException;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.http.URLUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class URLUtils_ESTest extends URLUtils_ESTest_scaffolding {
    @Test
    public void testDecodeURIComponent() {
        // Given
        String encodedString = "Hello%20World%21";
        String expectedDecodedString = "Hello World!";

        // When
        String decodedString = URLUtils.decodeURIComponent(encodedString);

        // Then
        assertEquals(expectedDecodedString, decodedString);
    }
}