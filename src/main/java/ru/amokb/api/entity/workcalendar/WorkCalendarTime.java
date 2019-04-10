package ru.amokb.api.entity.workcalendar;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.medcase.MedCase;
import ru.amokb.api.entity.patient.Patient;

@Entity
@Table(schema = "SQLUser")
public class WorkCalendarTime extends BaseEntity {

    private Boolean isDeleted;
    private WorkCalendarDay workCalendarDay;
    private Time timeFrom;
    private Patient prePatient;
    private Time createTimePreRecord;
    private Date createDatePreRecord;
    private String createPreRecord;
    private VocServiceReserveType reserveType;
    private String phone;
    private String patientComment;
    private MedCase medCase;
    private Boolean additional;
    private String prePatientInfo;

    @Comment("Удаленная запись")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean aIsDeleted) {
        isDeleted = aIsDeleted;
    }

    @Comment("Рабочий день")
    @ManyToOne
    public WorkCalendarDay getWorkCalendarDay() {
        return workCalendarDay;
    }

    public void setWorkCalendarDay(WorkCalendarDay aWorkCalendarDay) {
        workCalendarDay = aWorkCalendarDay;
    }

    @Comment("Время начала")
    public Time getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Time aTimeFrom) {
        timeFrom = aTimeFrom;
    }

    @Comment("СМО")
    @OneToOne
    public MedCase getMedCase() {
        return medCase;
    }

    public void setMedCase(MedCase aMedCase) {
        medCase = aMedCase;
    }

    @Comment("Добавочное время")
    public Boolean getAdditional() {
        return additional;
    }

    public void setAdditional(Boolean aAdditional) {
        additional = aAdditional;
    }

    @Comment("Пациент информации")
    public String getPrePatientInfo() {
        return prePatientInfo;
    }

    public void setPrePatientInfo(String aPatientInfo) {
        prePatientInfo = aPatientInfo;
    }

    @Comment("Пациент пред.пациента")
    @OneToOne
    public Patient getPrePatient() {
        return prePatient;
    }

    public void setPrePatient(Patient aPrePatient) {
        prePatient = aPrePatient;
    }

    @Comment("Пользователь, создавший пред.запись")
    public String getCreatePreRecord() {
        return createPreRecord;
    }

    public void setCreatePreRecord(String aCreatePreRecord) {
        createPreRecord = aCreatePreRecord;
    }

    @Comment("Дата создания предварительной записи")
    public Date getCreateDatePreRecord() {
        return createDatePreRecord;
    }

    public void setCreateDatePreRecord(Date aCreateDatePreRecord) {
        createDatePreRecord = aCreateDatePreRecord;
    }

    @Comment("Время создания предварительной записи")
    public Time getCreateTimePreRecord() {
        return createTimePreRecord;
    }

    public void setCreateTimePreRecord(Time aCreateTimePreRecord) {
        createTimePreRecord = aCreateTimePreRecord;
    }

    @Comment("Резерв времени")
    @OneToOne
    public VocServiceReserveType getReserveType() {
        return reserveType;
    }

    public void setReserveType(VocServiceReserveType aReserveType) {
        reserveType = aReserveType;
    }

    @Comment("Номер телефона")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String aPhone) {
        phone = aPhone;
    }

    @Comment("Примечание пациента")
    public String getPatientComment() {
        return patientComment;
    }

    public void setPatientComment(String aPatientComment) {
        patientComment = aPatientComment;
    }
}
