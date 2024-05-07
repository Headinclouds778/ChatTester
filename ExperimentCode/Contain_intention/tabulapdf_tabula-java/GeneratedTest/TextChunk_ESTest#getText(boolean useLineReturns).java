// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:15:23 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Line;
import technology.tabula.Rectangle;
import technology.tabula.TextChunk;
import technology.tabula.TextElement;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TextChunk_ESTest extends TextChunk_ESTest_scaffolding {
    @Test
    public void testGetTextWithLineReturns() {
        // Given
        TextElement textElement1 = new TextElement(10, 20, 30, 40, "Hello");
        TextElement textElement2 = new TextElement(50, 60, 70, 80, "World");
        TextChunk textChunk = new TextChunk(List.of(textElement1, textElement2));

        // When
        String result = textChunk.getText(true);

        // Then
        assertEquals("Hello\nWorld", result);
    }
}