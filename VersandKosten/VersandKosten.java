package VersandKosten;

public class VersandKosten{
    public double gewicht, kosten; 

    public double sumCost(double weight){
        if (gewicht<=200)
            kosten = 2.80;
        else if(gewicht>200)
            kosten = 3.00 + (0.50 * ((Math.ceil((weight-150)/25))));

        else 
            System.out.println("der Gewichtswert ist falsch.");
        return kosten;    
    }
}