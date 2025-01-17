// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Ruling_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:09:27 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Ruling;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Ruling_ESTest extends Ruling_ESTest_scaffolding {
    @Test
    public void testCollapseOrientedRulings() {
        // Create test data
        List<Ruling> lines = new ArrayList<>();
        lines.add(new Ruling(0, 0, 10, 10));
        lines.add(new Ruling(5, 5, 15, 15));
        lines.add(new Ruling(20, 20, 30, 30));

        int expandAmount = 5;

        // Call the method under test
        List<Ruling> result = Ruling.collapseOrientedRulings(lines, expandAmount);

        // Assert the result
        assertEquals(2, result.size());
        assertEquals(0, result.get(0).getTop(), 0);
        assertEquals(0, result.get(0).getLeft(), 0);
        assertEquals(15, result.get(0).getBottom(), 0);
        assertEquals(15, result.get(0).getRight(), 0);
        assertEquals(20, result.get(1).getTop(), 0);
        assertEquals(20, result.get(1).getLeft(), 0);
        assertEquals(30, result.get(1).getBottom(), 0);
        assertEquals(30, result.get(1).getRight(), 0);
    }
}
