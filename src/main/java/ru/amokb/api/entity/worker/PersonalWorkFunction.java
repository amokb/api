package ru.amokb.api.entity.worker;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import ru.amokb.api.annotation.Comment;

@Entity
@Table(schema = "SQLUser")
public class PersonalWorkFunction extends WorkFunction {

    private Worker worker;
    private GroupWorkFunction groupWorkFunction;

    @Comment("Сотрудник")
    @ManyToOne
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker aWorkers) {
        worker = aWorkers;
    }

    @Transient
    @Comment("Информация о работнике")
    public String getWorkerInfo() {
        return worker != null ? worker.getWorkerInfo() : "";
    }

    private static void add(StringBuilder aSb, String aStr, String aPre) {
        if (aSb.length() != 0) aSb.append(aPre);
        aSb.append(aStr);
    }

    @Transient
    @Comment("Информация")
    public String getWorkFunctionInfo() {
        return getName() + " " + getWorkerInfo();
    }

    @Comment("Групповая рабочая функция")
    @ManyToOne
    public GroupWorkFunction getGroup() {
        return groupWorkFunction;
    }

    public void setGroup(GroupWorkFunction aGroup) {
        groupWorkFunction = aGroup;
    }
}
