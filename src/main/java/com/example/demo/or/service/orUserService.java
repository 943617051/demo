package com.example.demo.or.service;

import com.example.demo.or.bean.Tuan;
import com.example.demo.or.bean.User;

import java.util.HashMap;
import java.util.List;

public interface orUserService {
    void del(int id);

    void update(Tuan tu);

    Tuan xiu(int id);

    void add(Tuan tuan);

    List list(HashMap<String, Object> map);

    int count();

    User login(User user);
}
