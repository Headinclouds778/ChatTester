// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentResponse_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:30:22 GMT 2024
 */
package org.jinstagram.entity.comments;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.comments.MediaCommentResponse;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MediaCommentResponse_ESTest extends MediaCommentResponse_ESTest_scaffolding {
    @Test
    public void testSetMeta() {
        // Given
        MediaCommentResponse mediaCommentResponse = new MediaCommentResponse();
        Meta meta = new Meta();
        
        // When
        mediaCommentResponse.setMeta(meta);
        
        // Then
        Meta retrievedMeta = mediaCommentResponse.getMeta();
        assertEquals(meta, retrievedMeta);
    }
}