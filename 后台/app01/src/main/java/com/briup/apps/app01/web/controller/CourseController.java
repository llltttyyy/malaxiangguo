package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.extend.CourseExtend;
import com.briup.apps.app01.service.ICourseService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping("findAllWithTeacher")
    private Message findAllWithTeacher(){
        List<CourseExtend> list=courseService.findAllWithTeacher();
        return MessageUtils.success(list);
    }

//    @GetMapping("saveOrUpdateWithTeacher")
//    private Message saveOrUpdateWithTeacher(CourseExtend courseExtend){
//        courseService.saveOrUpdateWithTeacher(courseExtend);
//        return MessageUtils.success("操作成功");
//    }

    @GetMapping("findAll")
    private Message findAll(){
        List<Course> list=courseService.findAll();
        return MessageUtils.success(list);
    }

    @GetMapping("findById")
    private Message findById(Long id){
        Course course=courseService.findById(id);
        return MessageUtils.success(course);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(Course course){
        courseService.saveOrUpdate(course);
        return MessageUtils.success("操作成功");
    }

    @GetMapping("delete")
    private Message delete(Long id){
        courseService.deleteCourse(id);
        return MessageUtils.success("操作成功");
    }

    @PostMapping("deletebatch")
    private Message deletebatch(@RequestBody Long[] id){
        System.out.println(Arrays.toString(id));
        courseService.deletebatsh(id);
        return MessageUtils.success("操作成功");
    }

}
