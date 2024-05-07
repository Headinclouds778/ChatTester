// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Rectangle_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:03:59 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Rectangle;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Rectangle_ESTest extends Rectangle_ESTest_scaffolding {
    @Test
    public void testSetTop() {
        // Given
        float initialTop = 10.0f;
        float initialLeft = 5.0f;
        float initialWidth = 20.0f;
        float initialHeight = 15.0f;
        
        Rectangle rectangle = new Rectangle(initialTop, initialLeft, initialWidth, initialHeight);
        
        // When
        float newTop = 20.0f;
        rectangle.setTop(newTop);
        
        // Then
        assertEquals(newTop, rectangle.getTop(), 0.001); // Tolerance of 0.001 for float comparison
        assertEquals(initialLeft, rectangle.getLeft(), 0.001); // Left coordinate should remain unchanged
        assertEquals(initialWidth, rectangle.getWidth(), 0.001); // Width should remain unchanged
        assertEquals(initialHeight - (newTop - initialTop), rectangle.getHeight(), 0.001); // Height should adjust accordingly
    }
}