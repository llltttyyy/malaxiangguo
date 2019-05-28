package com.briup.apps.app01.service;

import com.briup.apps.app01.bean.Student;
import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.bean.extend.StudentSCExtend;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void saveOrUpdate(User user);

    void deleteuser(Long id);

    void deletebatsh(Long[] id);

    List<User> findByType(String type);

    User findById(Long id);
}
