package com.example.service.impl;

import com.example.dao.DemoDao;
import com.example.model.DemoEntity;
import com.example.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
@Component("demoService")
@Transactional
public class DemoServiceImpl implements DemoService {

    private static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    // also can use Autowired annotation
    private final DemoDao demoDao;

    public DemoServiceImpl(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    @Override
    public List<DemoEntity> getAllEntities() {
        List<DemoEntity> entities = demoDao.findAllEntities();
        logger.info("find entity count = {}", entities.size());
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
