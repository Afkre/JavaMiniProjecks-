package AusreiseProgramm;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Herzlichen Willkommen am Flughafen München");

        String bedingungen = "Ausreiseregeln für das Ausland...\n"
                             +"Sie dürfen kein politisches Verbot haben...\n"
                             +"Sie müssen die Studiengebühr von 15 Euro vollständig bezahlen...\n"
                             +"Sie müssen ein Visum für das Land haben, in das Sie reisen...";
        
        String message = "Sie müssen alle Anforderungen für das Ausland erfüllen";

        while(true) {
            System.out.println("*******************************************");
            System.out.println(Bedingungen);
            System.out.println("*******************************************");
            
            
            Reisende reisende = new Reisende();
            
            System.out.println("Prüfen der Gebühr...");
            
            Thread.sleep(3000);
            if (passenger.abroadFeeControl() == false) {
                
                System.out.println(Meldung);
                weiter;
            }
            
            System.out.println("Prüfe politisches Verbot...");
            Thread.sleep(3000);
            
            if (traveller.politischesVerbotKontrol() == false) {
                System.out.println(Meldung);
                weiter;
            }
            System.out.println("Checking Visa Status...");
            Thread.sleep(3000);
            
            if (passenger.visaStatusCheck() == false){
                System.out.println(Meldung);
                weiter;
            }
            System.out.println("Ihre Transaktionen sind OK! Sie können ins Ausland gehen...");
            break;
            
            
        }
        
        
    }
}