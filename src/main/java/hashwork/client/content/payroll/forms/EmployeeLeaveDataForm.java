package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.EmployeeLeaveDataModel;

/**
 * Created by NkosikhonaS on 10/14/2015.
 */
public class EmployeeLeaveDataForm extends FormLayout {
    private final EmployeeLeaveDataModel bean;
    public final BeanItem<EmployeeLeaveDataModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public EmployeeLeaveDataForm() {
        bean = new EmployeeLeaveDataModel();
        item = new BeanItem<>(bean);

        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId = UIComponent.getTextField("Person ID :", "personId", EmployeeLeaveDataModel.class, binder);
        TextField leaveType = UIComponent.getTextField("Leave Type :", "leaveType", EmployeeLeaveDataModel.class, binder);
        CheckBox paidLeave = UIComponent.getCheckBox("Paid Leave:", "paidLeave", EmployeeLeaveDataModel.class, binder);
        DateField commencementDate = UIComponent.getDateField("Commencement Date :", "commencementDate", EmployeeLeaveDataModel.class, binder);

        addComponent(personId);
        addComponent(leaveType);
        addComponent(paidLeave);
        addComponent(commencementDate);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);

    }
}
