public class Main{
    public static void main (String[]args){
        // Object Oriented Programming - GeldAutomat

        // Login Class-> kontrolliert die Benutzereingaben

        // Konto Class-> erledigt die Kontotransactionen

        // Geldautomat Class -> wird den Bankautomaten bedienen.


        GeldAutomat geldAutomat = new GeldAutomat();

        geldAutomat.arbeit();

        System.out.println("Ausstieg aus dem Programm!..");

    }
    

}