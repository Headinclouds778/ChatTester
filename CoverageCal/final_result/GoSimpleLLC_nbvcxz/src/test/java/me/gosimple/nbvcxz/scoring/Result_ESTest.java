/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:13:27 GMT 2024
 */
package me.gosimple.nbvcxz.scoring;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import me.gosimple.nbvcxz.matching.PasswordMatcher;
import me.gosimple.nbvcxz.matching.match.BruteForceMatch;
import me.gosimple.nbvcxz.matching.match.DateMatch;
import me.gosimple.nbvcxz.matching.match.DictionaryMatch;
import me.gosimple.nbvcxz.matching.match.Match;
import me.gosimple.nbvcxz.matching.match.SequenceMatch;
import me.gosimple.nbvcxz.resources.AdjacencyGraph;
import me.gosimple.nbvcxz.resources.Configuration;
import me.gosimple.nbvcxz.resources.Dictionary;
import me.gosimple.nbvcxz.resources.Feedback;
import me.gosimple.nbvcxz.scoring.Result;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Result_ESTest extends Result_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        LinkedList<Match> linkedList0 = new LinkedList<Match>();
        Pattern pattern0 = Pattern.compile("feedback.spatial.warning.straightRowsOfKeys");
        Double double0 = new Double((-691));
        Integer integer0 = new Integer((-3680));
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        LinkedList<PasswordMatcher> linkedList1 = new LinkedList<PasswordMatcher>();
        HashMap<String, Long> hashMap0 = new HashMap<String, Long>();
        LinkedList<Dictionary> linkedList2 = new LinkedList<Dictionary>();
        HashMap<Character, Character[]> hashMap1 = new HashMap<Character, Character[]>();
        Configuration configuration0 = new Configuration(linkedList1, hashMap0, linkedList2, (List<AdjacencyGraph>) null, hashMap1, pattern0, double0, integer0, locale0, true, (-915L));
        Result result0 = new Result(configuration0, "", "G", linkedList0);
        boolean boolean0 = result0.isMinimumEntropyMet();
        assertTrue(boolean0);
        assertTrue(result0.isTruncated());
    }
    
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        LinkedList<Match> linkedList0 = new LinkedList<Match>();
        LinkedList<Character[]> linkedList1 = new LinkedList<Character[]>();
        DictionaryMatch dictionaryMatch0 = new DictionaryMatch("r%K@URz4", (Configuration) null, 1579, (-1), "r%K@URz4", (-1), linkedList1, false, false, "r%K@URz4", 1579);
        linkedList0.add((Match) dictionaryMatch0);
        Result result0 = new Result((Configuration) null, "r%K@URz4", (String) null, linkedList0);
        // Undeclared exception!
        try {
            result0.getGuesses();
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            verifyException("java.math.BigDecimal", e);
        }
    }
    
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        LinkedList<Match> linkedList0 = new LinkedList<Match>();
        Result result0 = new Result((Configuration) null, "", "", linkedList0);
        DateMatch dateMatch0 = new DateMatch("ynV.", (Configuration) null, (-1), 1547, (-872), "", 1547, 3);
        linkedList0.add((Match) dateMatch0);
        Double double0 = result0.getEntropy();
        assertEquals(15.183015000882756, (double) double0, 0.01);
        assertFalse(result0.isTruncated());
    }
    
    @Test(timeout = 4000)
    public void test25() throws Throwable {
        LinkedList<Match> linkedList0 = new LinkedList<Match>();
        Result result0 = new Result((Configuration) null, "", "", linkedList0);
        BruteForceMatch bruteForceMatch0 = new BruteForceMatch('Z', (Configuration) null, (-2013339279));
        linkedList0.add((Match) bruteForceMatch0);
        boolean boolean0 = result0.isRandom();
        assertTrue(boolean0);
        assertFalse(result0.isTruncated());
    }
}
