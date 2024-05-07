/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:37:35 GMT 2024
 */

package org.jinstagram.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.exceptions.InstagramRateLimitException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class InstagramRateLimitException_ESTest extends InstagramRateLimitException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstagramRateLimitException instagramRateLimitException0 = new InstagramRateLimitException("");
      InstagramRateLimitException instagramRateLimitException1 = new InstagramRateLimitException("S,/N-V6=*TO", instagramRateLimitException0);
      assertFalse(instagramRateLimitException1.equals((Object)instagramRateLimitException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InstagramRateLimitException instagramRateLimitException0 = new InstagramRateLimitException("S,/N-V6=*TO", (Map<String, String>) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      InstagramRateLimitException instagramRateLimitException0 = new InstagramRateLimitException("", (String) null, hashMap0);
      InstagramRateLimitException instagramRateLimitException1 = new InstagramRateLimitException("kCb?%YZ$", instagramRateLimitException0, hashMap0);
      assertFalse(instagramRateLimitException1.equals((Object)instagramRateLimitException0));
  }
}