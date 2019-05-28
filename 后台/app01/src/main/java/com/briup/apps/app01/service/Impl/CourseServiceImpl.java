package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.CourseExample;
import com.briup.apps.app01.bean.extend.CourseExtend;
import com.briup.apps.app01.mapper.CourseMapper;
import com.briup.apps.app01.mapper.extend.CourseExtendMpper;
import com.briup.apps.app01.service.ICourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CourseServiceImpl implements ICourseService {
    @Resource
    private CourseMapper courseMapper;

    @Resource
    private CourseExtendMpper courseExtendMpper;

    @Override
    public List<CourseExtend> findAllWithTeacher() {
        return courseExtendMpper.selectAll();
    }

//    @Override
//    public void saveOrUpdateWithTeacher(CourseExtend courseExtend) {
//        if(courseExtend.getId()!=null){
//            //保存
//            courseExtendMpper.insert1(courseExtend);
//            courseExtendMpper.insert2(courseExtend);
//        } else {
//            //通过id来修改
//            courseExtendMpper.updateByPrimaryKey(courseExtend);
//        }
//    }

    @Override
    public List<Course> findAll() {
        CourseExample example=new CourseExample();
        return courseMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Course course) {
        if(course.getId()!=null){
            courseMapper.updateByPrimaryKey(course);

        } else{
            courseMapper.insert(course);
        }
    }

    @Override
    public Course findById(Long id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteCourse(Long id) {
        courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deletebatsh(Long[] id) {
        courseMapper.deleteByPrimaryKeybatsh(id);
    }
}
