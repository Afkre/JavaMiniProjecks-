package MitarbeitersProgramm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner (System.in);
    System.out.println("Herzlichen Willkommen, zum MitarbeitersProgramm");

    String operationen = "Operationen...\n"
                        +"1. Software-Entwickler Operationen\n"
                        +"2.Verwalter Operationen."
                        +"Drücken Sie q zum Beenden.";  
     System.out.println("...........................................");
     System.out.println(operationen);
     System.out.println("...........................................");
     
     while (true){
        System.out.println("Wählen Sie bitte eine Operation!...");
        String operation = scanner.nextLine();

        if(operation.equals("q")){
            System.out.println("Beenden des Programms");
        } else if (operation.equals("1")){
            SoftwareEntwickler softwareEntwickler = new SoftwareEntwickler("Adam", "Stein", 123456, "Pyhton, Jaca,C#");
            
            String entwickler_Operation = "1.Formatierung \n"
                                         +"2.Informationen anzeigen. \n"
                                         + "Drücken Sie q zum Beenden.";
            System.out.println(entwickler_Operation);                             
            
            while (true){

                System.out.println("Wählen Sie bitte eine Operation!...");
                String e_operation = scanner.nextLine();

                if (e_operation.equals("q")){
                    System.out.println("Beenden der Softwareentwickler-Operationen.");
                    break;
                } else if (e_operation.equals(("1"))){
                    System.out.println("Betriebssystem :");
                    String betribssystem = scanner.nextLine();
                    softwareEntwickler.formattieren(betribssystem);
                }
                else if(e_operation.equals("2")){
                    softwareEntwickler.anzeigenInfornationen();
                }else{
                    System.out.println("ungültige Software Entwickler Operation");
                }
            }

        }else if (operation.equals("2")){
            
            
        }
     }



    }
}
