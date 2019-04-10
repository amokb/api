package ru.amokb.api.entity.workcalendar;

import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.worker.WorkFunction;

@Entity
@Table(schema = "SQLUser")
public class WorkCalendarDay extends BaseEntity {

    private Boolean isDeleted;
    private WorkCalendar workCalendar;
    private Date calendarDate;
    private List<WorkCalendarTime> workCalendarTimes;

    @Comment("Удаленная запись")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean aIsDeleted) {
        isDeleted = aIsDeleted;
    }

    @Comment("Рабочий календарь")
    @ManyToOne
    public WorkCalendar getWorkCalendar() {
        return workCalendar;
    }

    public void setWorkCalendar(WorkCalendar aWorkCalendar) {
        workCalendar = aWorkCalendar;
    }

    @Comment("Календарная дата")
    public Date getCalendarDate() {
        return calendarDate;
    }

    public void setCalendarDate(Date aCalendarDate) {
        calendarDate = aCalendarDate;
    }

    @Comment("Рабочие времена")
    @OneToMany(mappedBy = "workCalendarDay", cascade = CascadeType.ALL)
    public List<WorkCalendarTime> getWorkCalendarTimes() {
        return workCalendarTimes;
    }

    public void setWorkCalendarTimes(List<WorkCalendarTime> aWorkCalendarTimes) {
        workCalendarTimes = aWorkCalendarTimes;
    }

    @Transient
    @OneToOne
    public WorkFunction getWorkFunction() {
        return workCalendar != null ? workCalendar.getWorkFunction() : null;
    }
}
