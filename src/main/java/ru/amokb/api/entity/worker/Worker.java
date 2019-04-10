package ru.amokb.api.entity.worker;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.BaseEntity;
import ru.amokb.api.entity.lpu.MisLpu;
import ru.amokb.api.entity.patient.Patient;

@Entity
@Comment("Сотрудник ЛПУ")
@Table(schema = "SQLUser")
public class Worker extends BaseEntity {

    private Patient person;
    private List<PersonalWorkFunction> workFunctions;
    private MisLpu lpu;

    @Comment("Персона")
    @ManyToOne
    public Patient getPerson() {
        return person;
    }

    public void setPerson(Patient aPerson) {
        person = aPerson;
    }

    @Comment("Рабочие функции")
    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    public List<PersonalWorkFunction> getWorkFunctions() {
        return workFunctions;
    }

    public void setWorkFunctions(List<PersonalWorkFunction> aWorkFunctions) {
        workFunctions = aWorkFunctions;
    }

    @Comment("ЛПУ")
    @ManyToOne
    public MisLpu getLpu() {
        return lpu;
    }

    public void setLpu(MisLpu aLpu) {
        lpu = aLpu;
    }

    @Comment("Информация о сотруднике")
    @Transient
    public String getWorkerInfo() {
        return person != null ? person.getPatientInfo() : "ОШИБКА: Не выбрана персона.";
    }
}