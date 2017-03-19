package com.example.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Nick on 2017/3/11.
 */
@Entity
@NamedQuery(name="DemoEntity.findAllEntities", query="SELECT e FROM DemoEntity e")
@Table(name = "DemoEntity")
@Data
public class DemoEntity implements Serializable{
    @Id
    @Column(name = "ENTITY_ID")
    private Long id;

    @Column(name = "ENTITY_NAME")
    private String name;

    @Column(name = "ENTITY_COMMENT")
    private String comment;

}
