package com.briup.apps.app01.bean.extend;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.User;

public class CourseExtend extends Course {
    private User teacher;
    public User getTeacher(){
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }


}
