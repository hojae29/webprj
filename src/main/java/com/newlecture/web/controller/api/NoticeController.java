package com.newlecture.web.controller.api;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

// 프로젝트 내에 NoticeController가 2개 있기 때문에 이름 설정
@RestController("apiNoticeController")
@RequestMapping("/api/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/list")
    public List<Notice> list() throws SQLException, ClassNotFoundException {

        List<Notice> list = noticeService.getList(1, "title", "");

        return list;
    }
}
