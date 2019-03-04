package ru.amokb.api.entity.workcalendar;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.medcase.MedCase;
import ru.amokb.api.entity.patient.Patient;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Рабочее время
 * @author azviagin
 *
 */
@Comment("Рабочее время")
@Entity
@Table(schema="SQLUser")
public class WorkCalendarTime extends BaseEntity {

	/** Удаленная запись */
	@Comment("Удаленная запись")
	public Boolean getIsDeleted() {return theIsDeleted;}
	public void setIsDeleted(Boolean aIsDeleted) {theIsDeleted = aIsDeleted;}
	/** Удаленная запись */
	private Boolean theIsDeleted ;

	
	/** Рабочий день */
	@Comment("Рабочий день")
	@ManyToOne
	public WorkCalendarDay getWorkCalendarDay() {
		return theWorkCalendarDay;
	}
	public void setWorkCalendarDay(WorkCalendarDay aWorkCalendarDay) {
		theWorkCalendarDay = aWorkCalendarDay;
	}
	/** Рабочий день */
	private WorkCalendarDay theWorkCalendarDay;
	
	/** Время начала */
	@Comment("Время начала")
	public Time getTimeFrom() {
		return theTimeFrom;
	}
	public void setTimeFrom(Time aTimeFrom) {
		theTimeFrom = aTimeFrom;
	}
	/** Время начала */
	private Time theTimeFrom;
	
	/** СМО */
	@Comment("СМО")
	@OneToOne
	public MedCase getMedCase() {
		return theMedCase;
	}
	public void setMedCase(MedCase aMedCase) {
		theMedCase = aMedCase;
	}
	/** СМО */
	private MedCase theMedCase;
	
	/** Добавочное время */
	@Comment("Добавочное время")
	public Boolean getAdditional() {
		return theAdditional;
	}
	public void setAdditional(Boolean aAdditional) {
		theAdditional = aAdditional;
	}
	/** Добавочное время */
	private Boolean theAdditional;

	/** Пациент информации */
	@Comment("Пациент информации")
	public String getPrePatientInfo() {
		return thePrePatientInfo;
	}
	public void setPrePatientInfo(String aPatientInfo) {
		thePrePatientInfo = aPatientInfo;
	}
	/** Пациент информации */
	private String thePrePatientInfo;
	
	/** Пациент пред.пациента */
	@Comment("Пациент пред.пациента")
	@OneToOne
	public Patient getPrePatient() {return thePrePatient;}
	public void setPrePatient(Patient aPrePatient) {thePrePatient = aPrePatient;}
	/** Пациент пред.пациента */
	private Patient thePrePatient;

	
	/** Пользователь, создавший пред.запись */
	@Comment("Пользователь, создавший пред.запись")
	public String getCreatePreRecord() {
		return theCreatePreRecord;
	}

	public void setCreatePreRecord(String aCreatePreRecord) {
		theCreatePreRecord = aCreatePreRecord;
	}
	
	/** Дата создания предварительной записи */
	@Comment("Дата создания предварительной записи")
	public Date getCreateDatePreRecord() {return theCreateDatePreRecord;}
	public void setCreateDatePreRecord(Date aCreateDatePreRecord) {theCreateDatePreRecord = aCreateDatePreRecord;}

	/** Время создания предварительной записи */
	@Comment("Время создания предварительной записи")
	public Time getCreateTimePreRecord() {
		return theCreateTimePreRecord;
	}
	public void setCreateTimePreRecord(Time aCreateTimePreRecord) {
		theCreateTimePreRecord = aCreateTimePreRecord;
	}

	/** Время создания предварительной записи */
	private Time theCreateTimePreRecord;
	/** Дата создания предварительной записи */
	private Date theCreateDatePreRecord;
	/** Пользователь, создавший пред.запись */
	private String theCreatePreRecord;
	
	/** Резерв времени */
	@Comment("Резерв времени")
	@OneToOne
	public VocServiceReserveType getReserveType() {
		return theReserveType;
	}
	public void setReserveType(VocServiceReserveType aReserveType) {
		theReserveType = aReserveType;
	}
	/** Резерв времени */
	private VocServiceReserveType theReserveType;
	
	/** Номер телефона */
	@Comment("Номер телефона")
	public String getPhone() {return thePhone;}
	public void setPhone(String aPhone) {thePhone = aPhone;}

	/** Номер телефона */
	private String thePhone;
	
	/**
	 * Примечание пациента (при записи)*/
	@Comment("Примечание пациента")
	public String getPatientComment() {return thePatientComment;}
	public void setPatientComment(String aPatientComment) {thePatientComment = aPatientComment;}
	/** Примечание пациента */
	private String thePatientComment ;
}
