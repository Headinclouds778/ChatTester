// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/realtime/SubscriptionUtil_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:08:27 GMT 2024
 */
package org.jinstagram.realtime;




import java.util.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.realtime.SubscriptionUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SubscriptionUtil_ESTest extends SubscriptionUtil_ESTest_scaffolding {
    


    
    
    @Test
    public void testGetCalculatedSignature() {
        // Given
        String expectedSignature = "exampleSignature";
        VerificationResult verificationResult = new VerificationResult(true, expectedSignature);

        // When
        String actualSignature = verificationResult.getCalculatedSignature();

        // Then
        assertEquals(expectedSignature, actualSignature);
    }
}