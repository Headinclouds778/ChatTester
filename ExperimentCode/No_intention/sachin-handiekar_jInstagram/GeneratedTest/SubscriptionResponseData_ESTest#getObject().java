// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/realtime/SubscriptionResponseData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:02:29 GMT 2024
 */
package org.jinstagram.realtime;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.realtime.SubscriptionResponseData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SubscriptionResponseData_ESTest extends SubscriptionResponseData_ESTest_scaffolding {
@Test
public void testGetObject() {
    // Create an instance of SubscriptionResponseData
    SubscriptionResponseData responseData = new SubscriptionResponseData();

    // Set the value of the object property
    String expectedObject = "Test Object";
    responseData.setObject(expectedObject);

    // Call the getObject() method and assert the returned value
    String actualObject = responseData.getObject();
    assertEquals(expectedObject, actualObject);
}
}
