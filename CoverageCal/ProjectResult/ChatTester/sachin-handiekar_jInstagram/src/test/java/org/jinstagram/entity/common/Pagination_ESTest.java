// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Pagination_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:50:55 GMT 2024
 */
package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Pagination;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Pagination;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Pagination_ESTest extends Pagination_ESTest_scaffolding {

    @Test
    public void testSetNextCursor() {
        Pagination pagination = new Pagination();
        String nextCursor = "12345";
        pagination.setNextCursor(nextCursor);
        
        assertEquals(nextCursor, pagination.getNextCursor());
    }

    @Test
    public void testGetNextMinId() {
        Pagination pagination = new Pagination();
        pagination.setNextMinId("12345");
        
        String expected = "12345";
        String actual = pagination.getNextMinId();
        
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextUrl() {
        Pagination pagination = new Pagination();
        pagination.setNextUrl("https://example.com/nextPage");

        String expectedUrl = "https://example.com/nextPage";
        String actualUrl = pagination.getNextUrl();

        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testSetDepreciationWarning() {
        Pagination pagination = new Pagination();
        String expectedDepreciationWarning = "This is a deprecation warning message.";

        pagination.setDepreciationWarning(expectedDepreciationWarning);

        assertEquals(expectedDepreciationWarning, pagination.getDepreciationWarning());
    }

    @Test
    public void testGetNextCursor() {
        // Given
        Pagination pagination = new Pagination();
        pagination.setNextCursor("testCursor");

        // When
        String result = pagination.getNextCursor();

        // Then
        assertEquals("testCursor", result);
    }

    @Test
    public void testGetMinTagId() {
        Pagination pagination = new Pagination();
        pagination.setMinTagId("testMinTagId");

        String expected = "testMinTagId";
        String actual = pagination.getMinTagId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetMinTagId() {
        Pagination pagination = new Pagination();
        String minTagId = "testMinTagId";
        pagination.setMinTagId(minTagId);
        
        assertEquals(minTagId, pagination.getMinTagId());
    }

    @Test
    public void testHasNextPage() {
        Pagination pagination = new Pagination();
        pagination.setNextUrl("https://example.com/nextpage");

        assertTrue(pagination.hasNextPage());
    }

    @Test
    public void testGetNextMaxId() {
        Pagination pagination = new Pagination();
        pagination.setNextMaxId("12345");

        String expected = "12345";
        String actual = pagination.getNextMaxId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetNextUrl() {
        Pagination pagination = new Pagination();
        String nextUrl = "https://example.com/next";
        
        pagination.setNextUrl(nextUrl);
        
        assertEquals(nextUrl, pagination.getNextUrl());
    }

    @Test
    public void testSetNextMaxTagId() {
        Pagination pagination = new Pagination();
        String nextMaxTagId = "testNextMaxTagId";
        pagination.setNextMaxTagId(nextMaxTagId);
        
        assertEquals(nextMaxTagId, pagination.getNextMaxTagId());
    }

    @Test
    public void testSetNextMinId() {
        Pagination pagination = new Pagination();
        String nextMinId = "12345";
        pagination.setNextMinId(nextMinId);
        
        assertEquals(nextMinId, pagination.getNextMinId());
    }

    @Test
    public void testGetNextMaxTagId() {
        Pagination pagination = new Pagination();
        pagination.setNextMaxTagId("testNextMaxTagId");

        String result = pagination.getNextMaxTagId();

        assertEquals("testNextMaxTagId", result);
    }

    @Test
    public void testGetDepreciationWarning() {
        Pagination pagination = new Pagination();
        String expectedDepreciationWarning = "Sample Depreciation Warning";
        pagination.setDepreciationWarning(expectedDepreciationWarning);

        String actualDepreciationWarning = pagination.getDepreciationWarning();

        assertEquals(expectedDepreciationWarning, actualDepreciationWarning);
    }

    @Test
    public void testToString() {
        Pagination pagination = new Pagination();
        pagination.setDepreciationWarning("Test Depreciation Warning");
        pagination.setMinTagId("Test Min Tag Id");
        pagination.setNextMaxId("Test Next Max Id");
        pagination.setNextMaxTagId("Test Next Max Tag Id");
        pagination.setNextMinId("Test Next Min Id");
        pagination.setNextUrl("Test Next Url");

        String expected = "Pagination [depreciationWarning=Test Depreciation Warning, minTagId=Test Min Tag Id, nextMaxId=Test Next Max Id, nextMaxTagId=Test Next Max Tag Id, nextMinId=Test Next Min Id, nextUrl=Test Next Url]";
        String actual = pagination.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetNextMaxId() {
        Pagination pagination = new Pagination();
        String nextMaxId = "12345";
        pagination.setNextMaxId(nextMaxId);
        
        assertEquals(nextMaxId, pagination.getNextMaxId());
    }

}
