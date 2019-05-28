package com.briup.apps.app01.bean.extend;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.Student;
import com.briup.apps.app01.bean.User;

public class StudentSCExtend extends Student {
    private User student;
    private Course course;

    public User getStudent(){
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
