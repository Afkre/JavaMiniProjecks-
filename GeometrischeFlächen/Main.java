package GeometrischeFlächen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
     
        Scanner scanner = new Scanner(System.in);

        String transactions = "Transactions...\n"
                            +"1.Quadratischer Flächenrechner\n"
                            +"2.Dreieckischer Flächenrechner\n"
                            +"3.Kreisischer Flächenrechner\n"
                            +"q:Ausgang";
        
        while(true){
            System.out.println(transactions);
            System.out.print("Von welcher Form möchten Sie die Fläche berechnen: ");

            String formArt = scanner.nextLine();
            Form form = null;

            if(formArt.equals("q")){
                System.out.println("Beendigung des Programms");
                break;
            }
            else if(formArt.equals("1")){
                System.out.print("Seitenlänge des Quadrats:  ");
                int seitenlaenge= scanner.nextInt();
                scanner.nextLine();

                form = new Quadrat("Quadrat1", seitenlaenge);

                form.flaechenRechner();
            }
            else if(formArt.equals("2")){
                System.out.print("Seitenlänge1:  ");
                int seitenlaenge1= scanner.nextInt();
                System.out.print("Seitenlänge2:  ");
                int seitenlaenge2= scanner.nextInt();
                System.out.print("Seitenlänge3:  ");
                int seitenlaenge3= scanner.nextInt();


                scanner.nextLine();

                form = new Dreieck("Dreieck1", seitenlaenge1, seitenlaenge2, seitenlaenge3);

                form.flaechenRechner();
            }
            else if(formArt.equals("3")){
                System.out.print("Radius des Kreises:  ");
                


                scanner.nextLine();

                
                form.flaechenRechner();
            }

            

        }

    }
}

