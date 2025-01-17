// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/OAuthConfig_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:18:36 GMT 2024
 */
package org.jinstagram.auth.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.net.Proxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.auth.model.OAuthConfig;
import org.junit.runner.RunWith;

import java.net.Proxy;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.net.Proxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.auth.model.OAuthConfig;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class OAuthConfig_ESTest extends OAuthConfig_ESTest_scaffolding {

    @Test
    public void testHasScope() {
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret");
        assertFalse(oauthConfig.hasScope());
        
        OAuthConfig oauthConfigWithScope = new OAuthConfig("key", "secret", "callback", "scope");
        assertTrue(oauthConfigWithScope.hasScope());
    }

    @Test
    public void testGetApiKey() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret");

        // Call the getApiKey() method
        String apiKey = oauthConfig.getApiKey();

        // Assert that the returned apiKey is not null
        assertNotNull(apiKey);

        // Assert that the returned apiKey is equal to the expected value
        assertEquals("key", apiKey);
    }

    @Test
    public void testGetDisplay() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret", "callback", "scope", "display");

        // Call the getDisplay() method
        String display = oauthConfig.getDisplay();

        // Assert that the returned value is not null
        assertNotNull(display);

        // Assert that the returned value is equal to the expected value
        assertEquals("display", display);
    }

    @Test
    public void testGetCallback() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret", "callback", "scope", "display");

        // Call the getCallback() method
        String callback = oauthConfig.getCallback();

        // Assert that the returned callback is equal to the expected callback
        assertEquals("callback", callback);
    }

    @Test
    public void testGetScope() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret", "callback", "scope", "display");

        // Call the getScope() method
        String scope = oauthConfig.getScope();

        // Assert that the returned scope is not null
        assertNotNull(scope);

        // Assert that the returned scope is equal to the expected scope
        assertEquals("scope", scope);
    }

    @Test
    public void testGetApiSecret() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret");

        // Call the getApiSecret() method
        String apiSecret = oauthConfig.getApiSecret();

        // Assert that the returned value is equal to the secret provided during initialization
        assertEquals("secret", apiSecret);
    }

    @Test
    public void testGetRequestProxy() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret");

        // Set the request proxy
        Proxy proxy = Proxy.NO_PROXY;
        oauthConfig.setRequestProxy(proxy);

        // Get the request proxy
        Proxy result = oauthConfig.getRequestProxy();

        // Assert that the returned proxy is the same as the one set
        assertEquals(proxy, result);
    }

    @Test
    public void testSetRequestProxy() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret");

        // Create a Proxy object
        Proxy proxy = Proxy.NO_PROXY;

        // Set the Proxy object using the setRequestProxy method
        oauthConfig.setRequestProxy(proxy);

        // Verify that the Proxy object is set correctly
        assertEquals(proxy, oauthConfig.getRequestProxy());
    }

}
