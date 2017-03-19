package com.example.dao;


import com.example.model.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Nick on 2017/3/11.
 */
public interface DemoDao extends JpaRepository<DemoEntity, Long> {

    List<DemoEntity> findAllEntities();

    @Query("select e from DemoEntity e where e.id = ?1")
    DemoEntity getEntityById(Long id);

    @Query("from DemoEntity e where e.name = :name")
    DemoEntity findEntityByName(@Param("name") String name);
}
