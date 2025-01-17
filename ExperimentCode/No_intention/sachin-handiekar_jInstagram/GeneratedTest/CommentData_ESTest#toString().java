// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:28:38 GMT 2024
 */
package org.jinstagram.entity.comments;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CommentData_ESTest extends CommentData_ESTest_scaffolding {
@Test
public void testToString() {
    // Create test data
    FromTagData commentFrom = new FromTagData();
    commentFrom.setName("John Doe");
    commentFrom.setId("1234567890");
    String createdTime = "2021-01-01 12:00:00";
    String id = "9876543210";
    String text = "This is a test comment";

    // Set data in CommentData object
    CommentData commentData = new CommentData();
    commentData.setCommentFrom(commentFrom);
    commentData.setCreatedTime(createdTime);
    commentData.setId(id);
    commentData.setText(text);

    // Expected result
    String expected = "CommentData [commentFrom=FromTagData [name=John Doe, id=1234567890], createdTime=2021-01-01 12:00:00, id=9876543210, text=This is a test comment]";

    // Test the toString() method
    String result = commentData.toString();

    // Assert the result
    assertEquals(expected, result);
}
}
