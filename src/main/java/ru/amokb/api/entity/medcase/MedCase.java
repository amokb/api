package ru.amokb.api.entity.medcase;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.patient.Patient;

import javax.persistence.*;
import java.sql.Date;

/**
 * Случай медицинского обслуживания
 */
@Entity
@Table(schema="SQLUser")
abstract public class MedCase extends BaseEntity {

	/** Пациент */
	@Comment("Пациент")
	@ManyToOne
	public Patient getPatient() {return thePatient;}
	public void setPatient(Patient aNewProperty) {thePatient = aNewProperty;}
	private Patient thePatient;

	/**Дата начала */
	@Comment("Дата начала")
	public Date getDateStart() {return theDateStart;}
	public void setDateStart(Date aNewProperty) {theDateStart = aNewProperty;}
	private Date theDateStart;
	

	private Boolean isUpload=false;
	@Comment("Выгружено")
	public Boolean getUpload() {
		return isUpload;
	}
	public void setUpload(Boolean upload) {
		isUpload = upload;
	}
}
