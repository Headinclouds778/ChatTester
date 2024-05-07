/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:59:43 GMT 2024
 */
package org.jinstagram.entity.likes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.User;
import org.jinstagram.entity.likes.LikesFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class LikesFeed_ESTest extends LikesFeed_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        LikesFeed likesFeed0 = new LikesFeed();
        LinkedList<User> linkedList0 = new LinkedList<User>();
        User user0 = new User();
        linkedList0.add(user0);
        likesFeed0.setUserList(linkedList0);
        List<User> list0 = likesFeed0.getUserList();
        assertEquals(1, list0.size());
    }
    
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        LikesFeed likesFeed0 = new LikesFeed();
        LinkedList<User> linkedList0 = new LinkedList<User>();
        User user0 = new User();
        linkedList0.add(user0);
        likesFeed0.setUserList(linkedList0);
        List<User> list0 = likesFeed0.getUserList();
        assertEquals(1, list0.size());
    }
}