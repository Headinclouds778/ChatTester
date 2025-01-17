// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Ruling_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:09:27 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
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
    public void testCropRulingsToArea() {
        // Create a sample Rectangle2D area
        Rectangle2D area = new Rectangle2D.Float(0, 0, 10, 10);

        // Create a list of Ruling objects for testing
        List<Ruling> rulings = new ArrayList<>();
        rulings.add(new Ruling(0, 0, 5, 5)); // Intersects with area
        rulings.add(new Ruling(15, 15, 5, 5)); // Does not intersect with area

        // Call the method under test
        List<Ruling> result = Ruling.cropRulingsToArea(rulings, area);

        // Assert the size of the result list
        assertEquals(1, result.size());

        // Assert the properties of the Ruling object in the result list
        Ruling croppedRuling = result.get(0);
        assertEquals(0.0f, croppedRuling.getTop(), 0.0);
        assertEquals(0.0f, croppedRuling.getLeft(), 0.0);
        assertEquals(5.0f, croppedRuling.getWidth(), 0.0);
        assertEquals(5.0f, croppedRuling.getHeight(), 0.0);
    }
}
