// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/relationships/RelationshipData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:09:00 GMT 2024
 */
package org.jinstagram.entity.relationships;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.relationships.RelationshipData;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.relationships.RelationshipData;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.relationships.RelationshipData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class RelationshipData_ESTest extends RelationshipData_ESTest_scaffolding {

    @Test
    public void testSetTargetUserPrivate() {
        RelationshipData relationshipData = new RelationshipData();
        boolean targetUserPrivate = true;
        
        relationshipData.setTargetUserPrivate(targetUserPrivate);
        
        assertTrue(relationshipData.isTargetUserPrivate());
    }

    @Test
    public void testGetOutgoingStatus() {
        // Given
        RelationshipData relationshipData = new RelationshipData();
        String expectedOutgoingStatus = "pending";
        
        // When
        relationshipData.setOutgoingStatus(expectedOutgoingStatus);
        String actualOutgoingStatus = relationshipData.getOutgoingStatus();
        
        // Then
        assertEquals(expectedOutgoingStatus, actualOutgoingStatus);
    }

    @Test
    public void testGetIncomingStatus() {
        // Given
        RelationshipData relationshipData = new RelationshipData();
        String expectedIncomingStatus = "pending";
        
        // When
        relationshipData.setIncomingStatus(expectedIncomingStatus);
        String actualIncomingStatus = relationshipData.getIncomingStatus();
        
        // Then
        assertEquals(expectedIncomingStatus, actualIncomingStatus);
    }

    @Test
    public void testIsTargetUserPrivate() {
        RelationshipData relationshipData = new RelationshipData();
        
        // Initially, the target user should not be private
        assertFalse(relationshipData.isTargetUserPrivate());
        
        // Set the target user as private
        relationshipData.setTargetUserPrivate(true);
        assertTrue(relationshipData.isTargetUserPrivate());
        
        // Set the target user as not private
        relationshipData.setTargetUserPrivate(false);
        assertFalse(relationshipData.isTargetUserPrivate());
    }

    @Test
    public void testSetIncomingStatus() {
        // Given
        RelationshipData relationshipData = new RelationshipData();
        String incomingStatus = "PENDING";

        // When
        relationshipData.setIncomingStatus(incomingStatus);

        // Then
        assertEquals(incomingStatus, relationshipData.getIncomingStatus());
    }

    @Test
    public void testSetOutgoingStatus() {
        // Given
        RelationshipData relationshipData = new RelationshipData();
        String expectedOutgoingStatus = "FRIENDS";

        // When
        relationshipData.setOutgoingStatus(expectedOutgoingStatus);

        // Then
        assertEquals(expectedOutgoingStatus, relationshipData.getOutgoingStatus());
    }

}