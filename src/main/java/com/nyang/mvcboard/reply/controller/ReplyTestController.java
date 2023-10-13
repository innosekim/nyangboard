package com.nyang.mvcboard.reply.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reply")
public class ReplyTestController {
    @RequestMapping("/test")
    public String replyAjaxTest() {
        return "/tutorial/reply_test";
    }

    @RequestMapping("/htmlTest")
    public String htmlTest() {
        return "/tutorial/reply_template";
    }

}