package com.example.jks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liujiangchun
 * @date 2020-06-20
 */
@Controller
@RequestMapping(value = "/test")
public class JksController {

    @RequestMapping(value = "hello")
    @ResponseBody
    public String login() {
        return "hello";
    }
}
