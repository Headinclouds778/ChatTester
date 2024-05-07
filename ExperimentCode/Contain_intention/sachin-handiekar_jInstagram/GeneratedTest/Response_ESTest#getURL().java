// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Response_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:44:51 GMT 2024
 */
package org.jinstagram.http;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jinstagram.http.Response;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Response_ESTest extends Response_ESTest_scaffolding {
    @Test
    public void testGetURL() throws IOException {
        // Mocking connection
        URL mockURL = new URL("http://example.com");
        Mockito.when(mockConnection.getURL()).thenReturn(mockURL);

        // Creating Response object
        Response response = new Response(mockConnection);

        // Testing getURL() method
        String expectedURL = "http://example.com";
        String actualURL = response.getURL();

        assertNotNull(actualURL);
        assertEquals(expectedURL, actualURL);
    }
}