package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import java.util.Date;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.CompanyPayrollModel;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class CompanyPayrollForm extends FormLayout {
    private final CompanyPayrollModel bean;
    public final BeanItem<CompanyPayrollModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public CompanyPayrollForm() {
        bean = new CompanyPayrollModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField companyId = UIComponent.getTextField("Company ID :", "companyId", CompanyPayrollModel.class, binder);
        DateField payPeriod = UIComponent.getDateField("Pay Period :", "payPeriod", CompanyPayrollModel.class, binder);
        TextField employeeType = UIComponent.getTextField("Employee Type :", "employeeType", CompanyPayrollModel.class, binder);

        addComponent(companyId);
        addComponent(payPeriod);
        addComponent(employeeType);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
