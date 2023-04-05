package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/index")
    public String index(HttpServletResponse response) {
        return "Hello Index";
    }
}

/*    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mv = new ModelAndView("root.index");

        mv.addObject("data", "Hello Spring MVC");
//        mv.setViewName("/WEB-INF/view/index.jsp");

        return mv;
    }*/

