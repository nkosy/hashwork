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
import hashwork.client.content.payroll.model.PensionFundModel;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class PensionFundForm extends FormLayout {
    private final PensionFundModel bean;
    public final BeanItem<PensionFundModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public PensionFundForm() {
        bean = new PensionFundModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField pensionCode= UIComponent.getTextField("Pension Code :", "pensionCode", PensionFundModel.class, binder);
        TextField  description  = UIComponent.getTextField("Description :", "description", PensionFundModel.class, binder);
        TextField percentage = UIComponent.getTextField("Percentage :", "percentage", PensionFundModel.class, binder);
        DateField percentageAsOfDate = UIComponent.getDateField("Percentage As Of Date :", "percentageAsOfDate", PensionFundModel.class, binder);

        addComponent(pensionCode);
        addComponent(description);
        addComponent(percentage);
        addComponent(percentageAsOfDate);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
