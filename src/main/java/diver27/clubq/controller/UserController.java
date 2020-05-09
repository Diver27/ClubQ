package diver27.clubq.controller;

import diver27.clubq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
//
//    @GetMapping(path="/info")
//    public @ResponseBody Optio
//Todo:  How to return user data as JSON?
}
