package BeybladeProgramm;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // BeybladeProgramm mit Polymorphismus

        System.out.println("Willkommen beim Beyblade Programm...");
        System.out.println("Drücken Sie q zum Beenden...");

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("Welches Beyblade möchtest du herstellen?");
            String transaktion = scanner.nextLine();
            if (transaktion.equals("q")){
                System.out.print("Beenden des Programms");
                break;
            }
            else{
                Beybladefabrik beybladefabrik = new Beybladefabrik();
                Beyblade beyblade = beybladefabrik.beyblademacht(transaktion); 

                if (beyblade == null){
                    System.out.print("Bitte geben Sie einen gültigen Beyblade-Namen ein.");
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
