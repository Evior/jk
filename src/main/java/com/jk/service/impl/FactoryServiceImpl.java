package com.jk.service.impl;

import com.jk.mapper.FactoryMapper;
import com.jk.pojo.Factory;
import com.jk.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Service
public class FactoryServiceImpl implements FactoryService {

    @Autowired
    private FactoryMapper factoryMapper;

    @Override
    public List<Factory> find(Factory factory) {
        List<Factory> factories = factoryMapper.find(factory);
        return factories;
    }

    @Override
    public Factory get(Serializable id) {
        Factory factory = factoryMapper.get(id);
        return factory;
    }

    @Override
    public void insert(Factory factory) {
          factoryMapper.insert(factory);
    }

    @Override
    public void update(Factory factory) {
          factoryMapper.update(factory);
    }

    @Override
    public void delete(Serializable id) {
          factoryMapper.delete(id);
    }

    @Override
    public void delteBatch(Serializable[] id) {
         factoryMapper.delteBatch(id);
    }

    @Override
    public void changState(Map<String, Object> map) {
         factoryMapper.changState(map);
    }
}
