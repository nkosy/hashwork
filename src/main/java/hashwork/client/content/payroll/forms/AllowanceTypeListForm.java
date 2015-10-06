package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

import hashwork.app.util.fields.UIComboBoxHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.AllowanceTypeListModel;
import hashwork.client.content.payroll.model.JobAdvertModel;


/**
 * Created by NkosikhonaS on 10/6/2015.
 */
public class AllowanceTypeListForm  extends FormLayout{
    private final AllowanceTypeListModel bean;
    public final BeanItem< AllowanceTypeListModel> item;
    public final FieldGroup binder;

    // Define Public Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public AllowanceTypeListForm(){
        bean = new AllowanceTypeListModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);
        final UIComponentHelper UIComponent = new UIComponentHelper();
        final UIComboBoxHelper UIComboBox = new UIComboBoxHelper();

        TextField allowanceType = UIComponent.getTextField("Allowance Type :", "allowanceType", AllowanceTypeListModel.class, binder);
        TextField description = UIComponent.getTextField("Description :", "description", AllowanceTypeListModel.class, binder);
        TextField maxAmount = UIComponent.getTextField("Max Amount :", "maxAmount", AllowanceTypeListModel.class, binder);
    }
}
