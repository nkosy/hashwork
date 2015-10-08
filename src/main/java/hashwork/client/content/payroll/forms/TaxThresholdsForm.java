package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.TaxThresholdsModel;


/**
 * Created by NkosikhonaS on 10/8/2015.
 */
public class TaxThresholdsForm extends FormLayout {
    private final TaxThresholdsModel bean;
    public final BeanItem<TaxThresholdsModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public TaxThresholdsForm() {
        bean = new TaxThresholdsModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId= UIComponent.getTextField("Person ID :", "personId", TaxThresholdsModel.class, binder);
        TextField taxThreshAmt1= UIComponent.getTextField("Tax Thresholds Amount 1 :", "taxThreshAmt1", TaxThresholdsModel.class, binder);
        TextField taxThreshAmt2 = UIComponent.getTextField("Tax Thresholds Amount :", "taxThreshAmt2", TaxThresholdsModel.class, binder);
        TextField taxThreshCategory= UIComponent.getTextField("Tax Thresholds Category:", "taxThreshCategory", TaxThresholdsModel.class, binder);
        TextField taxThreshDesc = UIComponent.getTextField("Tax Thresholds Description :", "taxThreshDesc", TaxThresholdsModel.class, binder);
        TextField taxPercentage = UIComponent.getTextField("Tax Percentage :", "taxPercentage", TaxThresholdsModel.class, binder);

        addComponent(personId);
        addComponent(taxThreshAmt1);
        addComponent(taxThreshAmt2);
        addComponent(taxThreshCategory);
        addComponent(taxThreshDesc);
        addComponent(taxPercentage);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
