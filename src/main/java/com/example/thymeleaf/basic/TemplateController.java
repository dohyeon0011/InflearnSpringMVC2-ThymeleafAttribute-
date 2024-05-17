package com.example.thymeleaf.basic;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {   // 공통 되는 부분은 조각으로 빼두고 사용하기(copyright같은 부분)

    // 조각조각 원하는 부분만 넣으면 쉽긴 하지만 중복이 많다. 보통 이 방법(페이지가 간단한 경우)이나 통째로 레이아웃 자체(<html>)을 바꿈
    @GetMapping("/fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }

    // <head>에 공통되는 부분을 한 곳에 모아두고 추가해서 쓰기(css, javascript)
    @GetMapping("/layout")
    public String layout() {
        return "template/layout/layoutMain";
    }

    // 헤더, 푸터 이런 영역은 모두 같고 실제 컨텐트 바디 부분이 다를 때, 컨텐트 부분만 바꾸기(html 태그 시작부터 통으로 바꾸기)
    @GetMapping("/layoutExtend")
    public String layoutExtend() {
        return "template/layoutExtend/layoutExtendMain";
    }


}

