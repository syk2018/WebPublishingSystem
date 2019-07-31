package com.syk.publishing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: shaoyikun
 * @Date: 2019-07-31
 * @Description:
 **/
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index() {
        return "forward:index.html";
    }
}
