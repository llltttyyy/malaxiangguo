package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.Student;
import com.briup.apps.app01.bean.extend.StudentSCExtend;
import com.briup.apps.app01.service.IStudentSCService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/studentsc")
public class StudentSCController {
    @Autowired
    private IStudentSCService studentService;

    @GetMapping("findAll")
    private Message findAll(){
        List<Student> list=studentService.findAll();
        return MessageUtils.success(list);
    }

    @GetMapping("findById")
    private Message findById(Long id){
        Student course=studentService.findById(id);
        return MessageUtils.success(course);
    }

    @GetMapping("findAllWith")
    private Message findAllWith(){
        List<StudentSCExtend> list=studentService.findAllWith();
        return MessageUtils.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(Student student){
        studentService.saveOrUpdate(student);
        return MessageUtils.success("操作成功");
    }

    @GetMapping("delete")
    private Message delete(Long id){
        studentService.deleteStudentSC(id);
        return MessageUtils.success("操作成功");
    }

    @PostMapping("deletebatch")
    private Message deletebatch(@RequestBody Long[] id){
        studentService.deletebatsh(id);
        return MessageUtils.success("操作成功");
    }
}
