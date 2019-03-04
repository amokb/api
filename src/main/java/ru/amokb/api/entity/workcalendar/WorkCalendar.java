package ru.amokb.api.entity.workcalendar;


import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.worker.WorkFunction;

import javax.persistence.*;
import java.util.List;

/**
 * Календарь работы
 * @author azviagin
 *
 */
@Entity
@Table(schema="SQLUser")
public class WorkCalendar extends BaseEntity{
	

	/** Дни календаря */
	@Comment("Дни календаря")
	@OneToMany(mappedBy="workCalendar", cascade= CascadeType.ALL)
	public List<WorkCalendarDay> getDays() {return theDays;}
	public void setDays(List<WorkCalendarDay> aDays) {theDays = aDays;}

	/** Дни календаря */
	private List<WorkCalendarDay> theDays;
	
	/** Рабочая функция */
	@Comment("Рабочая функция")
	@OneToOne
	public WorkFunction getWorkFunction() {
		return theWorkFunction;
	}
	public void setWorkFunction(WorkFunction aWorkFunction) {
		theWorkFunction = aWorkFunction;
	}
	private WorkFunction theWorkFunction;
}
