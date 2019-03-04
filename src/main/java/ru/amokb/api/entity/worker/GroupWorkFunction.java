package ru.amokb.api.entity.worker;

import ru.amokb.api.annotation.Comment;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Групповая рабочая функция
 * @author stkacheva, azviagin
 */
@Entity
@Table(schema="SQLUser")
public class GroupWorkFunction extends WorkFunction {

	@Transient
    @Comment("Информация")
	public String getWorkFunctionInfo() {
		return getName() + " " + theGroupName;
	}

	@Transient
	public String getWorkerInfo() {
		return theGroupName ;
	}
	
	/** Название группы */
	@Comment("Название группы")
	public String getGroupName() {return theGroupName;}
	public void setGroupName(String aGroupName) {theGroupName = aGroupName;}
	/** Название группы */
	private String theGroupName;
	
	@Transient
	public String getInfo() {
		return "ГРУППОВАЯ: " + getGroupName();
	}
	


}
