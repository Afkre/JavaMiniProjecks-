package Composition_Beispiel;

public class Bildschrim {

    private String model;

    private String hersteller;

    private String dreidimensional;

    private Resolution resolution;

    public Bildschrim(String model, String hersteller, String dreidimensional, Resolution resolution) {
        this.model = model;
        this.hersteller = hersteller;
        this.dreidimensional = dreidimensional;
        this.resolution = resolution;
    }

    public void bildschrimAusschalten(){

        System.out.println("Der Bildschrimm ist ausgeschaltet.");


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

    public String getDreidimensional() {
        return dreidimensional;
    }

    public void setDreidimensional(String dreidimensional) {
        this.dreidimensional = dreidimensional;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

   



    
    
}
