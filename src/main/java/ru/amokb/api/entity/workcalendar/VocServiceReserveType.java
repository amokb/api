package ru.amokb.api.entity.workcalendar;

import javax.persistence.Entity;
import javax.persistence.Table;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;

@Entity
@Table(schema = "SQLUser")
public class VocServiceReserveType extends BaseEntity {

    private String name;
    private String code;

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
