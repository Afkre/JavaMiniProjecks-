package Encapsulation;

public class Abo {
    public String name;
    
    public int restbetrag;
    
    public String stadt;

    public void erdgasbenutz(int betrag){
        if ((this.restbetrag - betrag ) < 0){

            System.out.println("Kein genung Restbetrag");

        } else {
            this.restbetrag-=betrag;
            if (this.restbetrag <= 0){
                System.out.println("Kein Restbetrag. Bitte laden Sie Guthaben auf."
                +"Guthaben Limit ist max. 120 Euro"
                );
            } else {
                System.out.println("Neue Betrag :" + restbetrag);
            }
        }

    }

    public void restbetraganfragen(){

        System.out.println("Restbetrag = " + restbetrag);
}

    
}
