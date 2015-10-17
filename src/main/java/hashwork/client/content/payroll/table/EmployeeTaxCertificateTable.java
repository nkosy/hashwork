package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.EmployeeTaxCertificate;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/17.
 */
public class EmployeeTaxCertificateTable extends Table {
    private final MainLayout main;

    public EmployeeTaxCertificateTable (MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person Id", String.class, null);
        addContainerProperty("employer", String.class, null);
        addContainerProperty("taxReferenceNumber", String.class, null);
        addContainerProperty("uifNumber", String.class, null);
        addContainerProperty("employeeTaxAmt", String.class, null);

        Set<EmployeeTaxCertificate> employeeTaxCertificates = PayrollCoreFacade.employeeTaxCertificateService.findAll();

        for(EmployeeTaxCertificate employeeTaxCertificate: employeeTaxCertificates){
            addItem(new Object[]{employeeTaxCertificate.getPersonId(),
                            employeeTaxCertificate.getEmployer(),
                            employeeTaxCertificate.getTaxReferenceNumber(),
                            employeeTaxCertificate.getUifNumber(),
                            employeeTaxCertificate.getEmployeeTaxAmt()},
                    employeeTaxCertificate.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
