package ru.amokb.api.entity;

import javax.persistence.MappedSuperclass;

import ru.amokb.api.annotation.Comment;

@MappedSuperclass
public class VocBaseEntity extends BaseEntity {

    private String code;
    private String name;

    @Comment("Наименование")
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    @Comment("Внешний код")
    public String getCode() {
        return code;
    }

    public void setCode(String aCode) {
        code = aCode;
    }
}
