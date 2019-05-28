package com.briup.apps.app01.service;

import com.briup.apps.app01.bean.Phone;

import java.util.List;

public interface IPhoneService {
    List<Phone> findAll();

    void saveOrUpdate(Phone phone);

    Phone findById(Long id);
}
