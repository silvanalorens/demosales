package com.example.demosales.service.impl;

import com.example.demosales.model.Person;
import com.example.demosales.repo.IGenericRepo;
import com.example.demosales.repo.IPersonRepo;
import com.example.demosales.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends CRUDImpl<Person,Integer> implements IPersonService {
    @Autowired
    protected IPersonRepo personRepo;
    @Override
    protected IGenericRepo<Person, Integer> getRepo() {
        return personRepo;
    }

}
