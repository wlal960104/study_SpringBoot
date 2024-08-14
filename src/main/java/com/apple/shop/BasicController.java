package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
import java.text.SimpleDateFormat;

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

    @GetMapping("/date")
    @ResponseBody
    String showDate() {
        Date today = new Date();
        System.out.println(today);
        SimpleDateFormat today_str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("today_str" + today_str);

        String str_today = today_str.format(today);
        System.out.println("str >>" +  str_today);
        return str_today;
    }
}
