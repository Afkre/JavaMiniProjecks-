package BeybladeProgramm;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // BeybladeProgramm mit Polymorphismus

        System.out.println("Willkommen beim Beyblade Programm...");
        System.out.println("Drücken Sie q zum Beenden...");

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Welches Beyblade möchtest du herstellen?");
            String transaktion = scanner.nextLine();
            if (transaktion.equals("q")){
                System.out.println("Beenden des Programms");
                break;
            }
            else{
                Beybladefabrik beybladefabrik = new Beybladefabrik();
                Beyblade beyblade = beybladefabrik.beyblademacht(transaktion); 

                if (beyblade == null){
                    System.out.println("Bitte geben Sie einen gültigen Beyblade-Namen ein.");
                }
                else {
                    beyblade.anzeigtInformationen();
                    beyblade.angriff();
                    beyblade.entfessleHeiligeBestie();
                }
            }
        }
        scanner.close();

    }    
}
