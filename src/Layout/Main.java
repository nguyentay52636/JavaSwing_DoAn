package Layout;

import Layout.models.FrontEnd.MainLayout.Pages.FormLogin;

// import Layout.models.FrontEnd.MainLayout.Pages.Login;

public class Main {
    public static void main(String[] args) {
       FormLogin form = new FormLogin();
       // form.setUndecorated(true); // Di
       // form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thêm dòng này nếu
       // muốn đóng ứng dụng khi đóng cửa sổ
       form.setVisible(true);
        //  new ManagerInvoiceGUI().setVisible(true);
    }
}