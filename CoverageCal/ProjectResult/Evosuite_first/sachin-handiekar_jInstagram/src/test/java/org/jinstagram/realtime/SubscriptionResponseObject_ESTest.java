/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:03:32 GMT 2024
 */
package org.jinstagram.realtime;


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.realtime.SubscriptionResponseObject;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class SubscriptionResponseObject_ESTest extends SubscriptionResponseObject_ESTest_scaffolding {


@Test(timeout = 4000)
public void test09() throws Throwable {
    SubscriptionResponseObject subscriptionResponseObject0 = new SubscriptionResponseObject();
    subscriptionResponseObject0.setChangedAspect("");
    String string0 = subscriptionResponseObject0.getChangedAspect();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test01() throws Throwable {
    SubscriptionResponseObject subscriptionResponseObject0 = new SubscriptionResponseObject();
    subscriptionResponseObject0.setSubscriptionId("");
    String string0 = subscriptionResponseObject0.getSubscriptionId();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test03() throws Throwable {
    SubscriptionResponseObject subscriptionResponseObject0 = new SubscriptionResponseObject();
    subscriptionResponseObject0.setObjectId("");
    String string0 = subscriptionResponseObject0.getObjectId();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test05() throws Throwable {
    SubscriptionResponseObject subscriptionResponseObject0 = new SubscriptionResponseObject();
    subscriptionResponseObject0.setObject("");
    String string0 = subscriptionResponseObject0.getObject();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test07() throws Throwable {
    SubscriptionResponseObject subscriptionResponseObject0 = new SubscriptionResponseObject();
    subscriptionResponseObject0.setEpochTime((-25L));
    long long0 = subscriptionResponseObject0.getEpochTime();
    assertEquals((-25L), long0);
}

}
