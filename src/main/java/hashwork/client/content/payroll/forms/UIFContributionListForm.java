package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.UIFContributionListModel;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class UIFContributionListForm extends FormLayout {
    private final UIFContributionListModel bean;
    public final BeanItem<UIFContributionListModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public UIFContributionListForm() {
        bean = new UIFContributionListModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField code = UIComponent.getTextField("Code :", "code", UIFContributionListModel.class, binder);
        TextField uifPercentContribution= UIComponent.getTextField("UIF Percent Contribution :", "uifPercentContribution", UIFContributionListModel.class, binder);

        addComponent(code);
        addComponent(uifPercentContribution);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        addComponent(buttons);
    }
}
