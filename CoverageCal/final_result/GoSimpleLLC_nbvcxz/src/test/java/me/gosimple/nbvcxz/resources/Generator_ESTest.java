/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:11:13 GMT 2024
 */
package me.gosimple.nbvcxz.resources;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import me.gosimple.nbvcxz.resources.Dictionary;
import me.gosimple.nbvcxz.resources.Generator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Generator_ESTest extends Generator_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Generator.CharacterTypes generator_CharacterTypes0 = Generator.CharacterTypes.ALPHANUMERIC;
        Generator.generateRandomPassword(generator_CharacterTypes0, 4099);
        Generator.generateRandomPassword(generator_CharacterTypes0, 4099);
        // Undeclared exception!
        Generator.generateRandomPassword(generator_CharacterTypes0, 4099);
    }
}