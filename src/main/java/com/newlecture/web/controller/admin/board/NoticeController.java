package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {

    @RequestMapping("/list")
    public String list() {
        return "";
    }

    @ResponseBody
    @RequestMapping("/reg")
    public String reg(String title, String content) {

        return String.format("title:%s<br> content:%s<br>", title, content);
    }

    @RequestMapping("/edit")
    public String edit() {
        return "";
    }

    @RequestMapping("del")
    public String del(){
        return "";
    }
}
