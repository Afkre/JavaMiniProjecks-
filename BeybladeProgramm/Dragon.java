package BeybladeProgramm;

public class Dragon extends Beyblade{

    private String heiligeBestie;

    private String geheimesTalent;

    public Dragon(String beybladehat, int drehzahl, int angriffskraft, String heiligeBestie, String geheimesTalent) {
        super(beybladehat, drehzahl, angriffskraft);
        this.heiligeBestie = heiligeBestie;
        this.geheimesTalent = geheimesTalent;
    }

    @Override
    public void anzeigtInformationen() {
        super.anzeigtInformationen();

        System.out.println("Names der heiligen Bestie: "+ heiligeBestie);
        System.out.println("Names der heiligen Bestie: "+ geheimesTalent);
        
    }

  
    @Override
    public void entfessleHeiligeBestie() {
        //super.entfessleHeiligeBestie();
        System.out.println(getBeybladehat()+ " entfellelt "+ heiligeBestie);
        System.out.println("Angriff der"+  getBeybladehat()+ " : Geisterwirbelsturm");
    
    }


    

    
    
}
