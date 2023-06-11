package LinkedListCityTour;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void transaktionenDruck(){

        System.out.println("0 - Transaktionen anzeigen..");
        System.out.println("1 - Gehe zur nächsten City");
        System.out.println("2 - Gehe zum vorherigen City..");
        System.out.println("3 - Aus der Anwendung..");
    }
    


    public static void cityBesichtigen(LinkedList<String> cities){

        ListIterator<String> iterator = cities.listIterator();
        int transaktion;

        transaktionenDruck();




    }
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<String>(null);

        cities.add("Köln");
        cities.add("Düsseldorf");
        cities.add("Bonn");


        
    }
    
}
