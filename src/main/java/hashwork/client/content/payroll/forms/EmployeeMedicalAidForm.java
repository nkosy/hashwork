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
import hashwork.client.content.payroll.model.EmployeeMedicalAidModel;
import hashwork.client.content.payroll.model.EmployeeTaxCertificateModel;

/**
 * Created by NkosikhonaS on 10/14/2015.
 */
public class EmployeeMedicalAidForm extends FormLayout {
    private final EmployeeMedicalAidModel bean;
    public final BeanItem<EmployeeMedicalAidModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public EmployeeMedicalAidForm() {
        bean = new EmployeeMedicalAidModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId = UIComponent.getTextField("Person ID :", "personId", EmployeeTaxCertificateModel.class, binder);
        TextField medicalAidType = UIComponent.getTextField("Medical Aid Type :", "medicalAidType", EmployeeTaxCertificateModel.class, binder);
        TextField medicalAidAmount = UIComponent.getTextField("Medical Aid Amount :", "medicalAidAmount", EmployeeTaxCertificateModel.class, binder);
        DateField lastDateContribution= UIComponent.getDateField("Last Date Contribution :", "lastDateContribution", EmployeeTaxCertificateModel.class, binder);

        addComponent(personId);
        addComponent(medicalAidType);
        addComponent(medicalAidAmount);
        addComponent(lastDateContribution);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
