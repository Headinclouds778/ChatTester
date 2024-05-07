// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:19:12 GMT 2024
 */
package com.zappos.json;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonConfig;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaDateFormatter;
import com.zappos.json.format.ValueFormatter;
import java.io.File;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.chrono.HijrahEra;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ZapposJson_ESTest extends ZapposJson_ESTest_scaffolding {
    @Test
    public void testGetValueFormatter() {
        ZapposJson zapposJson = ZapposJson.getInstance();
        
        // Add test cases for different object types
        zapposJson.addValueFormatter(Date.class, new JavaDateFormatter());
        zapposJson.addValueFormatter(java.sql.Date.class, new JavaSqlDateFormatter());
        zapposJson.addValueFormatter(java.sql.Timestamp.class, new JavaTimestampFormatter());
        zapposJson.addValueFormatter(java.math.BigInteger.class, new BigIntegerFormatter());
        zapposJson.addValueFormatter(java.math.BigDecimal.class, new BigDecimalFormatter());
        
        // Test for Date object type
        ValueFormatter<Object> dateFormatter = zapposJson.getValueFormatter(Date.class);
        assertNotNull(dateFormatter);
        assertTrue(dateFormatter instanceof JavaDateFormatter);
        
        // Test for java.sql.Date object type
        ValueFormatter<Object> sqlDateFormatter = zapposJson.getValueFormatter(java.sql.Date.class);
        assertNotNull(sqlDateFormatter);
        assertTrue(sqlDateFormatter instanceof JavaSqlDateFormatter);
        
        // Test for java.sql.Timestamp object type
        ValueFormatter<Object> timestampFormatter = zapposJson.getValueFormatter(java.sql.Timestamp.class);
        assertNotNull(timestampFormatter);
        assertTrue(timestampFormatter instanceof JavaTimestampFormatter);
        
        // Test for java.math.BigInteger object type
        ValueFormatter<Object> bigIntegerFormatter = zapposJson.getValueFormatter(java.math.BigInteger.class);
        assertNotNull(bigIntegerFormatter);
        assertTrue(bigIntegerFormatter instanceof BigIntegerFormatter);
        
        // Test for java.math.BigDecimal object type
        ValueFormatter<Object> bigDecimalFormatter = zapposJson.getValueFormatter(java.math.BigDecimal.class);
        assertNotNull(bigDecimalFormatter);
        assertTrue(bigDecimalFormatter instanceof BigDecimalFormatter);
        
        // Add more test cases for other object types if needed
    }
}