package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class MedicalAidListModel extends FormLayout {
    private final MedicalAidListModel bean;
    public final BeanItem<MedicalAidListModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public MedicalAidListModel() {
        bean = new MedicalAidListModel();
        item = new BeanItem<MedicalAidListModel>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField medicalAidType = UIComponent.getTextField("Medical Aid Type :", "medicalAidType", MedicalAidListModel.class, binder);
        TextField description= UIComponent.getTextField("Description :", "description", MedicalAidListModel.class, binder);
        TextField monthlyContribution = UIComponent.getTextField("Monthly Contribution :", "monthlyContribution", MedicalAidListModel.class, binder);

        addComponent(medicalAidType);
        addComponent(description);
        addComponent(monthlyContribution);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);

    }
}
