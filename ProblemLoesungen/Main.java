package ProblemLoesungen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen beim Programm für mathematische und physikalische Probleme");
        String transactions = "Transactions ...\n"
                            + "1. Berechnung der Kreisfläche\n" 
                            + "2. Berechnung des Dreiecksumfangs\n" 
                            + "3. Berechne das inverse Produkt zweier Vektoren"
                            + "Beenden: q ";

        while(true){

            System.out.println(transactions);
            System.out.print("Wählen Sie eine Transaction: ");
            String transaction = scanner.nextLine();

            if (transaction.equals("q")){
                System.out.println("Beenden des Programms");
                break;
            }
            else if (transaction.equals("1")){
                System.out.print("Radius der Kreisfläche : ");
                int radius = scanner. nextInt();
                scanner.nextLine();

                Problem.Mathematik.kreisflache(radius);
                
                scanner.close();

            }
            else if (transaction.equals("2")){

                System.out.print("Seite 1: ");
                int seite1 = scanner.nextInt();
                System.out.print("Seite 2: ");
                int seite2 = scanner.nextInt();
                System.out.print("Seite 3: ");
                int seite3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Mathematik.umfangDreieck(seite1, seite2, seite3);

                scanner.close();

            }
            else if (transaction.equals("3")){
                Vec vec1 = new Vec("Vector1");
                Vec vec2 = new Vec("Vector2");

                Problem.Physik.inneresMultiplikation(vec1, vec2);


            }
            else {
                System.out.println("ungültige Transaction...");
            }
            
        }

    }
}
