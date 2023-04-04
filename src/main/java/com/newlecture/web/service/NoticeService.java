package com.newlecture.web.service;

import com.newlecture.web.entity.Notice;

import java.sql.SQLException;
import java.util.List;

public interface NoticeService {
    public List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;

    public int getCount() throws ClassNotFoundException, SQLException;

    public int insert(Notice notice) throws SQLException, ClassNotFoundException;

    public int update(Notice notice) throws SQLException, ClassNotFoundException;

    public int delete(int id) throws ClassNotFoundException, SQLException;
}