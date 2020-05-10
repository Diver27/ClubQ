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

    @PostMapping(path = "/new")
    public @ResponseBody
    boolean newUser(@RequestParam String username) {
        return userService.newUser(username);
    }

    @GetMapping(path = "/info")
    public @ResponseBody
    Optional<User> getUserInfo(@RequestParam Integer userId) {
        return userService.getUserInfo(userId);
    }

    @PostMapping(path = "/update")
    public @ResponseBody
    boolean updateUserInfo(@RequestParam Integer userId, @RequestParam String infoText) {
        return userService.updateUserInfo(userId, infoText);
    }//Todo: Upload profile image.
}
