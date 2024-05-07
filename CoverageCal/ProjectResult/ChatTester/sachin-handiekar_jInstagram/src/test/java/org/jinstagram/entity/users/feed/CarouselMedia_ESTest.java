// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/CarouselMedia_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:26:18 GMT 2024
 */
package org.jinstagram.entity.users.feed;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.junit.runner.RunWith;

import java.util.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class CarouselMedia_ESTest extends CarouselMedia_ESTest_scaffolding {

    @Test
    public void testSetType() {
        CarouselMedia carouselMedia = new CarouselMedia();
        String expectedType = "image";
        
        carouselMedia.setType(expectedType);
        
        assertEquals(expectedType, carouselMedia.getType());
    }

    @Test
    public void testGetVideos() {
        CarouselMedia carouselMedia = new CarouselMedia();
        Videos videos = new Videos();
        carouselMedia.setVideos(videos);

        Videos retrievedVideos = carouselMedia.getVideos();

        assertNotNull(retrievedVideos);
    }

    @Test
    public void testGetType() {
        // Given
        CarouselMedia carouselMedia = new CarouselMedia();
        carouselMedia.setType("image");

        // When
        String type = carouselMedia.getType();

        // Then
        assertEquals("image", type);
    }

    @Test
    public void testSetImages() {
        // Given
        CarouselMedia carouselMedia = new CarouselMedia();
        Images newImages = new Images();

        // When
        carouselMedia.setImages(newImages);

        // Then
        assertEquals(newImages, carouselMedia.getImages());
    }

    @Test
    public void testGetImages() {
        CarouselMedia carouselMedia = new CarouselMedia();
        Images testImages = new Images();
        carouselMedia.setImages(testImages);

        Images retrievedImages = carouselMedia.getImages();

        assertNotNull(retrievedImages);
        assertEquals(testImages, retrievedImages);
    }

@Test
public void testSetUsersInPhotoList() {
    CarouselMedia carouselMedia = new CarouselMedia();

    List<UsersInPhoto> usersInPhotoList = new LinkedList<UsersInPhoto>();

    UsersInPhoto user1 = new UsersInPhoto();
    UsersInPhoto user2 = new UsersInPhoto();
    usersInPhotoList.add(user1);
    usersInPhotoList.add(user2);
    carouselMedia.setUsersInPhotoList(usersInPhotoList);
    List<UsersInPhoto> retrievedUsersInPhotoList = carouselMedia.getUsersInPhotoList();
    assertEquals(usersInPhotoList, retrievedUsersInPhotoList);
}

    @Test
    public void testSetVideos() {
        // Given
        CarouselMedia carouselMedia = new CarouselMedia();
        Videos videos = new Videos();

        // When
        carouselMedia.setVideos(videos);

        // Then
        assertEquals(videos, carouselMedia.getVideos());
    }

}