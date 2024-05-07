/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:15:21 GMT 2024
 */
package org.jinstagram.auth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.Proxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jinstagram.auth.InstagramAuthService;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class InstagramAuthService_ESTest extends InstagramAuthService_ESTest_scaffolding {
    @Test(expected = IllegalArgumentException.class) public void apiKey_Null() { 
    InstagramAuthService service = new InstagramAuthService();
    service.apiKey(null);
    }
    
    
    @Test(expected = IllegalArgumentException.class) public void testDisplayNull() { 
    InstagramAuthService service = new InstagramAuthService();
    service.display(null);
    }
    
    
    @Test 
    public void testCallback() { 
    InstagramAuthService service = new InstagramAuthService();
    String callback = "oob";
    service.callback(callback);
    }
    
    
    @Test 
    public void apiSecret() { 
    InstagramAuthService service = new InstagramAuthService();
    service.apiSecret("secret");
    }
    
}