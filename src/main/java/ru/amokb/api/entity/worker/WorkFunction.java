package ru.amokb.api.entity.worker;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.lpu.MisLpu;
import ru.amokb.api.entity.workcalendar.WorkCalendar;
import ru.amokb.api.entity.worker.voc.VocWorkFunction;

@Comment("Рабочая функция")
@Entity
@Table(schema = "SQLUser")
abstract public class WorkFunction extends BaseEntity {

    private Date startDate;
    private Date finishDate;
    private WorkCalendar workCalendar;
    private VocWorkFunction workFunction;
    private Boolean isArchival;
    private MisLpu lpu;
    private String code;
    private Integer registrationInterval;
    private Boolean isInstrumentNurse;
    private Boolean isNoViewRemoteUser;
    private Boolean isDirectionNoTime = false;
    private String promedCodelpuSection;
    private String promedCodeWorkStaff;
    private String comment;

    @Comment("Дата начала работы")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date aStartDate) {
        startDate = aStartDate;
    }

    @Comment("Дата окончания работы")
    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date aFinishDate) {
        finishDate = aFinishDate;
    }

    @Comment("Рабочий календарь")
    @OneToOne
    @Deprecated
    public WorkCalendar getWorkCalendar() {
        return workCalendar;
    }

    public void setWorkCalendar(WorkCalendar aWorkCalendars) {
        workCalendar = aWorkCalendars;
    }

    @Comment("Наименование")
    @Transient
    public String getName() {
        StringBuilder ret = new StringBuilder();
        if (workFunction != null) ret.append(workFunction.getName());
        return ret.toString();
    }

    @Transient
    @Comment("Информация")
    public String getWorkFunctionInfo() {
        return getName();
    }

    @Comment("Функция")
    @OneToOne
    public VocWorkFunction getWorkFunction() {
        return workFunction;
    }

    public void setWorkFunction(VocWorkFunction aWorkFunction) {
        workFunction = aWorkFunction;
    }

    @Comment("Поместить в архив")
    public Boolean getArchival() {
        return isArchival;
    }

    public void setArchival(Boolean aArchival) {
        isArchival = aArchival;
    }

    @Transient
    public String getWorkerLpuInfo() {
        return "";
    }

    @Transient
    public String getInfo() {
        return "";
    }

    @Transient
    public boolean getViewDirect() {
        return true;
    }

    @Transient
    public String getWorkerInfo() {
        return "";
    }

    @Comment("ЛПУ")
    @ManyToOne
    public MisLpu getLpu() {
        return lpu;
    }

    public void setLpu(MisLpu aLpu) {
        lpu = aLpu;
    }

    @Comment("Код специалиста")
    public String getCode() {
        return code;
    }

    public void setCode(String aCode) {
        code = aCode;
    }

    @Comment("Интервал разрешенной регистрации")
    public Integer getRegistrationInterval() {
        return registrationInterval;
    }

    public void setRegistrationInterval(Integer aRegistrationInterval) {
        registrationInterval = aRegistrationInterval;
    }

    @Comment("Операционная сестра")
    public Boolean getIsInstrumentNurse() {
        return isInstrumentNurse;
    }

    public void setIsInstrumentNurse(Boolean aOperationSister) {
        isInstrumentNurse = aOperationSister;
    }

    @Comment("Комментарий")
    public String getComment() {
        return comment;
    }

    public void setComment(String aComment) {
        comment = aComment;
    }

    @Comment("Не показывать удаленным пользователям")
    public Boolean getIsNoViewRemoteUser() {
        return isNoViewRemoteUser;
    }

    public void setIsNoViewRemoteUser(Boolean aNoViewRemoteUser) {
        isNoViewRemoteUser = aNoViewRemoteUser;
    }

    @Comment("Код рабочего места в промеде")
    public String getPromedCodeWorkStaff() {
        return promedCodeWorkStaff;
    }

    public void setPromedCodeWorkStaff(String promedCodeWorkStaff) {
        this.promedCodeWorkStaff = promedCodeWorkStaff;
    }

    @Comment("Код рабочего места в промеде")
    public String getPromedCodelpuSection() {
        return promedCodelpuSection;
    }

    public void setPromedCodelpuSection(String promedCodelpuSection) {
        this.promedCodelpuSection = promedCodelpuSection;
    }

    @Comment("Разрешено записывать на дату без указания времени")
    @Column(nullable = false, columnDefinition = "boolean default false")
    public Boolean getIsDirectionNoTime() {
        return isDirectionNoTime;
    }

    public void setIsDirectionNoTime(Boolean aIsDirectionNoTime) {
        isDirectionNoTime = aIsDirectionNoTime;
    }
}
