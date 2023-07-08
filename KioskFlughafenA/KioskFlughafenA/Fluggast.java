package KioskFlughafenA;

import java.util.Scanner;

public class Fluggast implements Regeln {
    
    private boolean visum;
    private boolean gültigkeitRPass; 
    private boolean ausReiseVerbot;
    private boolean gepaeck;
    private boolean kabinGepaeck;
    
    public Fluggast(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Besitzen Sie ein gültiges Visum für das Land, in das Sie reisen (Ja oder Nein)?");
        
        String antwort1 = scanner.nextLine();
        
        if (antwort1.equals( "Ja")) {    
            this.visum = true;    
        }
        else{
            this.visum = false;
        }        
        
        System.out.print("Ist Ihr Reisepass für Reisen gültig (Ja oder Nein)?");
        String antwort2 = scanner.nextLine();
        
        if (antwort2.equals("Ja")) {
            this.gültigkeitRPass = true;
        }
        else{
            this.gültigkeitRPass = false;
        } 
        
        System.out.print("Ist es Ihnen gesetzlich verboten, ins Ausland zu reisen (Ja oder Nein)?");
        String antwort3 = scanner.nextLine();
        
        if (antwort3.equals ("Nein")) {            
            this.ausReiseVerbot = true;            
        }
        else{
            this.ausReiseVerbot = false;
        }
        
        System.out.print("Haben Sie noch anderes Gepäck als Handgepäck? (Ja oder Nein)?");
        String antwort4 = scanner.nextLine();
        
        if (antwort4.equals("Nein")) {            
            this.gepaeck = true;            
        }
        else{
            this.gepaeck = false;
        }
        
        System.out.print("Ist Ihr Handgepäck schwerer als 8 Kilogramm? (Ja oder Nein)?");
        String antwort5 = scanner.nextLine();
        
        if (antwort5.equals("Nein")) {            
            this.kabinGepaeck = true;
        }
        else{
            this.kabinGepaeck = false;
        }
        
        scanner.close();
        
    }
    
    @Override
    public boolean visumStatusKontroll() {
        
        if(this.visum==true){
            
            System.out.println("Das Visumverfahren ist abgeschlossen");
            return true;
        }
        else {
            
            System.out.println("Sie nicht reisen können, weil Sie kein Visum für das Zielland haben");
            return false;
        }
        
    }

    @Override
    public boolean gültigkeitRPassesKontroll() {
        
        if (this.gültigkeitRPass == true ){
            System.out.println("Das Reisepassverfahren ist abgeschlossen.");
            return true;
        }
        else{
            System.out.println("Sie nicht reisen können, weil Sie keinen gültigen Reisepass haben.");
            return false;
        }
            

    }

    @Override
    public boolean ausReiseVerbotKontroll() {
        
        if(this.ausReiseVerbot==true){
            System.out.println("Sie können nicht reisen, da Ihnen die Ausreise aus dem Land gesetzlich untersagt ist.");
            return false;
        }
        else {
            System.out.println("Sie können reisen, da Ihnen keine Ausreise aus dem Land gesetzlich untersagt ist.");
            return true;
        }
    }

    @Override
    public boolean gepaeckKontroll() {
        
        if(this.gepaeck == true){
        
            System.out.println("Sie können weiterführen.");
            return true;
        }
        else{
            System.out.println("Da Sie Gepäck haben, müssen Sie am normalen Schalter erledigen.");
            return false;
        }

    }

    @Override
    public boolean kabinGepaeckKontroll() {
        
        if(this.kabinGepaeck == true){
            System.out.println("Kabinengepäckverfahren sind abgeschlossen.");
            return true;
        }
        else{
            System.out.println("Da Sie Kabinengepäck mit Gewicht von mehr als 8 kg haben, müssen Sie am normalen Schalter erledigen.");
            return false;
        }

    }
    
    
}
