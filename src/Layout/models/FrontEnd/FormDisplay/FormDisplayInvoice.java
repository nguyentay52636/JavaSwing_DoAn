package Layout.models.FrontEnd.FormDisplay;

import Layout.models.BackEnd.BUS.ManagerInvoiceBUS;
import Layout.models.FrontEnd.MyButton.AddButton;
import Layout.models.FrontEnd.MyButton.DeleteButton;
import Layout.models.FrontEnd.MyButton.EditButton;
import Layout.models.FrontEnd.MyButton.ExportExcelButton;
import Layout.models.FrontEnd.MyButton.ImportExcelButton;

public class FormDisplayInvoice {
    ManagerInvoiceBUS invoiceBUS = new ManagerInvoiceBUS();
    AddButton btnAdd = new AddButton();
    DeleteButton btnDelete = new DeleteButton();
    EditButton btnEdit = new EditButton();
    ImportExcelButton ExcelImport = new ImportExcelButton();
    ExportExcelButton ExcelExport = new ExportExcelButton();
}
