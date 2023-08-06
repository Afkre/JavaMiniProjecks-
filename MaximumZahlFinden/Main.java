package MaximumZahlFinden;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Ermitteln der größten Zahl der drei vom Benutzer erhaltenen Zählungen
        Scanner scanner =  new Scanner(System.in);
        
        System.out.print("Erste Nummer : ");
        int a = scanner.nextInt();
        System.out.print("Zweite Nummer : ");
        int b  = scanner.nextInt();
        System.out.print("Dritte Nummer: ");
        int c  = scanner.nextInt();
        
        
        int max = -1;
        
        if ( a >= b && a >= c) {
            
            max = a;
        }
        else if (b >= a && b >= c) {
            
            max = b;
        }
        else {
            
            max = c;
            
        }
        scanner.close();
        System.out.println("Maximum Zahl: " + max);
        
    }
    
}
