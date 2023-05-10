public class Main{
    public static void main (String[]args){

        // Object Oriented Programming - GeldAutomat
        // Login Class-> kontrolliert die Benutzereingaben
        // Konto Class-> erledigt die Kontotransactionen
        // Geldautomat Class -> wird den Bankautomaten bedienen.

        GeldAutomat geldAutomat = new GeldAutomat();
        Konto konto = new Konto ("Ahmet Efkere", "123456", 2500);

        geldAutomat.arbeit(konto);

        System.out.println("Ausstieg aus dem Programm!..");

    }
    

}