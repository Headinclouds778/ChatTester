// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/OAuthRequest_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:21:21 GMT 2024
 */
package org.jinstagram.auth.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.Map;
import org.jinstagram.auth.model.Verbs;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.http.Verbs;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class OAuthRequest_ESTest extends OAuthRequest_ESTest_scaffolding {
    @Test
    public void testAddOAuthParameter() {
        OAuthRequest oauthRequest = new OAuthRequest(Verbs.GET, "https://example.com");
        oauthRequest.addOAuthParameter("validKey", "value");

        Map<String, String> oauthParameters = oauthRequest.getOauthParameters();

        assertTrue(oauthParameters.containsKey("validKey"));
        assertEquals("value", oauthParameters.get("validKey"));
    }
}