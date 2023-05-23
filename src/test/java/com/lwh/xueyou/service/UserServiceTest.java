package com.lwh.xueyou.service;

import com.lwh.xueyou.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 用户服务测试
 *
 * @author lwh
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        for (int i = 30000; i < 300000; i++) {
            User user = new User();
            user.setUsername("codeKun");
            user.setUserAccount("kun" + i);
            user.setAvatarUrl("https://inews.gtimg.com/newsapp_bt/0/9680744091/1000");
            user.setGender(0);
            user.setUserPassword("123456789");
            user.setPhone("123");
            user.setEmail("456");
            userService.save(user);
        }
    }

    @Test
    public void testUpdateUser() {
//        User user = new User();
//        user.setId(1L);
//        user.setUsername("dogLwha");
//        user.setUserAccount("123");
//        user.setAvatarUrl("https://pic3.zhimg.com/v2-e422ac1f0de6e35a99dc94b0f0c117e6_r.jpg?source=1940ef5c");
//        user.setGender(0);
//        user.setUserPassword("xxx");
//        user.setPhone("123");
//        user.setEmail("456");
//        boolean result = userService.updateById(user);
//        Assertions.assertTrue(result);
    }

    @Test
    public void testDeleteUser() {
//        boolean result = userService.removeById(1L);
//        Assertions.assertTrue(result);
    }

    @Test
    public void testGetUser() {
        User user = userService.getById(1L);
        Assertions.assertNotNull(user);
    }

    @Test
    void userRegister() {
//        String userAccount = "lwha";
//        String userPassword = "123";
//        String checkPassword = "123456789";
//        String userCode = "1";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "lw";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "lwha";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "lw ha";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "dogLwa";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
//        userAccount = "lwha";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
//        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testSearchUsersByTags() {
        List<String> tagNameList = Arrays.asList("java", "python");
        List<User> userList = userService.searchUsersByTags(tagNameList);
        Assert.assertNotNull(userList);
    }
}