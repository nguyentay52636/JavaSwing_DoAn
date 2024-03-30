package Layout.models.BackEnd.ManagerInvoice;

import java.time.LocalDate;

public class Invoice {
    String codeKM, nameKM;
    float conditionKM, percentKM;
    LocalDate dayBD, dayKT;

    public String getCodeKM() {
        return codeKM;
    }

    public void setCodeKM(String codeKM) {
        this.codeKM = codeKM;
    }

    public String getNameKM() {
        return nameKM;
    }

    public void setNameKM(String nameKM) {
        this.nameKM = nameKM;
    }

    public float getConditionKM() {
        return conditionKM;
    }

    public void setConditionKM(float conditionKM) {
        this.conditionKM = conditionKM;
    }

    public float getPercentKM() {
        return percentKM;
    }

    public void setPercentKM(float percentKM) {
        this.percentKM = percentKM;
    }

    public LocalDate getDayBD() {
        return dayBD;
    }

    public void setDayBD(LocalDate dayBD) {
        this.dayBD = dayBD;
    }

    public LocalDate getDayKT() {
        return dayKT;
    }

    public void setDayKT(LocalDate dayKT) {
        this.dayKT = dayKT;
    }

    public Invoice(String codeKM, String nameKM, float conditionKM, float percentKM, LocalDate dayBD, LocalDate dayKT) {
        this.codeKM = codeKM;
        this.nameKM = nameKM;
        this.conditionKM = conditionKM;
        this.percentKM = percentKM;
        this.dayBD = dayBD;
        this.dayKT = dayKT;
    }

}
