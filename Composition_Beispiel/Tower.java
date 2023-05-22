package Composition_Beispiel;

public class Tower {

    private String model;
    
    private String hersteller;

    private String material;

    public Tower(String model, String hersteller, String material) {
        this.model = model;
        this.hersteller = hersteller;
        this.material = material;

    }

    public void computeroffen(){
        System.out.println("Computer ist geoffenet...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    

    

}
