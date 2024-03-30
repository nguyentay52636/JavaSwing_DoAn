package Layout.models.BackEnd.ManagerStaff;

import java.time.LocalDate;

public class Staff {
    String codeNV, nameNV, address;
    int status;
    LocalDate birthDay;

    public Staff(String codeNV, String nameNV, String address, int status, LocalDate birthDay) {
        this.codeNV = codeNV;
        this.nameNV = nameNV;
        this.address = address;
        this.status = status;
        this.birthDay = birthDay;
    }

    public String getCodeNV() {
        return codeNV;
    }

    public void setCodeNV(String codeNV) {
        this.codeNV = codeNV;
    }

    public String getNameNV() {
        return nameNV;
    }

    public void setNameNV(String nameNV) {
        this.nameNV = nameNV;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
