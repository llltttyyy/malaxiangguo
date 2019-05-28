package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.Student;
import com.briup.apps.app01.bean.StudentExample;
import com.briup.apps.app01.bean.extend.StudentSCExtend;
import com.briup.apps.app01.mapper.StudentMapper;
import com.briup.apps.app01.mapper.extend.StudentSCExtendMapper;
import com.briup.apps.app01.service.IStudentSCService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentSCServiceImpl implements IStudentSCService {
    @Resource
    private StudentMapper studentMapper;

    @Resource
    private StudentSCExtendMapper studentExtendMapper;

    @Override
    public List<Student> findAll() {
        StudentExample example=new StudentExample();
        return studentMapper.selectByExample(example);
    }

    @Override
    public Student findById(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<StudentSCExtend> findAllWith() {
        return studentExtendMapper.selectAll();
    }

    @Override
    public void saveOrUpdate(Student student) {
        if(student.getId()!=null){
            studentMapper.updateByPrimaryKey(student);

        } else{
            studentMapper.insert(student);
        }
    }

    @Override
    public void deleteStudentSC(Long id) {
        studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deletebatsh(Long[] id) {
        studentMapper.deleteByPrimaryKeybatsh(id);
    }

}
