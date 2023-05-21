package Composition_Beispiel;

public class Mainboard {
    
    private String model;
    
    private String hersteller;

    private int schnittstelleZahl;

    private String betriebsSystem;

    public Mainboard(String model, String hersteller, int schnittstelleZahl, String betriebsSystem) {
        this.model = model;
        this.hersteller = hersteller;
        this.schnittstelleZahl = schnittstelleZahl;
        this.betriebsSystem = betriebsSystem;
    }

    public void betriebsSystemInstallieren(String betriebsSystem){

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

    public int getSchnittstelleZahl() {
        return schnittstelleZahl;
    }

    public void setSchnittstelleZahl(int schnittstelleZahl) {
        this.schnittstelleZahl = schnittstelleZahl;
    }

    public String getBetriebsSystem() {
        return betriebsSystem;
    }

    public void setBetriebsSystem(String betriebsSystem) {
        this.betriebsSystem = betriebsSystem;
    }
    


    
}
