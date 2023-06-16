package AusreiseProgramm;

import java.util.Scanner;

public class Reisende implements RegelnAusland{
    private int offizielleGebühr;
    private boolean politischesVerbot;
    private boolean visumstatus;

    public Reisende(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Die von Ihnen gezahlte offizielleGebühr : ");
        this.offizielleGebühr = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Haben Sie ein politisches Verbot (ja oder nein)?");
        String antwort = scanner.nextLine();

        if (antwort.equals("ja")) {
            
            this.politischesVerbot = true;
        } 
        else {
            this.politischesVerbot = false;
        }
        System.out.print("Haben Sie ein Visum (ja oder nein)?");
        
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("ja") ){
            this.visumstatus = true;            
        }
        else {
            this.visumstatus = false;
        }
        
    }
    
    
}
