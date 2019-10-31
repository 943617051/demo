package com.example.demo.or.mapper;

import java.util.HashMap;
import java.util.List;

import com.example.demo.or.bean.Tuan;
import com.example.demo.or.bean.User;

public interface orUserMapper {

	User login(User user);

	int count();

	List list(HashMap<String, Object> map);

	void add(Tuan tuan);

	Tuan xiu(int id);

	void update(Tuan tu);

	void del(int id);

}
