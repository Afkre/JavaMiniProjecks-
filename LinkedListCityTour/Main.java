package LinkedListCityTour;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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
         Scanner scanner = new Scanner(System.in);
        
        if (!iterator.hasNext()) {
            
            System.out.println("Es gibt keine Städte...");
        }
        boolean ausgang = false;
        boolean next = true;
        
        while (!ausgang) {
            System.out.println("Wählen Sie eine Transaktion:");
            
            transaktion = scanner.nextInt();
            
            switch(transaktion) {
                case 0:
                    transaktionenDruck();
                    break;
                case 1:
                    if (!next) {
                        if (iterator.hasNext()) {
                            
                            iterator.next();
                            
                        }
                        next = true;
                        
                    }
                    if (iterator.hasNext()) {
                        
                        System.out.println("Anreise in die Stadt " + iterator.next());
                       
                    }
                    else {
                        System.out.println("Gidilecek Şehir Kalmadı...");
                        next = true;
                        
                        
                    }
                    break;
                case 2:
                    if (next){
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            
                        }
                        next = false;
                        
                    }
                    if (iterator.hasPrevious()) {
                        
                        System.out.println("Anreise zur Stadt : " + iterator.previous());
                        
                    }
                    else {
                        System.out.println("Die Citiestour hat begonnen....");
                    }
                    break;
                    
                case 3:
                    ausgang = true;
                    System.out.println("Die Anwendung wird aufgegeben....");
                    break;
                
                
                
                
            }
            
            
            
            
        }
        
        
        
    }




    }
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<String>(null);

        cities.add("Köln");
        cities.add("Düsseldorf");
        cities.add("Bonn");


        
    }
    
}
