package com.example.demosales.service.impl;

import com.example.demosales.model.Product;
import com.example.demosales.repo.IGenericRepo;
import com.example.demosales.repo.IPersonRepo;
import com.example.demosales.repo.IProductRepo;
import com.example.demosales.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends CRUDImpl<Product,Integer> implements IProductService {
    @Autowired
    protected IProductRepo productRepo;
    @Override
    protected IGenericRepo<Product, Integer> getRepo() {
        return productRepo;
    }


}
