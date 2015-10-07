package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import java.awt.Checkbox;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComboBoxHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.LeaveTypeListModel;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class LeaveTypeListForm extends FormLayout {
    private final LeaveTypeListModel bean;
    public final BeanItem<LeaveTypeListModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public LeaveTypeListForm() {
        bean = new LeaveTypeListModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();
        TextField leaveType = UIComponent.getTextField("Leave Type :", "leaveType", LeaveTypeListModel.class, binder);
        TextField description = UIComponent.getTextField("Description :", "description", LeaveTypeListModel.class, binder);
        CheckBox paidLeave = UIComponent.getCheckBox("Paid Leave :", "paidLeave", LeaveTypeListModel.class, binder);
        TextField maxLeaveDays = UIComponent.getTextField("Max Leave Days :", "maxLeaveDays", LeaveTypeListModel.class, binder);

        addComponent(leaveType);
        addComponent(description);
        addComponent(paidLeave);
        addComponent(maxLeaveDays);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);

    }
}
