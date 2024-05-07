/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:02:08 GMT 2024
 */
package me.gosimple.nbvcxz.resources;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import me.gosimple.nbvcxz.resources.Dictionary;
import me.gosimple.nbvcxz.resources.DictionaryBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class DictionaryBuilder_ESTest extends DictionaryBuilder_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        DictionaryBuilder dictionaryBuilder0 = new DictionaryBuilder();
        dictionaryBuilder0.setExclusion(true);
        Dictionary dictionary0 = dictionaryBuilder0.createDictionary();
        assertTrue(dictionary0.isExclusion());
    }
    
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        DictionaryBuilder dictionaryBuilder0 = new DictionaryBuilder();
        DictionaryBuilder dictionaryBuilder1 = dictionaryBuilder0.addWord("g;/.DF7RB_=", 874);
        Dictionary dictionary0 = dictionaryBuilder1.createDictionary();
        assertEquals(12, dictionary0.getMaxLength());
    }
    
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        DictionaryBuilder dictionaryBuilder0 = new DictionaryBuilder();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("e'5t2d^[G2R>i");
        DictionaryBuilder dictionaryBuilder1 = dictionaryBuilder0.addWords(linkedList0, 0);
        assertSame(dictionaryBuilder0, dictionaryBuilder1);
    }
}