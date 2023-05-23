package Encapsulation;

public class Main {
    
    public static void main(String[]args){

        /*
        //Das ist falsch.
        Abo abo = new Abo ();
        abo.name = "Ahmet Efkere"; 
        abo.restbetrag = 200;
        abo.stadt = "Stuttgart";

        abo.erdgasbenutz(200);
        */
        
        forschrittenerAbo abo = new forschrittenerAbo("Ahmet Efkere", 200, "Stuttgart");
        abo.restbetraganfragen();   
    




    }
}
