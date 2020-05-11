package diver27.clubq.controller;

import diver27.clubq.model.User;
import diver27.clubq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 新增用户
     * @param username 用户名
     * @return
     * 布尔值：  true
     */
    @PostMapping(path = "/new")
    public @ResponseBody
    boolean newUser(@RequestParam String username) {
        return userService.newUser(username);
    }

    /**
     * 查看用户信息
     * @param userId 用户id
     * @return
     * {
     *     "id": 1,
     *     "username": "diver27",
     *     "infoText": "test1",
     *     "profileImageId": null
     * }
     */
    @GetMapping(path = "/info")
    public @ResponseBody
    Optional<User> getUserInfo(@RequestParam Integer userId) {
        return userService.getUserInfo(userId);
    }

    /**
     * 更新用户简介
     * @param userId 用户id
     * @param infoText 简介文字
     * @return
     * 布尔值: true
     */
    @PostMapping(path = "/update")
    public @ResponseBody
    boolean updateUserInfo(@RequestParam Integer userId, @RequestParam String infoText) {
        return userService.updateUserInfo(userId, infoText);
    }//Todo: Upload profile image.

}
