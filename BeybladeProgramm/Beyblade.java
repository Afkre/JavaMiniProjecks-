package BeybladeProgramm;

public class Beyblade {
    
    private String beybladehat;
    private int drehzahl;
    private int angriffskraft;

    public Beyblade(String beybladehat, int drehzahl, int angriffskraft) {
        this.beybladehat = beybladehat;
        this.drehzahl = drehzahl;
        this.angriffskraft = angriffskraft;
    }

    public String getBeybladehat() {
        return beybladehat;
    }

    public void setBeybladehat(String beybladehat) {
        this.beybladehat = beybladehat;
    }

    public int getDrehzahl() {
        return drehzahl;
    }

    public void setDrehzahl(int drehzahl) {
        this.drehzahl = drehzahl;
    }

    public int getAngriffskraft() {
        return angriffskraft;
    }

    public void setAngriffskraft(int angriffskraft) {
        this.angriffskraft = angriffskraft;
    }

    public void angriff (){
        System.out.println(beybladehat +" " + "greift mit" +  angriffskraft + " und " + drehzahl + " an." );
    }

    public void entfessleHeiligeBestie(){
        System.out.println("Dieser Beyblader hat keine heilige Bestie.");

    }

    public void anzeigtInformationen(){
        System.out.println("Beybladersname ist : " + beybladehat);
        System.out.println("Angriffskraft ist : " + angriffskraft);
        System.out.println("Drehzahl ist : " + drehzahl);
    }



    
}
