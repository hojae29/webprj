package com.newlecture.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 프로젝트 내에 NoticeController가 2개 있기 때문에 이름 설정
@RestController("apiNoticeController")
@RequestMapping("/api/notice")
public class NoticeController {

    @RequestMapping("/list")
    public String list() {
        return "공지사항 list";
    }
}
