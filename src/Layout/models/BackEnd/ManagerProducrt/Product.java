package Layout.models.BackEnd.ManagerProducrt;

public class Product {
    String codeSP, nameSP;
    Float price;
    int quantity, status;

    public Product(String codeSP, String nameSP, Float price, int quantity, int status) {
        this.codeSP = codeSP;
        this.nameSP = nameSP;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }

    public String getCodeSP() {
        return codeSP;
    }

    public void setCodeSP(String codeSP) {
        this.codeSP = codeSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
