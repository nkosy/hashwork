package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.EmployeeDeductionsModel;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;


/**
 * Created by NkosikhonaS on 10/14/2015.
 */
public class EmployeeDeductionsForm extends FormLayout{
    private final EmployeeDeductionsModel bean;
    public final BeanItem<EmployeeDeductionsModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public EmployeeDeductionsForm() {

        bean = new EmployeeDeductionsModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId = UIComponent.getTextField("Person ID :", "personId", EmployeeDeductionsModel.class, binder);
        TextField deductionAmt = UIComponent.getTextField("Deductions Amount :", "deductionAmt", EmployeeDeductionsModel.class, binder);
        TextField deductionTypeDesc = UIComponent.getTextField("Deduction Type Description :", "deductionTypeDesc", EmployeeDeductionsModel.class, binder);

        addComponent(personId);
        addComponent(deductionAmt);
        addComponent(deductionTypeDesc);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
