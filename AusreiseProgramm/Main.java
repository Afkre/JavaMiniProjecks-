package AusreiseProgramm;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Herzlichen Willkommen am Flughafen München");

        String bedingungen = "Ausreiseregeln für das Ausland...\n"
                             +"Sie dürfen kein politisches Verbot haben...\n"
                             +"Sie müssen die Gebühr von 15 Euro vollständig bezahlen...\n"
                             +"Sie müssen ein Visum für das Land haben, in das Sie reisen...";
        
        String message = "Sie müssen alle Anforderungen für das Ausland erfüllen";

        while(true) {
            System.out.println("*******************************************");
            System.out.println(bedingungen);
            System.out.println("*******************************************");
            
            
            Reisende reisende = new Reisende();
            
            System.out.println("Prüfen der Gebühr...");
            
            Thread.sleep(3000);
            if (reisende.abroadFeeControl() == false) {
                
                System.out.println(message);
                continue;
            }
            
            System.out.println("Prüfe politisches Verbot...");
            Thread.sleep(3000);
            
            if (reisende.politicalBanControl() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Checking Visa Status...");
            Thread.sleep(3000);
            
            if (reisende.visaStatusControl() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Ihre Transaktionen sind OK! Sie können ins Ausland gehen...");
            break;
            
        }       
    }
}