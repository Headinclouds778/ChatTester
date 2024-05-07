/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:43:07 GMT 2024
 */
package org.jinstagram.http;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jinstagram.http.Request;
import org.jinstagram.http.Verbs;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Request_ESTest extends Request_ESTest_scaffolding {


@Test(timeout = 4000)
public void test05() throws Throwable {
    Verbs verbs0 = Verbs.POST;
    Request request0 = new Request(verbs0, "(-)?[0-9]+(.)?[0-9]*");
    TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
    request0.setReadTimeout(2, timeUnit0);
    int int0 = request0.getReadTimeoutInMillis();
    assertEquals(2, int0);
}


@Test(timeout = 4000)
public void test12() throws Throwable {
    Verbs verbs0 = Verbs.POST;
    Request request0 = new Request(verbs0, "WU[liSYs?^dN(si:");
    request0.addBodyParameter("WU[liSYs?^dN(si:", "WU[liSYs?^dN(si:");
    request0.getBodyParams();
    assertFalse(request0.getConnectionKeepAlive());
}


@Test(timeout = 4000)
public void test00() throws Throwable {
    Verbs verbs0 = Verbs.GET;
    Request request0 = new Request(verbs0, "?.*");
    request0.addQuerystringParameter("?.*", (String) null);
    assertFalse(request0.getConnectionKeepAlive());
}


@Test(timeout = 4000)
public void test23() throws Throwable {
    Verbs verbs0 = Verbs.GET;
    Request request0 = new Request(verbs0, "");
    request0.getVerb();
    assertFalse(request0.getConnectionKeepAlive());
}


@Test(timeout = 4000)
public void test39() throws Throwable {
    Verbs verbs0 = Verbs.POST;
    Request request0 = new Request(verbs0, "WZ@'");
    // Undeclared exception!
    try {
        request0.addBody((HttpURLConnection) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("org.jinstagram.http.Request", e);
    }
}


@Test(timeout = 4000)
public void test41() throws Throwable {
    Verbs verbs0 = Verbs.DELETE;
    Request request0 = new Request(verbs0, "=a&(70B");
    // Undeclared exception!
    try {
        request0.getQueryStringParams();
        fail("Expecting exception: RuntimeException");
    } catch (RuntimeException e) {
        // 
        // Malformed URL
        // 
        verifyException("org.jinstagram.http.Request", e);
    }
}


@Test(timeout = 4000)
public void test34() throws Throwable {
    Verbs verbs0 = Verbs.POST;
    Request request0 = new Request(verbs0, "(-)?[0-9]+(.)?[0-9]*");
    request0.addPayload("4shh$?>PD+an^m");
    request0.getByteBodyContents();
    assertFalse(request0.getConnectionKeepAlive());
}


// @Test(timeout = 4000)
// public void test37() throws Throwable {
//     Verbs verbs0 = Verbs.POST;
//     Request request0 = new Request(verbs0, "(-)?[0-9]+(.)?[0-9]*");
//     // Undeclared exception!
//     try {
//         request0.send();
//         fail("Expecting exception: NoClassDefFoundError");
//     } catch (NoClassDefFoundError e) {
//         //
//         // org/apache/commons/lang3/StringUtils
//         //
//         verifyException("org.jinstagram.utils.Preconditions", e);
//     }
// }


@Test(timeout = 4000)
public void test07() throws Throwable {
    Verbs verbs0 = Verbs.POST;
    Request request0 = new Request(verbs0, "");
    Proxy proxy0 = Proxy.NO_PROXY;
    request0.setProxy(proxy0);
    request0.getProxy();
    assertFalse(request0.getConnectionKeepAlive());
}


@Test(timeout = 4000)
public void test33() throws Throwable {
    Verbs verbs0 = Verbs.POST;
    Request request0 = new Request(verbs0, "(-)?[0-9]+(.)?[0-9]*");
    request0.addHeader("(-)?[0-9]+(.)?[0-9]*", "(-)?[0-9]+(.)?[0-9]*");
    HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
    request0.addHeaders(httpURLConnection0);
    assertFalse(request0.getConnectionKeepAlive());
}


@Test(timeout = 4000)
public void test09() throws Throwable {
    Verbs verbs0 = Verbs.DELETE;
    Request request0 = new Request(verbs0, "Received an invalid parameter");
    TimeUnit timeUnit0 = TimeUnit.MINUTES;
    request0.setConnectTimeout(1, timeUnit0);
    int int0 = request0.getConnectTimeoutInMillis();
    assertEquals(60000, int0);
}


@Test(timeout = 4000)
public void test03() throws Throwable {
    Verbs verbs0 = Verbs.PUT;
    Request request0 = new Request(verbs0, "");
    request0.getUrl();
    assertFalse(request0.getConnectionKeepAlive());
}


@Test(timeout = 4000)
public void test19() throws Throwable {
    Verbs verbs0 = Verbs.PUT;
    Request request0 = new Request(verbs0, "http.keepAlive");
    HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
    request0.setConnection(httpURLConnection0);
    request0.addPayload("http.keepAlive");
    request0.setCharset("cd&*$V/4!MYsY!6");
    // Undeclared exception!
    try {
        request0.doSend();
        fail("Expecting exception: RuntimeException");
    } catch (RuntimeException e) {
        // 
        // Unsupported Charset: cd&*$V/4!MYsY!6
        // 
        verifyException("org.jinstagram.http.Request", e);
    }
}


@Test(timeout = 4000)
public void test14() throws Throwable {
    Verbs verbs0 = Verbs.POST;
    Request request0 = new Request(verbs0, "http.keepAlive");
    request0.addPayload("");
    request0.getBodyContents();
    assertFalse(request0.getConnectionKeepAlive());
}


@Test(timeout = 4000)
public void test27() throws Throwable {
    Verbs verbs0 = Verbs.GET;
    Request request0 = new Request(verbs0, "\"w)7V|[m?lIh;anl");
    request0.getHeaders();
    assertFalse(request0.getConnectionKeepAlive());
}


@Test(timeout = 4000)
public void test40() throws Throwable {
    Verbs verbs0 = Verbs.GET;
    Request request0 = new Request(verbs0, "\"w)7V|[m?lIh;anl");
    String string0 = request0.toString();
    assertFalse(request0.getConnectionKeepAlive());
    assertEquals("@Request(GET \"w)7V|[m?lIh;anl)", string0);
}


@Test(timeout = 4000)
public void test16() throws Throwable {
    Verbs verbs0 = Verbs.POST;
    Request request0 = new Request(verbs0, (String) null);
    // Undeclared exception!
    try {
        request0.getSanitizedUrl();
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("org.jinstagram.http.Request", e);
    }
}


@Test(timeout = 4000)
public void test10() throws Throwable {
    Verbs verbs0 = Verbs.DELETE;
    Request request0 = new Request(verbs0, "");
    request0.setCharset("");
    request0.getCharset();
    assertFalse(request0.getConnectionKeepAlive());
}

}