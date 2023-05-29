package MemoryKarteSpiel;

import java.util.Scanner;

public class Main {

    private static Karte[][] karten = new Karte[4][4];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        karten[0][0]= new Karte('E');
        karten[0][1]= new Karte('A');
        karten[0][2]= new Karte('B');
        karten[0][3]= new Karte('F');
        karten[1][0]= new Karte('G');
        karten[1][1]= new Karte('A');
        karten[1][2]= new Karte('D');
        karten[1][3]= new Karte('F');
        karten[2][0]= new Karte('C');
        karten[2][1]= new Karte('C');
        karten[2][2]= new Karte('D');
        karten[2][3]= new Karte('H');
        karten[3][0]= new Karte('E');
        karten[3][1]= new Karte('G');
        karten[3][2]= new Karte('B');
        karten[3][3]= new Karte('H');

        while(istSpielfertig()==false) {
            
            spielBrett();

            vermutungMach();
        }
        scanner.close();
        
    }

    public static void vermutungMach() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Erste Vermutung (geben Sie die Werte i und j mit einem Leerzeichen ein...): ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        karten[i1][j1].setVermutung(true);
        spielBrett();
        
        System.out.print("Zweite Vermutung (geben Sie die Werte i und j mit einem Leerzeichen ein...): ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        if (karten[i1][j1].getWert() == karten[i2][j2].getWert()) {
            System.out.println("Rechte Vermutung.  Glückwunsch!");
            karten[i2][j2].setVermutung(true);
            
        }
        else {
            System.out.println("Falsche Vermutung...");
            karten[i1][j1].setVermutung(false);
            
        }
        
        scanner.close();
        
        
    }
    public static boolean istSpielfertig() {
        
        for (int i =  0 ; i < 4; i++){
            for (int j = 0 ; j < 4 ; j++) {
                if (karten[i][j].isVermutung() == false) {
                    return false;
                    
                }
                
            }
        }
        return true;
        
    }
    public static void spielBrett(){
        
        for (int i = 0 ;  i < 4 ; i++) {
            System.out.println("____________________");
            for (int j = 0 ; j < 4 ; j++) {
                
                if (karten[i][j].isVermutung()) {
                    System.out.print(" |" + karten[i][j].getWert() + "| ");
                    
                }
                else {
                    System.out.print(" | | ");
                    
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");

        
        
    }
    
}
