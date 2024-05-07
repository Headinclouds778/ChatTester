/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:59:46 GMT 2024
 */
package technology.tabula;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Page;
import technology.tabula.ProjectionProfile;
import technology.tabula.Rectangle;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class ProjectionProfile_ESTest extends ProjectionProfile_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        float[] floatArray0 = new float[7];
        floatArray0[0] = (-418.7F);
        float[] floatArray1 = ProjectionProfile.filter(floatArray0, 1905.514F);
        assertArrayEquals(new float[] { (-418.7F), 797420.06F, (-1.51869773E9F), 2.89238129E12F, (-5.5085812E15F), 1.049117E19F, (-1.9980582E22F) }, floatArray1, 0.01F);
    }
}