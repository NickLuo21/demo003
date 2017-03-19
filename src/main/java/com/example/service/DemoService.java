package com.example.service;

import com.example.model.DemoEntity;

import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
public interface DemoService {

    List<DemoEntity> getAllEntities();
    DemoEntity getEntityById(Long id);
    DemoEntity findEntityByName(String name);
}
