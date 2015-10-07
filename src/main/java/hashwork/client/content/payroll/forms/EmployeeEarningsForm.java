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
import hashwork.client.content.payroll.model.EmployeeEarningsModel;


/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class EmployeeEarningsForm extends FormLayout{
    private final EmployeeEarningsModel bean;
    public final BeanItem<EmployeeEarningsModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");


    public EmployeeEarningsForm() {
        bean = new EmployeeEarningsModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId = UIComponent.getTextField("Person ID :", "personId", EmployeeEarningsModel.class, binder);
        TextField earningsAmt = UIComponent.getTextField("Earnings Amount :", "earningsAmt", EmployeeEarningsModel.class, binder);
        TextField earningsTypeDesc = UIComponent.getTextField("Earnings Type Description :", "earningsTypeDesc", EmployeeEarningsModel.class, binder);
        TextField earningsCode= UIComponent.getTextField("Earnings Code :", "earningsCode", EmployeeEarningsModel.class, binder);
        DateField payDate= UIComponent.getDateField("Pay Date :", "payDate", EmployeeEarningsModel.class, binder);

        addComponent(personId);
        addComponent(earningsAmt);
        addComponent(earningsTypeDesc);
        addComponent(payDate);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
