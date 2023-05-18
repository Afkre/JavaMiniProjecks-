package MitarbeitersProgramm;

public class Administrator extends Mitarbeiter {


    private int anzahlPerson;


    public Administrator(String vorname, String nachname, int id, int anzahlPerson) {
        super(vorname, nachname, id);
        this.anzahlPerson = anzahlPerson;
       
    }


    @Override
    public void anzeigenInfornationen() {
        
        super.anzeigenInfornationen();

        System.out.println("Anzahl der Personen, für die der Administrator verantwortlich ist : " + anzahlPerson);
    }

    public void erhoehtGehalt(int betragErhoehung){
        System.out.println(getVorname() + " hat den Mitarbeiter eine Gehalthöhung von " + betragErhoehung +".Euro gegeben." );
    }

    

    
    
}
