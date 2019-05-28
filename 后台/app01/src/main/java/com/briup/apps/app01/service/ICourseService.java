package com.briup.apps.app01.service;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.Phone;
import com.briup.apps.app01.bean.extend.CourseExtend;

import java.util.List;

public interface ICourseService {
    List<CourseExtend> findAllWithTeacher();

//    void saveOrUpdateWithTeacher(CourseExtend courseExtend);

    List<Course> findAll();

    void saveOrUpdate(Course course);

    Course findById(Long id);

    void deleteCourse(Long id);

    void deletebatsh(Long[] id);
}
