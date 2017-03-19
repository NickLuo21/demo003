package com.example.service.impl;

import com.example.dao.DemoDao;
import com.example.model.DemoEntity;
import com.example.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
@Component("demoService")
@Transactional
@Slf4j
public class DemoServiceImpl implements DemoService {

    // also can use Autowired annotation
    private final DemoDao demoDao;

    public DemoServiceImpl(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    @Override
    public List<DemoEntity> getAllEntities() {
        List<DemoEntity> entities = demoDao.findAllEntities();
        log.info("find entity count = {}", entities.size());
        return entities;
    }

    @Override
    public DemoEntity getEntityById(Long id) {
        DemoEntity entity = demoDao.getEntityById(id);
        return entity;
    }

    @Override
    public DemoEntity findEntityByName(String name) {
        DemoEntity entity = demoDao.findEntityByName(name);
        return entity;
    }
}
