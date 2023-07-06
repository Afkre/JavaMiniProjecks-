
package KioskFlughafen;


public class Main {
    public static void main(String []args) throws InterruptedException{

        System.out.println("Willkommen am Flughafen Memmingen");
        
        String bedingungen;
        bedingungen = "KioskSystem-Nutzungsbedingungen...\n"
                      +"Um das Kiosk-System nutzen zu können, müssen die Reisenden alle folgenden Voraussetzungen erfüllen...\n"
                      +"Der Fluggast muss über ein gültiges Visum für das Zielland verfügen...\n"
                      +"Der Fluggast muss im Besitz eines gültigen Reisepasses sein.  Achten Sie bitte auf das Ablaufdatum...\n"
                      +"Gegen den Fluggast darf kein gerichtliches Ausreiseverbot verhängt worden sein. Dies wird bei der Polizeikontrolle erneut überprüft...\n"
                      +("Der Fluggast darf kein anderes Gepäck als Handgepäck mitführen...\n")
                      +"Das Handgepäck des Fluggastes darf 8 Kilogramm nicht überschreiten...\n";

        
        String message = "Sie müssen alle Anforderungen für das Ausland erfüllen";

        while(true) {
            System.out.println("*******************************************");
            System.out.println(message);
            System.out.println("*******************************************");
            System.out.println(bedingungen);
            
            Fluggast fluggast = new Fluggast();

            System.out.println("Der Visastatus wird überprüft.");

            Thread.sleep(3000);
            if (fluggast.visumStatusKontroll()==false){

                System.out.println(message);
                continue;
            }

            System.out.println("Die Gültigkeit des Reisepasses wird überprüft.");

            Thread.sleep(3000);
            if (fluggast.gültigkeitRPassesKontroll()==false){

                System.out.println(message);
                continue;
            }


            System.out.println("Es wird geprüft, ob eine Ausreiseverbote bestehen..");

            Thread.sleep(3000);
            if (fluggast.ausReiseVerbotKontroll()==false){

                System.out.println(message);
                continue;
            }

            System.out.println("Es wird geprüft, ob außer dem Handgepäck noch anderes Gepäck vorhanden ist.");

            Thread.sleep(3000);
            if (fluggast.gepaeckKontroll()==false){

                System.out.println(message);
                continue;
            }

            
            System.out.println("Es wird geprüft, ob das Handgepäck ein angemessenes Gewicht hat.");

            Thread.sleep(3000);

            if (fluggast.kabinGepaeckKontroll()==false){

                System.out.println(message);
                continue;
            }

            System.out.println("Ihre Verfahren sind abgeschlossen! Sie können Ihre Bordkarte für den Flug erhalten.");


        }
    }
    
}
