package ru.amokb.api.entity.patient;

import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.persistence.Entity;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

import ru.amokb.api.entity.BaseEntity;

@Entity
public class Patient extends BaseEntity {

    private String phone;
    private String notice;
    private String patientSync;
    private String firstname;
    private String lastname;
    private String middlename;
    private Date birthdate;
    private String snils;
    private String commonNumber;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String aPhone) {
        phone = aPhone;
    }

    @PostPersist
    @PostUpdate
    protected void syncAddresses() {
        // адрес проживания пустой
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String aFirstname) {
        firstname = aFirstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String aLastname) {
        lastname = aLastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String aMiddlename) {
        middlename = aMiddlename;
    }

    public Date getBirthday() {
        return birthdate;
    }

    public void setBirthday(Date aBirthdate) {
        birthdate = aBirthdate;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String aNotice) {
        notice = aNotice;
    }

    public String getPatientInfo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        StringBuilder sb = new StringBuilder();
        add(sb, lastname, "");
        add(sb, firstname, " ");
        add(sb, middlename, " ");
        if (getBirthday() != null) {
            add(sb, " г.р.", " ");
            add(sb, simpleDateFormat.format(getBirthday()), " ");
        }
        return sb.toString();
    }

    public String getPatientSync() {
        return patientSync;
    }

    public void setPatientSync(String aPatientSync) {
        patientSync = aPatientSync;
    }

    private static void add(StringBuilder aSb, String aStr, String aPre) {
        if (aStr != null && !aStr.equals("")) {
            if (aSb.length() != 0) aSb.append(aPre);
            aSb.append(aStr);
        }
    }

    public String getCommonNumber() {
        return commonNumber;
    }

    public void setCommonNumber(String aNumber) {
        commonNumber = aNumber;
    }
}
