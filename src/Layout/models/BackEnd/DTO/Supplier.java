package Layout.models.BackEnd.DTO;

public class Supplier {
    private String codeNCC;
    private String nameNCC;
    private String address;
    private String phoneNumber;
    private String Fax;

    public Supplier(String codeNCC, String nameNCC, String address, String phoneNumber, String fax) {
        this.codeNCC = codeNCC;
        this.nameNCC = nameNCC;
        this.address = address;
        this.phoneNumber = phoneNumber;
        Fax = fax;
    }

    public String getCodeNCC() {
        return codeNCC;
    }

    public void setCodeNCC(String codeNCC) {
        this.codeNCC = codeNCC;
    }

    public String getNameNCC() {
        return nameNCC;
    }

    public void setNameNCC(String nameNCC) {
        this.nameNCC = nameNCC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }
}
