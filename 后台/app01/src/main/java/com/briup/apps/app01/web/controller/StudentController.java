package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.service.IUserService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IUserService userService;

    @GetMapping("findAll")
    private Message findAll(){
        String type="学生";
        List<User> list=userService.findByType(type);
        System.out.println(list);
        return MessageUtils.success(list);

    }

    @GetMapping("findById")
    private Message findById(Long id){
        User user=userService.findById(id);
        return MessageUtils.success(user);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(User user){
        userService.saveOrUpdate(user);
        return MessageUtils.success("操作成功");
    }

    @GetMapping("delete")
    private Message delete(Long id){
        userService.deleteuser(id);
        return MessageUtils.success("操作成功");
    }

    @PostMapping("deletebatch")
    private Message deletebatch(@RequestBody Long[] id){
        userService.deletebatsh(id);
        return MessageUtils.success("操作成功");
    }
}
