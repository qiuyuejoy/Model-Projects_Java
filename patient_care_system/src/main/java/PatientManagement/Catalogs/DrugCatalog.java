
package PatientManagement.Catalogs;

import java.util.ArrayList;
import java.util.Random;

public class DrugCatalog {
    ArrayList<Drug> drugs;

    public DrugCatalog() {
        drugs = new ArrayList<Drug>();
    }

    public void addDrug(Drug drugToAdd) {
        this.drugs.add(drugToAdd);
    }

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public Drug pickRandomDrug() {
        if (drugs.size() == 0)
            return null;
        Random random = new Random();
        int randomIndex = random.nextInt(drugs.size());
        return drugs.get(randomIndex);
    }

}
