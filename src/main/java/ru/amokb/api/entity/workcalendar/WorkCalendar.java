package ru.amokb.api.entity.workcalendar;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.worker.WorkFunction;

@Entity
@Table(schema = "SQLUser")
public class WorkCalendar extends BaseEntity {

    private List<WorkCalendarDay> workCalendarDays;
    private WorkFunction workFunction;

    @Comment("Дни календаря")
    @OneToMany(mappedBy = "workCalendar", cascade = CascadeType.ALL)
    public List<WorkCalendarDay> getWorkCalendarDays() {
        return workCalendarDays;
    }

    public void setWorkCalendarDays(List<WorkCalendarDay> aDays) {
        workCalendarDays = aDays;
    }

    @Comment("Рабочая функция")
    @OneToOne
    public WorkFunction getWorkFunction() {
        return workFunction;
    }

    public void setWorkFunction(WorkFunction aWorkFunction) {
        workFunction = aWorkFunction;
    }
}
