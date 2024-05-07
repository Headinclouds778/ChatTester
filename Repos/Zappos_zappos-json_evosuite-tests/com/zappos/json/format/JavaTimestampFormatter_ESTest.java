/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:44:18 GMT 2024
 */

package com.zappos.json.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaTimestampFormatter;
import com.zappos.json.format.ValueFormatter;
import java.sql.Timestamp;
import java.text.ParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaTimestampFormatter_ESTest extends JavaTimestampFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      Timestamp timestamp0 = new Timestamp(0L);
      String string0 = javaTimestampFormatter0.format(zapposJson0, timestamp0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      Timestamp timestamp0 = new Timestamp(0L);
      Timestamp timestamp1 = javaTimestampFormatter0.cast(timestamp0);
      assertEquals(0, timestamp1.getNanos());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      Timestamp timestamp0 = javaTimestampFormatter0.parse(zapposJson0, "5");
      Timestamp timestamp1 = javaTimestampFormatter0.cast(timestamp0);
      assertSame(timestamp0, timestamp1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      try { 
        javaTimestampFormatter0.parse(zapposJson0, " f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \" f\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      javaTimestampFormatter0.setPattern("");
      try { 
        javaTimestampFormatter0.parse((ZapposJson) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      javaTimestampFormatter0.setPattern("com.zappos.json.format.JavaTimestampFormatter");
      ZapposJson zapposJson0 = ZapposJson.getInstance("com.zappos.json.format.JavaTimestampFormatter");
      try { 
        javaTimestampFormatter0.parse(zapposJson0, "com.zappos.json.format.JavaTimestampFormatter");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'c'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        javaTimestampFormatter0.cast(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      javaTimestampFormatter0.setPattern("");
      ZapposJson zapposJson0 = ZapposJson.getInstance("");
      try { 
        javaTimestampFormatter0.parse(zapposJson0, "");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"\"
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      Timestamp timestamp0 = javaTimestampFormatter0.parse(zapposJson0, "0");
      assertEquals(0, timestamp0.getNanos());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      javaTimestampFormatter0.setPattern("<^o'taeBe");
      // Undeclared exception!
      try { 
        javaTimestampFormatter0.format((ZapposJson) null, (Timestamp) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      // Undeclared exception!
      try { 
        javaTimestampFormatter0.format((ZapposJson) null, (Timestamp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.zappos.json.format.JavaTimestampFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      Timestamp timestamp0 = javaTimestampFormatter0.cast((Object) null);
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JavaTimestampFormatter javaTimestampFormatter0 = new JavaTimestampFormatter();
      ValueFormatter<Timestamp> valueFormatter0 = javaTimestampFormatter0.newInstance();
      assertNotSame(javaTimestampFormatter0, valueFormatter0);
  }
}