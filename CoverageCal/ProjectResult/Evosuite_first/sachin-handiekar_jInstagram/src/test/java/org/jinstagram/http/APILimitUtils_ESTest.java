/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:39:18 GMT 2024
 */
package org.jinstagram.http;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.http.APILimitUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class APILimitUtils_ESTest extends APILimitUtils_ESTest_scaffolding {


@Test(timeout = 4000)
public void test0() throws Throwable {
    // Undeclared exception!
    try {
        APILimitUtils.getRemainingLimitStatus((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("org.jinstagram.http.APILimitUtils", e);
    }
}


@Test(timeout = 4000)
public void test1() throws Throwable {
    HashMap<String, String> hashMap0 = new HashMap<String, String>();
    hashMap0.put("X-Ratelimit-Limit", "2");
    int int0 = APILimitUtils.getAPILimitStatus(hashMap0);
    assertEquals(2, int0);
}

}