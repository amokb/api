package ru.amokb.api.entity;

import javax.persistence.*;

@MappedSuperclass
/**Базовый класс для всех сущностей*/
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    private Integer id;
}
