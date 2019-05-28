package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.Phone;
import com.briup.apps.app01.bean.PhoneExample;
import com.briup.apps.app01.mapper.PhoneMapper;
import com.briup.apps.app01.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PhoneServiceImpl implements IPhoneService {
    @Resource
    private PhoneMapper mapper;
    @Override
    public List<Phone> findAll() {
        PhoneExample example=new PhoneExample();
        return mapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Phone phone) {
        if(phone.getId()!=null){

        } else {
            phone.setStatus("正常");
            mapper.insert(phone);
        }
    }

    @Override
    public Phone findById(Long id) {
        PhoneExample example = new PhoneExample();
        example.createCriteria().andIdEqualTo(id);
        List<Phone> list = mapper.selectByExample(example);
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }

}
