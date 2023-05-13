package TrainingProgramm;

public class Training {
    private int burpeezahl;
    private int puschupzahl;
    private int situpzahl;
    private int squatzahl;

    //Constructor
    public Training(int burpeezahl, int puschupzahl, int situpzahl, int squatzahl) {
        this.burpeezahl = burpeezahl;
        this.puschupzahl = puschupzahl;
        this.situpzahl = situpzahl;
        this.squatzahl = squatzahl;
    }

    //Getter && Setter

    public int getBurpeezahl() {
        return burpeezahl;
    }

    public void setBurpeezahl(int burpeezahl) {
        this.burpeezahl = burpeezahl;
    }

    public int getPuschupzahl() {
        return puschupzahl;
    }

    public void setPuschupzahl(int puschupzahl) {
        this.puschupzahl = puschupzahl;
    }

    public int getSitupzahl() {
        return situpzahl;
    }

    public void setSitupzahl(int situpzahl) {
        this.situpzahl = situpzahl;
    }

    public int getSquatzahl() {
        return squatzahl;
    }

    public void setSquatzahl(int squatzahl) {
        this.squatzahl = squatzahl;
    }

    public void sporttraining(String artTraining, int zahl){
        if (artTraining.equals("Burpee") ){
            burpeeMaht(zahl);
        } else if (artTraining.equals("Pushup")){

        }
    }

    



}
