package com.example.thymeleaf_practice.controller;

import com.example.thymeleaf_practice.model.User;
import com.example.thymeleaf_practice.service.impl.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    private final UserServiceImplementation service;

    public UserController(UserServiceImplementation service) {
        this.service = service;
    }

    @PostMapping("create_user/save")
    public String addUser(Model model, @ModelAttribute("user_model") User user) {
        User save = service.createUser(user);
        model.addAttribute("save",save);
        return "create_user";
    }

}

/*

${...} : Variable expression
Controller code:

model.addAttribute("hello","Print Something dude!");
hello = is the Model variable name
Print Something dude! = Model variable value

Hello.html
<body>
<h1 th:text=${hello}></h1>
</body>

output: Print Something dude!

*{...} : Selection expression
#{...} : Message (i18n) expression
@{...} : Link (URL) expression
~{...} : Fragment expression

 */
