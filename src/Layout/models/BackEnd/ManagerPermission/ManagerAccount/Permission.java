package Layout.models.BackEnd.ManagerPermission.ManagerAccount;

public class Permission {
    private String codePermission, detailPermission;

    public Permission(String codePermission, String detailPermission) {
        this.codePermission = codePermission;
        this.detailPermission = detailPermission;
    }

    public String getCodePermission() {
        return codePermission;
    }

     public void setCodePermission(String codePermission) {
        this.codePermission = codePermission;
    }

    public String getDetailPermission() {
        return detailPermission;
    }

    public void setDetailPermission(String detailPermission) {
        this.detailPermission = detailPermission;
    }

}
