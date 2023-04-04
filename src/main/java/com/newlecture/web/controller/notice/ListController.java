package com.newlecture.web.controller.notice;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ListController implements Controller {

    @Autowired
    private NoticeService noticeService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mv = new ModelAndView("notice.list");
        List<Notice> list = noticeService.getList(1, "TITLE", "");
        mv.addObject("list", list);
        return mv;
    }
}
