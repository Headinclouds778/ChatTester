// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Pair_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:57:41 GMT 2024
 */
package technology.tabula;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Pair;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Pair_ESTest extends Pair_ESTest_scaffolding {
@Test
public void testGetRight() {
    // Create test objects
    L left = new L();
    R right = new R();
    Pair<L, R> pair = new Pair<>(left, right);
    
    // Call the method under test
    R result = pair.getRight();
    
    // Assert the result
    assertEquals(right, result);
}
}