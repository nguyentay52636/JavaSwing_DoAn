package Layout.models.BackEnd.ManagerCustomer;

public class Customer {
String codeKH , nameKH , address,phoneNumber , status ;

public Customer(String codeKH, String nameKH, String address, String phoneNumber, String status) {
    this.codeKH = codeKH;
    this.nameKH = nameKH;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.status = status;
}

public String getCodeKH() {
    return codeKH;
}

public void setCodeKH(String codeKH) {
    this.codeKH = codeKH;
}

public String getNameKH() {
    return nameKH;
}

public void setNameKH(String nameKH) {
    this.nameKH = nameKH;
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

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
} 
}
