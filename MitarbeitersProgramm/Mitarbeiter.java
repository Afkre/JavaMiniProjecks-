package MitarbeitersProgramm;

public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private int id;

    public Mitarbeiter(String vorname, String nachname, int id) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.id = id;
    }

    public void anzeigenInfornationen(){
        System.out.println("Mitarbeiter Informationen....");
        System.out.println("Vorname : " + vorname);
        System.out.println("Nachname : " + nachname);
        System.out.println("ID : " + id);
        
    }

    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
