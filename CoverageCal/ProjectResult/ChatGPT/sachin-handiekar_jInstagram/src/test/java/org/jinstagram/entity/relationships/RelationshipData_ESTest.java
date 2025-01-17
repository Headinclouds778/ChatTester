// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/relationships/RelationshipData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:09:00 GMT 2024
 */
package org.jinstagram.entity.relationships;


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.relationships.RelationshipData;
import org.junit.runner.RunWith;

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
    // Create an instance of RelationshipData
    RelationshipData relationshipData = new RelationshipData();

    // Set the targetUserPrivate to true
    relationshipData.setTargetUserPrivate(true);

    // Verify that the targetUserPrivate is set correctly
    assertTrue(relationshipData.isTargetUserPrivate());

    // Set the targetUserPrivate to false
    relationshipData.setTargetUserPrivate(false);

    // Verify that the targetUserPrivate is set correctly
    assertFalse(relationshipData.isTargetUserPrivate());
}

@Test
public void testGetOutgoingStatus() {
    // Create an instance of RelationshipData
    RelationshipData relationshipData = new RelationshipData();

    // Set the outgoingStatus using the setter method
    relationshipData.setOutgoingStatus("Pending");

    // Get the outgoingStatus using the getOutgoingStatus method
    String outgoingStatus = relationshipData.getOutgoingStatus();

    // Assert that the outgoingStatus is equal to the expected value
    assertEquals("Pending", outgoingStatus);
}

@Test
public void testGetIncomingStatus() {
    // Create an instance of RelationshipData
    RelationshipData relationshipData = new RelationshipData();

    // Set the incoming status
    String expectedIncomingStatus = "Pending";
    relationshipData.setIncomingStatus(expectedIncomingStatus);

    // Call the getIncomingStatus() method
    String actualIncomingStatus = relationshipData.getIncomingStatus();

    // Assert that the returned incoming status matches the expected incoming status
    assertEquals(expectedIncomingStatus, actualIncomingStatus);
}

@Test
public void testIsTargetUserPrivate() {
    // Create an instance of RelationshipData
    RelationshipData relationshipData = new RelationshipData();

    // Set the value of targetUserPrivate to true
    relationshipData.setTargetUserPrivate(true);

    // Call the isTargetUserPrivate method and assert that it returns true
    assertTrue(relationshipData.isTargetUserPrivate());

    // Set the value of targetUserPrivate to false
    relationshipData.setTargetUserPrivate(false);

    // Call the isTargetUserPrivate method and assert that it returns false
    assertFalse(relationshipData.isTargetUserPrivate());
}

    @Test
    public void testSetIncomingStatus() {
        // Create an instance of RelationshipData
        RelationshipData relationshipData = new RelationshipData();

        // Set the incoming status
        String incomingStatus = "pending";
        relationshipData.setIncomingStatus(incomingStatus);

        // Verify that the incoming status is set correctly
        assertEquals(incomingStatus, relationshipData.getIncomingStatus());
    }

@Test
public void testSetOutgoingStatus() {
    // Create an instance of RelationshipData
    RelationshipData relationshipData = new RelationshipData();

    // Set the outgoing status
    String outgoingStatus = "pending";
    relationshipData.setOutgoingStatus(outgoingStatus);

    // Verify that the outgoing status is set correctly
    assertEquals(outgoingStatus, relationshipData.getOutgoingStatus());
}

}
