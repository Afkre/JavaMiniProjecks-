package Notfalldienst;

import java.util.PriorityQueue;
import java.util.Queue;



public class Main {
    public static void main(String[] args) {
        // Notdienstanwendung
        
        /*
        Die Patienten werden entsprechend ihrer Beschwerden in der Notaufnahme an den Anfang der Warteschlange gestellt (PriorityQueue).
        
        Blinddarmentzündung ----> Höchste Priorität
        Verbrennung -------> Mittlere Priorität
        Kopfschmerzen ---> Geringste Priorität
        
        new Patient("Herr Murat", "Verbrennung")
        */

        Queue<Patient> notdienst = new PriorityQueue<Patient>();
        
        notdienst.offer( new Patient("Adam","Verbrennung"));
        notdienst.offer( new Patient("David","Kopfschmerzen"));
        notdienst.offer(new Patient("Anna","Blinddarmentzuendung"));
        notdienst.offer( new Patient("Ute","Verbrennung"));
        notdienst.offer(new Patient("Bill","Verbrennung"));
        notdienst.offer( new Patient("Abraham","Blinddarmentzuendung"));
        
        int i = 1;
        
        while(notdienst.isEmpty() != true) {
            System.out.println("**************************************");
            System.out.println(i + ".");
            System.out.println(notdienst.poll());
            System.out.println("**************************************");
            i++;
            
        }
    }
}
