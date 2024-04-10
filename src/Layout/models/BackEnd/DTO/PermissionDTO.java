package Layout.models.BackEnd.DTO;


public class PermissionDTO {
    private String codePermission, detailPermission;

    public PermissionDTO(String codePermission, String detailPermission) {
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
