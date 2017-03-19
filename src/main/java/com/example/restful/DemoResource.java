package com.example.restful;

import com.example.model.DemoEntity;
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoResource {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Transactional(readOnly = true)
    public List<DemoEntity> getAllUsers()
    {
        List<DemoEntity> entities = demoService.getAllEntities();
        return entities;
    }

    @RequestMapping(value = "/user/id/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DemoEntity getUserById(@PathVariable("id") String id)
    {
        DemoEntity entity = demoService.getEntityById(Long.valueOf(id));
        return entity;
    }

    @RequestMapping(value = "/user/name/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DemoEntity getUserByName(@PathVariable("name") String name)
    {
        DemoEntity entity = demoService.findEntityByName(name);
        return entity;
    }
}
