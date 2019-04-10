package ru.amokb.api.entity.worker.voc;

import javax.persistence.Entity;
import javax.persistence.Table;

import ru.amokb.api.annotation.Comment;
import ru.amokb.api.entity.VocBaseEntity;

@Comment("Рабочая функция")
@Entity
@Table(schema = "SQLUser")
public class VocWorkFunction extends VocBaseEntity {

    private String shortName;
    private Boolean isRadiationDiagnosis;
    private Boolean isLab;
    private Boolean isFuncDiag;
    private Boolean isNo039;
    private String promedCodePolyclinic;
    private String promedCodeHospital;
    private Boolean isNoOmc = false;
    private String fssCode;
    private String fssShortName;

    @Comment("Короткое название")
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String aShortName) {
        shortName = aShortName;
    }

    @Comment("Не заполняется диагноз")
    public Boolean getIsNoDiagnosis() {
        return theIsNoDiagnosis;
    }

    public void setIsNoDiagnosis(Boolean aIsNoDiagnosis) {
        theIsNoDiagnosis = aIsNoDiagnosis;
    }

    private Boolean theIsNoDiagnosis;

    @Comment("Функциональная диагностика")
    public Boolean getIsFuncDiag() {
        return isFuncDiag;
    }

    public void setIsFuncDiag(Boolean aIsFuncDiag) {
        isFuncDiag = aIsFuncDiag;
    }

    @Comment("Лаборатория")
    public Boolean getIsLab() {
        return isLab;
    }

    public void setIsLab(Boolean aIsLab) {
        isLab = aIsLab;
    }

    @Comment("Лучевая диагностика")
    public Boolean getIsRadiationDiagnosis() {
        return isRadiationDiagnosis;
    }

    public void setIsRadiationDiagnosis(Boolean aIsRadiationDiagnosis) {
        isRadiationDiagnosis = aIsRadiationDiagnosis;
    }

    @Comment("Не включать в 039 форму")
    public Boolean getIsNo039() {
        return isNo039;
    }

    public void setIsNo039(Boolean aIsNo039) {
        isNo039 = aIsNo039;
    }

    @Comment("Короткое название ФСС")
    public String getFSSShortName() {
        return fssShortName;
    }

    public void setFSSShortName(String aFSSShortName) {
        fssShortName = aFSSShortName;
    }

    @Comment("Код ФСС")
    public String getFSSCode() {
        return fssCode;
    }

    public void setFSSCode(String aFSSCode) {
        fssCode = aFSSCode;
    }

    @Comment("Код поликлиники в промеде")
    public String getPromedCodePolyclinic() {
        return promedCodePolyclinic;
    }

    public void setPromedCodePolyclinic(String promedCodePolyclinic) {
        this.promedCodePolyclinic = promedCodePolyclinic;
    }

    @Comment("Код стационара в промеде")
    public String getPromedCodeHospital() {
        return promedCodeHospital;
    }

    public void setPromedCodeHospital(String promedCodeHospital) {
        this.promedCodeHospital = promedCodeHospital;
    }

    @Comment("Не подавать по ОМС")
    public Boolean getIsNoOmc() {
        return isNoOmc;
    }

    public void setIsNoOmc(Boolean aIsNoOmc) {
        isNoOmc = aIsNoOmc;
    }
}
