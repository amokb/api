package ru.amokb.api.entity.patient;

import ru.amokb.api.entity.BaseEntity;

import javax.persistence.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

@Entity
public class Patient extends BaseEntity {

    /** Телефон */
    public String getPhone() {return thePhone;}
    public void setPhone(String aPhone) {thePhone = aPhone;}
    /** Телефон */
    private String thePhone;

    /** Синхронизация адресов */
    @PostPersist
    @PostUpdate
    protected void syncAddresses() {
        // адрес проживания пустой
    }

    /** Имя */
    public String getFirstname() { return theFirstname ; }
    public void setFirstname(String aFirstname) { theFirstname = aFirstname ; }

    /** Фамилия */
    public String getLastname() { return theLastname ; }
    public void setLastname(String aLastname) { theLastname = aLastname ; }

    /** Отчество */
    public String getMiddlename() { return theMiddlename ; }
    public void setMiddlename(String aMiddlename) { theMiddlename = aMiddlename ; }

    /** Дата рождения */
    public Date getBirthday() { return theBirthdate ; }
    public void setBirthday(Date aBirthdate) { theBirthdate = aBirthdate ; }

    /** Примечание */
    public String getNotice() {return theNotice;}
    public void setNotice(String aNotice) {theNotice = aNotice;}
    private String theNotice;

    /** Информация о пациенте */
    public String getPatientInfo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        StringBuilder sb = new StringBuilder();
        add(sb, theLastname,"");
        add(sb, theFirstname," ");
        add(sb, theMiddlename," ");
        if(getBirthday()!=null) {
            add(sb, " г.р.", " ");
            add(sb, simpleDateFormat.format(getBirthday())," ") ;
        }
        return sb.toString();
    }
    private String thePatientSync;
    public String getPatientSync() {
        return thePatientSync;
    }

    public void setPatientSync(String aPatientSync) {
        thePatientSync = aPatientSync;
    }

    private static void add(StringBuilder aSb, String aStr, String aPre) {
        if(aStr!=null && !aStr.equals("")) {
            if(aSb.length()!=0) aSb.append(aPre) ;
            aSb.append(aStr) ;
        }
    }

    /** Имя */
    private String theFirstname ;
    /** Фамилия */
    private String theLastname ;
    /** Отчества */
    private String theMiddlename ;
    /** Дата рождения */
    private Date theBirthdate ;
    /** Пол */

    /** СНИЛС */
    private String theSnils ;

    /** Единый номер застрахованного */
    public String getCommonNumber() {return theCommonNumber;}
    public void setCommonNumber(String aNumber) {theCommonNumber = aNumber;}
    private String theCommonNumber;
}
