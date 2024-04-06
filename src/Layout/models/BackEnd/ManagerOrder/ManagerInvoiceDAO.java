package Layout.models.BackEnd.ManagerOrder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Layout.models.BackEnd.ConnectDataBasee.ConnectionDB;

public class ManagerInvoiceDAO {
    private ConnectionDB connection;

    public ArrayList readDB() {
        connection = new ConnectionDB();
        ArrayList<InvoiceDTO> listOrder = new ArrayList<InvoiceDTO>();

        try {
            String query = "SELECT * FROM ";
            ResultSet resultSet = connection.executeQuery(query);
            if (resultSet != null) {
                while (resultSet.next()) {
                    InvoiceDTO invoice = new InvoiceDTO();
                    

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOrder;
    }

}
