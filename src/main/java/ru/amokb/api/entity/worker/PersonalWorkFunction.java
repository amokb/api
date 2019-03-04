package ru.amokb.api.entity.worker;

import ru.amokb.api.annotation.Comment;

import javax.persistence.*;

/**
 * Персональная рабочая функция
 * @author stkacheva,azviagin
 *
 */
@Entity
@Table(schema="SQLUser")
public class PersonalWorkFunction extends WorkFunction {
	/** Сотрудник */
	@Comment("Сотрудник")
	@ManyToOne
	public Worker getWorker() {return theWorker;}
	public void setWorker(Worker aWorkers) {theWorker = aWorkers;}
	/** Сотрудник */
	private Worker theWorker;

	@Transient
    @Comment("Информация о работнике")
	public String getWorkerInfo() {
		return theWorker!=null ? theWorker.getWorkerInfo() : "" ;
	}
    private static void add(StringBuilder aSb, String aStr, String aPre) {
     	if(aSb.length()!=0) aSb.append(aPre) ;
        aSb.append(aStr) ;
    }

	@Transient
    @Comment("Информация")
	public String getWorkFunctionInfo() {
		return getName() + " " + getWorkerInfo();
	}
	/** Групповая рабочая функция */
	@Comment("Групповая рабочая функция")
	@ManyToOne
	public GroupWorkFunction getGroup() {return theGroup;}
	public void setGroup(GroupWorkFunction aGroup) {theGroup = aGroup;}

	/** Групповая рабочая функция */
	private GroupWorkFunction theGroup;

}
