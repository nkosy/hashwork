package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.EmployeeAllowanceModel;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class EmployeeAllowanceForm extends FormLayout {
    private final EmployeeAllowanceModel bean;
    public final BeanItem<EmployeeAllowanceModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public EmployeeAllowanceForm() {
        bean = new EmployeeAllowanceModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId = UIComponent.getTextField("Person ID :", "personId", EmployeeAllowanceModel.class, binder);
        TextField allowanceType = UIComponent.getTextField("Allowance Type :", "allowanceType", EmployeeAllowanceModel.class, binder);
        TextField amount = UIComponent.getTextField("Allowance Type :", "allowanceType", EmployeeAllowanceModel.class, binder);
        DateField validAsFrom = UIComponent.getDateField("Valid As From :", "validAsFrom", EmployeeAllowanceModel.class, binder);

        addComponent(personId);
        addComponent(allowanceType);
        addComponent(amount);
        addComponent(validAsFrom);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);

    }
}
