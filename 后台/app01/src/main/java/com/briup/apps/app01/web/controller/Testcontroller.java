package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.Phone;
import com.briup.apps.app01.service.IPhoneService;
import com.briup.apps.app01.service.Impl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class Testcontroller {
    @Autowired
    private IPhoneService phoneService;
    /**
     *http://127.0.0.1:8888/test/hello
     *
     */
    @GetMapping("findAll")
    public List<Phone> findAll(){
        return phoneService.findAll();
    }
    @GetMapping("findById")
    public Phone findById(long id){
        return phoneService.findById(id);
    }
    @PostMapping("saveOrUpdate")
    public String saveOrUpdate( Phone phone){
        phoneService.saveOrUpdate(phone);
        return "sucess";
    }
}
