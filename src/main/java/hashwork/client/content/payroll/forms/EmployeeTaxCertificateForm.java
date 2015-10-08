package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.EmployeeTaxCertificateModel;

/**
 * Created by NkosikhonaS on 10/8/2015.
 */
public class EmployeeTaxCertificateForm extends FormLayout {
    private final EmployeeTaxCertificateModel bean;
    public final BeanItem<EmployeeTaxCertificateModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public EmployeeTaxCertificateForm() {
        bean = new EmployeeTaxCertificateModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId = UIComponent.getTextField("Person ID :", "personId", EmployeeTaxCertificateModel.class, binder);
        TextField taxReferenceNumber= UIComponent.getTextField("Tax Reference Number :", "taxReferenceNumber", EmployeeTaxCertificateModel.class, binder);
        TextField uifNumber = UIComponent.getTextField("UIF Number :", "uifNumber", EmployeeTaxCertificateModel.class, binder);
        TextField employeeTaxAmt = UIComponent.getTextField("Employee Tax Amount :", "employeeTaxAmt", EmployeeTaxCertificateModel.class, binder);

        addComponent(personId);
        addComponent(taxReferenceNumber);
        addComponent(uifNumber);
        addComponent(employeeTaxAmt);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
