package MitarbeitersProgramm;

public class SoftwareEntwickler extends Mitarbeiter {

    private String sprache;

    public SoftwareEntwickler(String vorname, String nachname, int id, String sprache){
        super(vorname, nachname, id);
        this.sprache= sprache;

    }

    public void formattieren(String betriebssystem){
        System.out.println(getVorname() + " installiert" + betriebssystem);
        
    }

    @Override
    public void anzeigenInfornationen() {
        
        super.anzeigenInfornationen();
        System.out.println("Sprachen, die dem Programmierer bekannt sind : "+ sprache);
    }

}