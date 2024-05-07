/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:44:51 GMT 2024
 */

package org.jinstagram.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jinstagram.http.Response;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Response_ESTest extends Response_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("PROXY_AUTHENTICATION_REQUIRED", "'}W/9mpV:T", 0, "o%MEn", uRLStreamHandler0);
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(httpURLConnection0).getResponseCode();
      doReturn((Map) null).when(httpURLConnection0).getHeaderFields();
      doReturn(uRL0).when(httpURLConnection0).getURL();
      Response response0 = null;
      try {
        response0 = new Response(httpURLConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jinstagram.http.Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(httpURLConnection0).getResponseCode();
      doReturn((Map) null).when(httpURLConnection0).getHeaderFields();
      doReturn(uRL0).when(httpURLConnection0).getURL();
      Response response0 = null;
      try {
        response0 = new Response(httpURLConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jinstagram.http.Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URL uRL1 = MockURL.URL(uRL0, "OcsPHS=");
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(httpURLConnection0).getResponseCode();
      doReturn((Map) null).when(httpURLConnection0).getHeaderFields();
      doReturn(uRL1).when(httpURLConnection0).getURL();
      Response response0 = null;
      try {
        response0 = new Response(httpURLConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jinstagram.http.Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(httpURLConnection0).getResponseCode();
      doReturn((Map) null).when(httpURLConnection0).getHeaderFields();
      doReturn(uRL0).when(httpURLConnection0).getURL();
      Response response0 = null;
      try {
        response0 = new Response(httpURLConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jinstagram.http.Response", e);
      }
  }
}