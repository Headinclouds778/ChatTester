/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:18:36 GMT 2024
 */
package org.jinstagram.auth.model;

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
    public void testGetApiSecret() { 
    OAuthConfig config = new OAuthConfig("key", "secret");
    assertEquals("secret", config.getApiSecret());
    }
    
}
