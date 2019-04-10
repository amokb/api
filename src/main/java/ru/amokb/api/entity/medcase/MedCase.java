package ru.amokb.api.entity.medcase;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.patient.Patient;

@Entity
@Table(schema = "SQLUser")
abstract public class MedCase extends BaseEntity {

    private Patient patient;
    private Date dateStart;
    private Boolean isUpload = false;

    @Comment("Пациент")
    @ManyToOne
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient aNewProperty) {
        patient = aNewProperty;
    }

    @Comment("Дата начала")
    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date aNewProperty) {
        dateStart = aNewProperty;
    }

    @Comment("Выгружено")
    public Boolean getUpload() {
        return isUpload;
    }

    public void setUpload(Boolean upload) {
        isUpload = upload;
    }
}
