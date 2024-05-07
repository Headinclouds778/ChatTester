// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:51:32 GMT 2024
 */
package technology.tabula.extractors;
import org.junit.Test;
import static org.junit.Assert.*;
import technology.tabula.Page;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Cell;
import technology.tabula.Page;
import technology.tabula.Rectangle;
import technology.tabula.Ruling;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SpreadsheetExtractionAlgorithm_ESTest extends SpreadsheetExtractionAlgorithm_ESTest_scaffolding {
    @Test
    public void testIsTabular() {
        // Create a test page with tabular data
        Page testPageWithTabularData = new Page();
        testPageWithTabularData.setText("1,2,3\n4,5,6\n7,8,9");

        // Create a test page without tabular data
        Page testPageWithoutTabularData = new Page();
        testPageWithoutTabularData.setText("This is a regular text without tabular data");

        // Create an instance of the SpreadsheetExtractionAlgorithm
        SpreadsheetExtractionAlgorithm extractionAlgorithm = new SpreadsheetExtractionAlgorithm();

        // Test for a page with tabular data
        assertTrue(extractionAlgorithm.isTabular(testPageWithTabularData));

        // Test for a page without tabular data
        assertFalse(extractionAlgorithm.isTabular(testPageWithoutTabularData));
    }
}