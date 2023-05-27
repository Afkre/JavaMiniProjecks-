package BeybladeProgramm;

public class Dranza extends Beyblade{

    private String heiligeBestie;

    public Dranza(String beybladehat, int drehzahl, int angriffskraft, String heiligeBestie) {
        super(beybladehat, drehzahl, angriffskraft);
        this.heiligeBestie = heiligeBestie;
    }

    @Override
    public void anzeigtInformationen() {
        super.anzeigtInformationen();

        System.out.println("Names der heiligen Bestie: "+ heiligeBestie);
    }

    @Override
    public void entfessleHeiligeBestie() {
        //super.entfessleHeiligeBestie();
        System.out.println(getBeybladehat()+ " entfellelt "+ heiligeBestie);
        System.out.println("Angriff der"+  getBeybladehat()+ " : Flammenschwert");

    }

    
    
    
    
}
