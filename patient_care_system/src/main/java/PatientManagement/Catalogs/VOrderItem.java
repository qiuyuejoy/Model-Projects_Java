
package PatientManagement.Catalogs;

import PatientManagement.Patient.ClinicalHistory.Vaccine;

public class VOrderItem {
    // order item of vaccine orders
    Vaccine selectedVaccine;
    int unitPrice;
    int dose;

    public VOrderItem(Vaccine selectedVaccine, int unitPrice, int dose) {
        this.selectedVaccine = selectedVaccine;
        this.unitPrice = unitPrice;
        this.dose = dose;

    }

    public VOrderItem(Vaccine selectedVaccine) {
        this.selectedVaccine = selectedVaccine;
    }

    public int getVOrderItemTotal() {
        return unitPrice * dose;
    }

    public Vaccine getSelectedVaccine() {
        return selectedVaccine;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getDose() {
        return dose;
    }

}
