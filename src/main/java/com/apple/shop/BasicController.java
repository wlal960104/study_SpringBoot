package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello() {
        // static 파일이 기본 경로
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "사이트입니다.";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String my() {
        return "mypage 입니다.";
    }
}
