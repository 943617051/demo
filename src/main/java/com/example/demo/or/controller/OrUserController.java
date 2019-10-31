package com.example.demo.or.controller;

import com.example.demo.or.bean.Tuan;
import com.example.demo.or.bean.User;
import com.example.demo.or.service.orUserService;
import com.example.demo.or.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class OrUserController {
    @Autowired private orUserService userService;

    
    /**
     * 登录拦截
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, HttpSession session)
    {
        User user1=userService.login(user);
        if(user1!=null)
        {
            session.setAttribute("user", user1);
            return "redirect:list";
        }
        else
        {
            return "redirect:login.jsp";
        }

    }

    /**
     * 查询列表
     * @param request
     * @param page
     * @return
     */
    @RequestMapping("/list")
    public String list(HttpServletRequest request, String page)
    {
        int count=userService.count();
        PageUtil pageUtil = new PageUtil(page, count,2);
        request.setAttribute("pageUtil", pageUtil);
        HashMap<String, Object> map = new HashMap<String,Object>();
        System.out.println(pageUtil.getPageSize());
        System.err.println(pageUtil.getStartIndex());
        map.put("pageSize", pageUtil.getPageSize());
        map.put("startIndex", pageUtil.getStartIndex());
        List list=userService.list(map);
        request.setAttribute("list", list);
        return "list";
    }

    /**
     * 添加
     * @param tuan
     * @return
     */
    @RequestMapping("/add")
    public String add(Tuan tuan)
    {
        userService.add(tuan);
        return "redirect:list";
    }

    /**
     * 修改回显
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/xiu")
    public String add(int id,HttpServletRequest request)
    {
       Tuan s=userService.xiu(id);
        request.setAttribute("s", s);
        return "update";
    }

    /**
     * 修改操作
     * @param tu
     * @return
     */
    @RequestMapping("/update")
    public String update(Tuan tu)
    {
        userService.update(tu);
        return "redirect:list";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public String del(int id) {
        userService.del(id);
        return "redirect:list";
    }
}
