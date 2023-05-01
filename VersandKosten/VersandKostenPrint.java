package VersandKosten;

import java.util.Scanner;

public class VersandKostenPrint {
    public static void main(String[]args) {
    
    double gewicht;
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Die Versandgebühr wird nach dem Gewicht der Sendung berechnet.\nBitte geben Sie das Gewicht(als Gramm) der Sendung ein =");
        gewicht = tastatur.nextDouble();

        VersandKosten post1 = new VersandKosten();
        //post1.gewicht = gewicht;
        System.out.println("Die Versandkosten für eine Sendung mit dem angegebenen Gewicht= "+post1.sumCost(gewicht)+" Euro");
        
    }
}









