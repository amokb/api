package ru.amokb.api.entity.worker;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import ru.amokb.api.annotation.Comment;

@Entity
@Table(schema = "SQLUser")
public class GroupWorkFunction extends WorkFunction {

    private String groupName;

    @Comment("Название группы")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String aGroupName) {
        groupName = aGroupName;
    }

    @Transient
    @Comment("Информация")
    public String getWorkFunctionInfo() {
        return getName() + " " + groupName;
    }

    @Transient
    public String getWorkerInfo() {
        return groupName;
    }

    @Transient
    public String getInfo() {
        return "ГРУППОВАЯ: " + getGroupName();
    }
}
