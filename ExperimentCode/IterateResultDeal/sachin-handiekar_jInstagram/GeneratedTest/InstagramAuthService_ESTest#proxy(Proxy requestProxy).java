// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/InstagramAuthService_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:15:21 GMT 2024
 */
package org.jinstagram.auth;




import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.net.Proxy;
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class InstagramAuthService_ESTest extends InstagramAuthService_ESTest_scaffolding {
    




    @Test
    public void testProxyMethod_SetRequestProxy_Success() {
        // Given
        InstagramAuthService authService = new InstagramAuthService();
        Proxy testProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));

        // When
        InstagramAuthService result = authService.proxy(testProxy);

        // Then
        assertNotNull(result);
        assertEquals(testProxy, authService.getRequestProxy());
    }
}