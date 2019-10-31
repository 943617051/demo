package com.example.demo.or.service.Impl;

import com.example.demo.or.bean.Tuan;
import com.example.demo.or.bean.User;
import com.example.demo.or.mapper.orUserMapper;
import com.example.demo.or.service.orUserService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class orUserServiceImpl  implements orUserService {
    @Autowired
        private orUserMapper mapper;
    public User login(User user) {
        // TODO Auto-generated method stub
        return mapper.login(user);
    }

    public int count() {
        // TODO Auto-generated method stub
        return mapper.count();
    }

    public List list(HashMap<String, Object> map) {
        // TODO Auto-generated method stub
        return mapper.list(map);
    }

    public void add(Tuan tuan) {

        mapper.add(tuan);
    }

    public Tuan xiu(int id) {
        // TODO Auto-generated method stub
        return mapper.xiu(id);
    }

    public void update(Tuan tu) {
        mapper.update(tu);
    }

    public void del(int id) {
        mapper.del(id);

    }
}
