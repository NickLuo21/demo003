package com.example.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Nick on 2017/3/11.
 */
@Entity
@NamedQuery(name="DemoEntity.findAllEntities", query="SELECT e FROM DemoEntity e")
@Table(name = "DemoEntity")
public class DemoEntity implements Serializable{
    @Id
    @Column(name = "ENTITY_ID")
    private Long id;

    @Column(name = "ENTITY_NAME")
    private String name;

    @Column(name = "ENTITY_COMMENT")
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
