       
         
public class Primzahlenbis1000 {
        /*
        *Aufgabe--->Gibt die Primzahlen von 1 bis 1000 auf dem Bildschirm aus.
        *Hinweis:
        *    Primzahl : Eine Zahl, die nicht durch 1 und eine beliebige andere Zahl teilbar ist, wird als Primzahl bezeichnet.
        */

    public static boolean primzahl(int zahl) {
                                 //Hier wird im Wesentlichen geprüft, ob die Zahl eine Primzahl ist oder nicht. 
        for (int i = 2 ; i < zahl;i++) {
            
            if (zahl % i == 0){
                return false;    //Eine Zahl ist nicht prim, wenn sie genau teilbar ist, d. h. wenn der Rest gleich Null ist.
            }
        }
        return true;             //Eine Zahl ist prim, wenn sie nicht genau teilbar ist, d. h. wenn der Rest ungleich Null ist.
    }
    
    public static void main(String[] args) {
                                //Hier wird die Primzahlmethode nacheinander auf Zahlen von 1 bis zu 1000 angewendet.
        
        for (int i = 2 ; i < 1000 ; i++) {
            
            if (primzahl(i)){
                System.out.println(i);
                
            }
        }        
    }
}