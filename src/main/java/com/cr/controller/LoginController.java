package com.cr.controller;

import com.cr.entity.User;
import com.cr.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String login(HttpServletRequest request) {
        User user = (User) WebUtils.getSessionAttribute(request, "user");
        if (user != null) {
            return "redirect:/";
        }
        return "login";
    }

    @PostMapping
    public String login(HttpServletRequest request, User loginUser) {
        User user = (User) WebUtils.getSessionAttribute(request, "user");
        if (user != null) {
            return "redirect:/";
        }
        user = userService.getUserByUsername(loginUser.getUsername());
        if (user != null) {
            WebUtils.setSessionAttribute(request, "user", user);
            return "redirect:/";
        } else {
            return "error";
        }
    }

}
