package ru.amokb.api.entity.workcalendar;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.worker.WorkFunction;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Дни рабочего календаря
 * @author azviagin
 *
 */

@Comment("Дни рабочего календаря")
@Entity
@Table(schema="SQLUser")
public class WorkCalendarDay extends BaseEntity {
	/** Удаленная запись */
	@Comment("Удаленная запись")
	public Boolean getIsDeleted() {return theIsDeleted;}
	public void setIsDeleted(Boolean aIsDeleted) {theIsDeleted = aIsDeleted;}
	/** Удаленная запись */
	private Boolean theIsDeleted ;

	/** Рабочий календарь */
	@Comment("Рабочий календарь")
	@ManyToOne
	public WorkCalendar getWorkCalendar() {
		return theWorkCalendar;
	}
	public void setWorkCalendar(WorkCalendar aWorkCalendar) {
		theWorkCalendar = aWorkCalendar;
	}
	/** Рабочий календарь */
	private WorkCalendar theWorkCalendar;
	

	/** Календарная дата */
	@Comment("Календарная дата")
	public Date getCalendarDate() {
		return theCalendarDate;
	}
	public void setCalendarDate(Date aCalendarDate) {
		theCalendarDate = aCalendarDate;
	}
	/** Календарная дата */
	private Date theCalendarDate;

	/** Рабочие времена */
	@Comment("Рабочие времена")
	@OneToMany(mappedBy="workCalendarDay", cascade= CascadeType.ALL)
	public List<WorkCalendarTime> getWorkCalendarTimes() {
		return theWorkCalendarTimes;
	}

	public void setWorkCalendarTimes(List<WorkCalendarTime> aWorkCalendarTimes) {
		theWorkCalendarTimes = aWorkCalendarTimes;
	}

	/** Рабочие времена */
	private List<WorkCalendarTime> theWorkCalendarTimes;
	
	@Transient
    @OneToOne
	public WorkFunction getWorkFunction() {
		return theWorkCalendar!=null? theWorkCalendar.getWorkFunction():null ;
	}
	
	

}
