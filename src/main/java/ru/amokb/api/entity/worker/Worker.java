package ru.amokb.api.entity.worker;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.lpu.MisLpu;
import ru.amokb.api.entity.patient.Patient;
import javax.persistence.*;
import java.util.List;


/**
 * Сотрудник ЛПУ
 */
@Entity
@Comment("Сотрудник ЛПУ")
@Table(schema="SQLUser")
public class Worker extends BaseEntity {
	
	/** Персона */
	@Comment("Персона")
	@ManyToOne
	public Patient getPerson() {
		return thePerson;
	}
	public void setPerson(Patient aPerson) {
		thePerson = aPerson;
	}
	/** Персона */
	private Patient thePerson;
	
	/** Рабочие функции */
	@Comment("Рабочие функции")
	@OneToMany(mappedBy="worker", cascade= CascadeType.ALL)
	public List<PersonalWorkFunction> getWorkFunctions() {
		return theWorkFunctions;
	}
	public void setWorkFunctions(List<PersonalWorkFunction> aWorkFunctions) {
		theWorkFunctions = aWorkFunctions;
	}
	/** Рабочие функции */
	private List<PersonalWorkFunction> theWorkFunctions;
    
	/** ЛПУ */
    @Comment("ЛПУ")
	@ManyToOne
    public MisLpu getLpu() { return theLpu ; }
    public void setLpu(MisLpu aLpu) { theLpu = aLpu ; }
    /** ЛПУ */
    private MisLpu theLpu ;

    /** Информация о сотруднике */
    @Comment("Информация о сотруднике")
    @Transient
    public String getWorkerInfo() {
        return thePerson!=null ? thePerson.getPatientInfo() : "ОШИБКА: Не выбрана персона.";

    }
}