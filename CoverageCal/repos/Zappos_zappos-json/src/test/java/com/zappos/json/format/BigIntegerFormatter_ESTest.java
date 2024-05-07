/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:33:42 GMT 2024
 */
package com.zappos.json.format;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.BigIntegerFormatter;
import com.zappos.json.format.ValueFormatter;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class BigIntegerFormatter_ESTest extends BigIntegerFormatter_ESTest_scaffolding {


@Test(timeout = 4000)
public void test02() throws Throwable {
    BigIntegerFormatter bigIntegerFormatter0 = new BigIntegerFormatter();
    ZapposJson zapposJson0 = ZapposJson.getInstance();
    BigInteger bigInteger0 = bigIntegerFormatter0.parse(zapposJson0, "-1739128425");
    assertEquals((byte) (-105), bigInteger0.byteValue());
}


@Test(timeout = 4000)
public void test11() throws Throwable {
    BigIntegerFormatter bigIntegerFormatter0 = new BigIntegerFormatter();
    ZapposJson zapposJson0 = ZapposJson.getInstance();
    byte[] byteArray0 = new byte[8];
    BigInteger bigInteger0 = new BigInteger(byteArray0);
    String string0 = bigIntegerFormatter0.format(zapposJson0, bigInteger0);
    assertEquals("0", string0);
}


@Test(timeout = 4000)
public void test05() throws Throwable {
    BigIntegerFormatter bigIntegerFormatter0 = new BigIntegerFormatter();
    byte[] byteArray0 = new byte[1];
    byteArray0[0] = (byte) (-100);
    BigInteger bigInteger0 = new BigInteger(byteArray0);
    BigInteger bigInteger1 = bigIntegerFormatter0.cast(bigInteger0);
    assertSame(bigInteger0, bigInteger1);
}

}