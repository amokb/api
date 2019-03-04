package ru.amokb.api.entity.lpu;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;

import javax.persistence.*;

/**
 * ЛПУ
 */
@Entity(name="MisLpu")
@Table(schema="SQLUser")
public class MisLpu extends BaseEntity {

    /** Наименование ЛПУ */
    @Comment("Наименование ЛПУ")
    public String getName() { return theName ; }
    public void setName(String aName) { theName = aName ; }
    private String theName;


    /** Код ОМС */
    @Comment("Код ОМС")
    public String getOmcCode() { return theOmcCode ; }
    public void setOmcCode(String aOmcCode) { theOmcCode = aOmcCode ; }
    private String theOmcCode;

    /** ОГРН */
    @Comment("ОГРН")
    public Long getOgrn() { return theOgrn ; }
    public void setOgrn(Long aOgrn) { theOgrn = aOgrn ; }
    private Long theOgrn;

}