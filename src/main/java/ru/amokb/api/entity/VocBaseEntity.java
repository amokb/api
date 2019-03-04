package ru.amokb.api.entity;

import ru.amokb.api.annotation.Comment;

import javax.persistence.MappedSuperclass;

//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Справочник
 */
@MappedSuperclass
public class VocBaseEntity extends  BaseEntity {

    /** Название */
    @Comment("Наименование")
    public String getName() { return theName ; }
    public void setName(String aName) { theName = aName ; }

    /** Внешний код */
    @Comment("Внешний код")
    public String getCode() {return theCode;}
    public void setCode(String aCode) {theCode = aCode;}

    /** Внешний код */
    private String theCode;
    /** Название */
    private String theName ;

}
