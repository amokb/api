package ru.amokb.api.entity.worker;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.lpu.MisLpu;
import ru.amokb.api.entity.workcalendar.WorkCalendar;
import ru.amokb.api.entity.worker.voc.VocWorkFunction;

import javax.persistence.*;
import java.sql.Date;

/**
 * Место работы
 */
@Entity
@Comment("Рабочая функция")
@Table(schema="SQLUser")
abstract public class WorkFunction extends BaseEntity {

	/** Дата начала работы */
	@Comment("Дата начала работы")
	public Date getStartDate() {return theStartDate;}
	public void setStartDate(Date aStartDate) {theStartDate = aStartDate;}
	/** Дата начала работы */
	private Date theStartDate;

	/** Дата окончания работы */
	@Comment("Дата окончания работы")
	public Date getFinishDate() {return theFinishDate;}
	public void setFinishDate(Date aFinishDate) {theFinishDate = aFinishDate;}
	/** Дата окончания работы */
	private Date theFinishDate;

	/** Рабочий календарь */
	@Comment("Рабочий календарь")
	@OneToOne
	@Deprecated
	public WorkCalendar getWorkCalendar() {
		return theWorkCalendar;
	}
	public void setWorkCalendar(WorkCalendar aWorkCalendars) {
		theWorkCalendar = aWorkCalendars;
	}
	/** Рабочий календарь */
	private WorkCalendar theWorkCalendar;
  
    /** Наименование */
	@Comment("Наименование")
	@Transient
	public String getName() {
		StringBuilder ret = new StringBuilder() ;
		if (theWorkFunction!=null) ret.append(theWorkFunction.getName()) ;
		return ret.toString() ;
	}
	
	
	@Transient
    @Comment("Информация")
	public String getWorkFunctionInfo() {
		return getName() ;
	}

	/** Функция */
	@Comment("Функция")
	@OneToOne
	public VocWorkFunction getWorkFunction() {
		return theWorkFunction;
	}

	public void setWorkFunction(VocWorkFunction aWorkFunction) {
		theWorkFunction = aWorkFunction;
	}

	/** Функция */
	private VocWorkFunction theWorkFunction;
	
	/** Поместить в архив */
	@Comment("Поместить в архив")
	public Boolean getArchival() {
		return theArchival;
	}

	public void setArchival(Boolean aArchival) {
		theArchival = aArchival;
	}

	/** Поместить в архив */
	private Boolean theArchival;
	
	@Transient
	public String getWorkerLpuInfo() {
		return "";
	}
	@Transient
	public String getInfo() {
		return "" ;
	}
	@Transient
	public boolean getViewDirect() {
		return true ;
	}
	@Transient
	public String getWorkerInfo() {
		return "" ;
	}
	
	/** ЛПУ */
	@Comment("ЛПУ")
	@ManyToOne
	public MisLpu getLpu() {return theLpu;}
	public void setLpu(MisLpu aLpu) {theLpu = aLpu;}
	/** ЛПУ */
	private MisLpu theLpu;
	/** Код специалиста */
	@Comment("Код специалиста")
	public String getCode() {return theCode;}
	public void setCode(String aCode) {theCode = aCode;}

	/** Код специалиста */
	private String theCode;
	
	/** Интервал разрешенной регистрации */
	@Comment("Интервал разрешенной регистрации")
	public Integer getRegistrationInterval() {return theRegistrationInterval;}
	public void setRegistrationInterval(Integer aRegistrationInterval) {theRegistrationInterval = aRegistrationInterval;}

	/** Интервал разрешенной регистрации */
	private Integer theRegistrationInterval;
	/** Операционная сестра */
	@Comment("Операционная сестра")
	public Boolean getIsInstrumentNurse() {
		return theIsInstrumentNurse;
	}

	public void setIsInstrumentNurse(Boolean aOperationSister) {
		theIsInstrumentNurse = aOperationSister;
	}

	/** Операционная сестра */
	private Boolean theIsInstrumentNurse;
	
	/** Комментарий */
	@Comment("Комментарий")
	public String getComment() {
		return theComment;
	}

	public void setComment(String aComment) {
		theComment = aComment;
	}

	/** Комментарий */
	private String theComment;
	/** Не показывать удаленным пользователям */
	@Comment("Не показывать удаленным пользователям")
	public Boolean getIsNoViewRemoteUser() {return theIsNoViewRemoteUser;}
	public void setIsNoViewRemoteUser(Boolean aNoViewRemoteUser) {theIsNoViewRemoteUser = aNoViewRemoteUser;}

	/** Не показывать удаленным пользователям */
	private Boolean theIsNoViewRemoteUser;


	private String promedCode_workstaff;
	@Comment("Код рабочего места в промеде")
	public String getPromedCode_workstaff() {
		return promedCode_workstaff;
	}
	public void setPromedCode_workstaff(String promedCode_workstaff) {
		this.promedCode_workstaff = promedCode_workstaff;
	}

	private String promedCode_lpusection;
	@Comment("Код рабочего места в промеде")
	public String getPromedCode_lpusection() {
		return promedCode_lpusection;
	}
	public void setPromedCode_lpusection(String promedCode_lpusection) {
		this.promedCode_lpusection = promedCode_lpusection;
	}
	/** Разрешено записывать на дату без указания времени */
	@Comment("Разрешено записывать на дату без указания времени")
	@Column(nullable=false, columnDefinition="boolean default false")
	public Boolean getIsDirectionNoTime() {return theIsDirectionNoTime;}
	public void setIsDirectionNoTime(Boolean aIsDirectionNoTime) {theIsDirectionNoTime = aIsDirectionNoTime;}
	/** Разрешено записывать на дату без указания времени */
	private Boolean theIsDirectionNoTime=false ;

}
