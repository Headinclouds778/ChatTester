// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/FromTagData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:38:11 GMT 2024
 */
package org.jinstagram.entity.common;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class FromTagData_ESTest extends FromTagData_ESTest_scaffolding {
    @Test
    public void testSetProfilePicture() {
        // Given
        FromTagData fromTagData = new FromTagData();
        String profilePicture = "https://example.com/profile.jpg";

        // When
        fromTagData.setProfilePicture(profilePicture);

        // Then
        assertEquals(profilePicture, fromTagData.getProfilePicture());
    }
}