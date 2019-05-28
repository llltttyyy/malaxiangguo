package com.briup.apps.app01.service;

import com.briup.apps.app01.bean.Student;
import com.briup.apps.app01.bean.extend.StudentSCExtend;

import java.util.List;

public interface IStudentSCService {
    List<Student> findAll();

    Student findById(Long id);

    List<StudentSCExtend> findAllWith();

    void saveOrUpdate(Student student);

    void deleteStudentSC(Long id);

    void deletebatsh(Long[] id);

}
