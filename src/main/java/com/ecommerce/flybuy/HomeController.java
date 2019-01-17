package com.ecommerce.flybuy;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String Index(){
        return "index";
    }

    @RequestMapping(value="/secret", method= RequestMethod.GET)
    public String Secret(){
        return "secret";
    }

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String Login(){
        return "login";
    }

}