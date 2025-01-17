// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/BasicExtractionAlgorithm_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:49:38 GMT 2024
 */
package technology.tabula.extractors;
import java.util.ArrayList;
import java.util.List;
import technology.tabula.Page;
import technology.tabula.Ruling;
import technology.tabula.Table;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Line;
import technology.tabula.Page;
import technology.tabula.Ruling;
import technology.tabula.TextChunk;
import technology.tabula.extractors.BasicExtractionAlgorithm;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BasicExtractionAlgorithm_ESTest extends BasicExtractionAlgorithm_ESTest_scaffolding {
    @Test
    public void testExtractWithVerticalRulingPositions() {
        // Create a test page
        Page page = new Page();
        page.setTop(0.0f);
        page.setHeight(100.0f);

        // Create vertical ruling positions
        List<Float> verticalRulingPositions = new ArrayList<>();
        verticalRulingPositions.add(10.0f);
        verticalRulingPositions.add(20.0f);
        verticalRulingPositions.add(30.0f);

        // Create expected vertical rulings
        List<Ruling> expectedVerticalRulings = new ArrayList<>();
        expectedVerticalRulings.add(new Ruling(0.0f, 10.0f, 0.0f, 100.0f));
        expectedVerticalRulings.add(new Ruling(0.0f, 20.0f, 0.0f, 100.0f));
        expectedVerticalRulings.add(new Ruling(0.0f, 30.0f, 0.0f, 100.0f));

        // Create the BasicExtractionAlgorithm instance
        BasicExtractionAlgorithm algorithm = new BasicExtractionAlgorithm();

        // Call the extract method
        List<Table> result = algorithm.extract(page, verticalRulingPositions);

        // Assert the result
        assertNotNull(result);
        assertEquals(0, result.size());

        // Assert the vertical rulings
        List<Ruling> actualVerticalRulings = algorithm.getVerticalRulings();
        assertNotNull(actualVerticalRulings);
        assertEquals(expectedVerticalRulings.size(), actualVerticalRulings.size());
        for (int i = 0; i < expectedVerticalRulings.size(); i++) {
            Ruling expectedRuling = expectedVerticalRulings.get(i);
            Ruling actualRuling = actualVerticalRulings.get(i);
            assertEquals(expectedRuling.getTop(), actualRuling.getTop(), 0.0f);
            assertEquals(expectedRuling.getLeft(), actualRuling.getLeft(), 0.0f);
            assertEquals(expectedRuling.getWidth(), actualRuling.getWidth(), 0.0f);
            assertEquals(expectedRuling.getHeight(), actualRuling.getHeight(), 0.0f);
        }
    }
}
