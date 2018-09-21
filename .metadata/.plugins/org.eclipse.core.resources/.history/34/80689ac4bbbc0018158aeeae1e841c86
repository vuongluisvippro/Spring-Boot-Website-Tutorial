package com.tutorial.genealogy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * https://o7planning.org/en/11677/secure-spring-boot-restful-service-using-auth0-jwt
 * @author lorence
 *
 */
@Controller
public class MainController {
 
    @RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
    public String viewLoginPage(Model model) {
        return "auth/login";
    }
}