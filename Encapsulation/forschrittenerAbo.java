package Encapsulation;

//Erdgas Abo

public class forschrittenerAbo {

    private String name;

    private int restbetrag = 120 ;

    private String stadt;

    public forschrittenerAbo(String name, int restbetrag, String stadt) {
        this.name = name;

        if (restbetrag >= 0 && restbetrag<= 120 ){
            this.restbetrag = restbetrag;

        }

        this.stadt = stadt;
    }

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
