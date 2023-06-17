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
        
        String antwort2 = scanner.nextLine();
        
        if (antwort2.equals("ja") ){
            this.visumstatus = true;            
        }
        else {
            this.visumstatus = false;
        }
        scanner.close();
        
    }
    
    
@Override
    public boolean abroadFeeControl() {
        if (this.offizielleGebühr < 15) {
            
            System.out.println("Bitte zahlen Sie die Ausreisegebühr in voller Höhe...");
            return false;
        }
        else {
            System.out.println("Transaktion der Ausreisegebühr abgeschlossen!");
            return true;
        }
    }

    @Override
    public boolean politicalBanControl() {
        
        if (this.politischesVerbot == true) {
            System.out.println("Sie haben ein politisches Verbot. Sie können nicht ins Ausland gehen...");
            return false;
        }
        else {
            System.out.println("Sie haben kein politisches Verbot...");
            return true;
        }
    }

    @Override
    public boolean visaStatusControl() {
        if (this.visumstatus == true) {
            
            System.out.println("Visum ist erledigt!");
            return true;
        }
        else {
            System.out.println("Ihr Visum ist für Ihr Zielland nicht verfügbar...");
            return false;
        }

    }


}

