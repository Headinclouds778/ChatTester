// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:28:38 GMT 2024
 */
package org.jinstagram.entity.comments;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class CommentData_ESTest extends CommentData_ESTest_scaffolding {

    @Test
    public void testSetText() {
        // Given
        CommentData commentData = new CommentData();
        String text = "Test comment text";

        // When
        commentData.setText(text);

        // Then
        assertEquals(text, commentData.getText());
    }

    @Test
    public void testSetCreatedTime() {
        CommentData commentData = new CommentData();
        String createdTime = "2022-01-01T12:00:00Z";
        
        commentData.setCreatedTime(createdTime);
        
        assertEquals(createdTime, commentData.getCreatedTime());
    }

    @Test
    public void testGetCreatedTime() {
        // Given
        CommentData commentData = new CommentData();
        String expectedCreatedTime = "2022-01-01T12:00:00";

        // When
        commentData.setCreatedTime(expectedCreatedTime);
        String actualCreatedTime = commentData.getCreatedTime();

        // Then
        assertEquals(expectedCreatedTime, actualCreatedTime);
    }

    @Test
    public void testGetText() {
        // Given
        CommentData commentData = new CommentData();
        String expectedText = "This is a test comment";
        commentData.setText(expectedText);

        // When
        String actualText = commentData.getText();

        // Then
        assertEquals(expectedText, actualText);
    }

    @Test
    public void testSetCommentFrom() {
        CommentData commentData = new CommentData();
        FromTagData fromTagData = new FromTagData();
        
        // Set up the FromTagData object
        fromTagData.setUsername("testUser");
        fromTagData.setFullName("Test User");
        
        // Call the method under test
        commentData.setCommentFrom(fromTagData);
        
        // Verify that the FromTagData object was set correctly
        assertEquals("testUser", commentData.getCommentFrom().getUsername());
        assertEquals("Test User", commentData.getCommentFrom().getFullName());
    }

    @Test
    public void testGetCommentFrom() {
        CommentData commentData = new CommentData();
        FromTagData expectedFromTagData = new FromTagData();
        
        commentData.setCommentFrom(expectedFromTagData);
        
        FromTagData actualFromTagData = commentData.getCommentFrom();
        
        assertNotNull(actualFromTagData);
        // Add more assertions as needed
    }

    @Test
    public void testSetId() {
        CommentData commentData = new CommentData();
        String id = "12345";
        commentData.setId(id);
        
        assertEquals(id, commentData.getId());
    }

    @Test
    public void testGetId() {
        // Given
        CommentData commentData = new CommentData();
        String expectedId = "12345";
        commentData.setId(expectedId);

        // When
        String actualId = commentData.getId();

        // Then
        assertEquals(expectedId, actualId);
    }

}