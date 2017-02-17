package com.sinon.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by
 * autor: ghh on
 * Date: 2017/2/16.
 * Time: 14:14
 */
@Controller
public class HelloController {
    public static Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping("hello")
    public String gethello(@RequestParam(value = "name",required = false, defaultValue = "ghh") String name,  Model mv) {
        logger.info("hello");
        mv.addAttribute("name", name);
        return "hello";
    }

}
