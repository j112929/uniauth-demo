package com.shenma.dianrong.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Configuration
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(HttpServletRequest request) {
        return "index";
    }

}
