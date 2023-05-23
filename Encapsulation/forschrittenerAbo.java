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

    

   


}
