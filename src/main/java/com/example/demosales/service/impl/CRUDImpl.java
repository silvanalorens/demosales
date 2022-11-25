package com.example.demosales.service.impl;

import com.example.demosales.repo.IGenericRepo;
import com.example.demosales.service.ICRUD;

import java.util.List;

public abstract class CRUDImpl<T,ID> implements ICRUD<T,ID> {
    protected abstract IGenericRepo<T,ID> getRepo();
    @Override
    public T save(T t){
        return getRepo().save(t);
    }
    @Override
    public T update(T t){
        return getRepo().save(t);
    }
    @Override
    public List<T> findAll(){
        return getRepo().findAll();
    }
    @Override
    public T findById(ID id){
        return getRepo().findById(id).get();
    }
    @Override
    public void delete(ID id){
        getRepo().deleteById(id);
    }
}
