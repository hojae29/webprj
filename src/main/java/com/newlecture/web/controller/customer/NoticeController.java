package com.newlecture.web.controller.customer;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/customer/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "p", required = false) Integer page) throws SQLException, ClassNotFoundException {
        System.out.println(page);
        List<Notice> list = noticeService.getList(1, "TITLE", "");
        return "notice.list";
    }

    @RequestMapping("/detail")
    public String detail() {
        return "notice.detail";
    }
}
