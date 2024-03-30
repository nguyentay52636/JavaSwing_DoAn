package Layout.models.BackEnd.ManagerTypeProducts.ManagerAccount;

public class TypeProduct {
    String codeSP, nameSP, describe;

    public TypeProduct(String codeSP, String nameSP, String describe) {
        this.codeSP = codeSP;
        this.nameSP = nameSP;
        this.describe = describe;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

}
