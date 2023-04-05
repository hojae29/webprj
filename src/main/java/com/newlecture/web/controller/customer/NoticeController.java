package com.newlecture.web.controller.customer;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/customer/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/list")
    public String list(String p) throws SQLException, ClassNotFoundException {
        System.out.println(p);
        List<Notice> list = noticeService.getList(1, "TITLE", "");
        return "notice.list";
    }

    @RequestMapping("/detail")
    public String detail() {
        return "notice.detail";
    }
}
