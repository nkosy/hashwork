package hashwork.client.content.payroll.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

import hashwork.app.util.fields.ButtonsHelper;
import hashwork.app.util.fields.UIComponentHelper;
import hashwork.client.content.payroll.model.EmployeePensionModel;

/**
 * Created by NkosikhonaS on 10/14/2015.
 */
public class EmployeePensionForm extends FormLayout {
    private final EmployeePensionModel bean;
    public final BeanItem<EmployeePensionModel> item;
    public final FieldGroup binder;

    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public EmployeePensionForm() {
        bean = new EmployeePensionModel();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);

        final UIComponentHelper UIComponent = new UIComponentHelper();

        TextField personId = UIComponent.getTextField("Person ID :", "personId", EmployeePensionModel.class, binder);
        DateField startDate = UIComponent.getDateField("Start Date :", "startDate", EmployeePensionModel.class, binder);
        TextField pensionCode = UIComponent.getTextField("Pension Code :", "pensionCode", EmployeePensionModel.class, binder);
        TextField goalAmount = UIComponent.getTextField("Goal Amount :", "goalAmount", EmployeePensionModel.class, binder);
        TextField lastContribution = UIComponent.getTextField("Last Contribution :", "lastContribution", EmployeePensionModel.class, binder);
        DateField lastContributionDate = UIComponent.getDateField("Last Contribution Date :", "lastContributionDate", EmployeePensionModel.class, binder);
        TextField contributionToDate = UIComponent.getTextField("Contribution To Date :", "contributionToDate", EmployeePensionModel.class, binder);

        GridLayout grid = new GridLayout(4, 10);
        grid.setSizeFull();

        grid.addComponent(personId, 0, 0);
        grid.addComponent(startDate, 1, 0);
        grid.addComponent(pensionCode, 2, 0);

        grid.addComponent(goalAmount, 0, 1);
        grid.addComponent(lastContribution, 1, 1);
        grid.addComponent(lastContributionDate, 2, 1);

        grid.addComponent(contributionToDate, 0, 2);

        HorizontalLayout buttons = ButtonsHelper.getButtons(save, edit, cancel, update, delete);
        buttons.setSizeFull();
        grid.addComponent(new Label("<hr/>", ContentMode.HTML), 0, 4, 2, 4);
        grid.addComponent(buttons, 0, 5, 2, 5);

        addComponent(grid);
    }
}
