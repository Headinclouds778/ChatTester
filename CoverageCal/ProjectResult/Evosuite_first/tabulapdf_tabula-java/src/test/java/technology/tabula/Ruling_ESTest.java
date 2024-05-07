/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:09:27 GMT 2024
 */
package technology.tabula;


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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Ruling_ESTest extends Ruling_ESTest_scaffolding {


@Test(timeout = 4000)
public void test11() throws Throwable {
    LinkedList<Ruling> linkedList0 = new LinkedList<Ruling>();
    Map<Point2D, Ruling[]> map0 = Ruling.findIntersections(linkedList0, linkedList0);
    assertTrue(map0.isEmpty());
}


@Test(timeout = 4000)
public void test04() throws Throwable {
    LinkedList<Ruling> linkedList0 = new LinkedList<Ruling>();
    List<Ruling> list0 = Ruling.collapseOrientedRulings((List<Ruling>) linkedList0, (-2106073439));
    assertTrue(list0.isEmpty());
}


@Test(timeout = 4000)
public void test05() throws Throwable {
    LinkedList<Ruling> linkedList0 = new LinkedList<Ruling>();
    List<Ruling> list0 = Ruling.collapseOrientedRulings((List<Ruling>) linkedList0);
    assertTrue(list0.isEmpty());
}


@Test(timeout = 4000)
public void test09() throws Throwable {
    LinkedList<Ruling> linkedList0 = new LinkedList<Ruling>();
    java.awt.Rectangle rectangle0 = new java.awt.Rectangle();
    List<Ruling> list0 = Ruling.cropRulingsToArea(linkedList0, rectangle0);
    assertEquals(0, list0.size());
}

}