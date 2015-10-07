package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import java.math.BigDecimal;
import java.util.Date;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.EmployeeAllowanceModel;
import hashwork.client.content.payroll.model.EmployeePayslipModel;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class EmployeePayslipForm extends FormLayout {
    private final EmployeePayslipModel bean;
    public final BeanItem<EmployeePayslipModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public EmployeePayslipForm() {
        bean = new EmployeePayslipModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId = UIComponent.getTextField("Person ID :", "personId", EmployeePayslipModel.class, binder);
        TextField netPay = UIComponent.getTextField("Net Pay :", "netPay", EmployeePayslipModel.class, binder);
        DateField payslipGenerateDate = UIComponent.getDateField("Payslip Generate Date:", "payslipGenerateDate", EmployeePayslipModel.class, binder);

        addComponent(personId);
        addComponent(netPay);
        addComponent(payslipGenerateDate);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
