package com.apple.shop; // 파일의 경로 (다른 파일에서 쓰려면 꼭 적어야 함) / 안쓰면 에러남

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// public 없으면 같은 폴더(패키지) 안에서만 사용 가능
// public 붙이면 다른 폴더에서도 사용 가능

// /list 페이지로 접속하면 상품목록 페이지 보내주기
@Controller
public class ItemController {

    @GetMapping("/list")
    String list(Model model) {
        // model.addAllAttributes("전달할 데이터 이름", "전달할 데이터")
        // 보낼 데이터 많으면 여러 줄 추가 하면 됨
        model.addAttribute("name", "비싼 바지");
        return "list.html";
    }

}
