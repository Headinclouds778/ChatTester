// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/basicinfo/UserInfoData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:24:13 GMT 2024
 */
package org.jinstagram.entity.users.basicinfo;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.users.basicinfo.Counts;
import org.jinstagram.entity.users.basicinfo.UserInfoData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class UserInfoData_ESTest extends UserInfoData_ESTest_scaffolding {
    @Test
    public void testIsBusiness() {
        UserInfoData userInfoData = new UserInfoData();
        userInfoData.setBusiness(true);
        assertTrue(userInfoData.isBusiness());
        
        userInfoData.setBusiness(false);
        assertFalse(userInfoData.isBusiness());
    }
}