package ru.amokb.api.entity.workcalendar;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Тип резерва обслуживания
 * @author azviagin
 *
 */
@Comment("Тип резерва обслуживания")
@Entity
@Table(schema="SQLUser")
public class VocServiceReserveType extends BaseEntity {
	/** Название */
	@Comment("Наименование")
	public String getName() { return theName ; }
	public void setName(String aName) { theName = aName ; }
	private String theName ;

	/** Внешний код */
	@Comment("Внешний код")
	public String getCode() {return theCode;}
	public void setCode(String aCode) { theCode = aCode;}
	private String theCode;


}
