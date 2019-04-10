package ru.amokb.api.entity.lpu;

import javax.persistence.Entity;
import javax.persistence.Table;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;

@Entity(name = "MisLpu")
@Table(schema = "SQLUser")
public class MisLpu extends BaseEntity {

    private String omcCode;
    private String name;
    private Long theOgrn;

    @Comment("Наименование ЛПУ")
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    @Comment("Код ОМС")
    public String getOmcCode() {
        return omcCode;
    }

    public void setOmcCode(String aOmcCode) {
        omcCode = aOmcCode;
    }

    @Comment("ОГРН")
    public Long getOgrn() {
        return theOgrn;
    }

    public void setOgrn(Long aOgrn) {
        theOgrn = aOgrn;
    }
}