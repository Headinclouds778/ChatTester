// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Location_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:46:49 GMT 2024
 */
package org.jinstagram.entity.common;


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Location;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Location_ESTest extends Location_ESTest_scaffolding {

@Test
public void testGetLatitude() {
    // Create a new Location object
    Location location = new Location();
    
    // Set the latitude value
    double expectedLatitude = 37.7749;
    location.setLatitude(expectedLatitude);
    
    // Get the latitude value using the getLatitude() method
    double actualLatitude = location.getLatitude();
    
    // Assert that the actual latitude value matches the expected latitude value
    assertEquals(expectedLatitude, actualLatitude, 0.0001);
}

    @Test
    public void testSetLatitude() {
        // Create a new Location object
        Location location = new Location();

        // Set the latitude using the setLatitude method
        double latitude = 37.7749;
        location.setLatitude(latitude);

        // Verify that the latitude has been set correctly
        assertEquals(latitude, location.getLatitude(), 0.001);
    }

    @Test
    public void testSetName() {
        // Create a new Location object
        Location location = new Location();

        // Set the name using the setName method
        String name = "Test Location";
        location.setName(name);

        // Verify that the name has been set correctly
        assertEquals(name, location.getName());
    }

    @Test
    public void testSetLongitude() {
        // Create a new Location object
        Location location = new Location();

        // Set the longitude using the setLongitude method
        double longitude = 10.5;
        location.setLongitude(longitude);

        // Verify that the longitude has been set correctly
        assertEquals(longitude, location.getLongitude(), 0.0);
    }

@Test
public void testGetId() {
    // Create a new Location object
    Location location = new Location();
    
    // Set the id of the Location object
    String expectedId = "123";
    location.setId(expectedId);
    
    // Call the getId() method and assert the returned value
    String actualId = location.getId();
    assertEquals(expectedId, actualId);
}

@Test
public void testGetName() {
    // Create a new Location object
    Location location = new Location();
    
    // Set the name of the Location object
    String expectedName = "Test Location";
    location.setName(expectedName);
    
    // Get the name using the getName() method
    String actualName = location.getName();
    
    // Assert that the actual name is equal to the expected name
    assertEquals(expectedName, actualName);
}

}
