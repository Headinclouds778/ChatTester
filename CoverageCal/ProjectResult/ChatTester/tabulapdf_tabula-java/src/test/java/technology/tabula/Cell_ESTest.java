// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Cell_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:42:58 GMT 2024
 */
package technology.tabula;

import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Cell;
import technology.tabula.TextChunk;

import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Cell;
import technology.tabula.TextChunk;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Cell;
import technology.tabula.TextChunk;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Cell_ESTest extends Cell_ESTest_scaffolding {

@Test
public void setUp2() {
    Cell cell = new Cell(10.0f, 20.0f, 30.0f, 40.0f);
}

@Test
public void testGetText() {
    Cell cell = new Cell(10.0f, 20.0f, 30.0f, 40.0f);
    String expectedText = "Sample Text";
    String actualText = cell.getText();
   
}

    @Test
    public void testSetSpanning() {
        Cell cell = new Cell(10.0f, 20.0f, 30.0f, 40.0f);
        
        // Verify initial state
        assertFalse(cell.isSpanning());
        
        // Set spanning to true
        cell.setSpanning(true);
        assertTrue(cell.isSpanning());
        
        // Set spanning back to false
        cell.setSpanning(false);
        assertFalse(cell.isSpanning());
    }

@Test
public void setUp() {
    Cell cell = new Cell(0, 0, 10, 10);
}

    @Test
    public void testSetPlaceholder() {
        Cell cell = new Cell(10.0f, 20.0f, 30.0f, 40.0f);
        assertFalse(cell.isPlaceholder());
        
        cell.setPlaceholder(true);
        assertTrue(cell.isPlaceholder());
        
        cell.setPlaceholder(false);
        assertFalse(cell.isPlaceholder());
    }

}