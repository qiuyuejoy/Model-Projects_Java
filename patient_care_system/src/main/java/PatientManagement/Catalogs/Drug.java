
package PatientManagement.Catalogs;

public class Drug {
    String name;
    String treatedDisease;

    public String getName() {
        return name;
    }

    public String getTreatedDisease() {
        return treatedDisease;
    }

    public Drug(String name, String treatedDisease) {
        this.name = name;
        this.treatedDisease = treatedDisease;
    }

    public Drug(String n) {
        name = n;
    }

}
