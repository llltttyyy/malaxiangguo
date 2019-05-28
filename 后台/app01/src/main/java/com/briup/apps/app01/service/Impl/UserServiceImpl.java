package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.bean.UserExample;
import com.briup.apps.app01.mapper.UserMapper;
import com.briup.apps.app01.service.IUserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        UserExample example=new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(User user) {
        if(user.getId()!=null){
            userMapper.updateByPrimaryKey(user);

        } else{
            userMapper.insert(user);
        }
    }

    @Override
    public void deleteuser(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deletebatsh(Long[] id) {
        userMapper.deleteByPrimaryKeybatsh(id);
    }

    @Override
    public List<User> findByType(String type) {
        UserExample example=new UserExample();
        example.createCriteria().andTypeEqualTo(type);
        return userMapper.selectByExample(example);
    }

    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
