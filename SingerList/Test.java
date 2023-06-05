
import java.util.Scanner;


public class Test {
    private static Singer singer = new Singer();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void aktionDruck() {
        
        System.out.println("\t 0-Show Action");
        System.out.println("\t 1-Show Singer");
        System.out.println("\t 2-Add Singer");
        System.out.println("\t 3-Update Singer");
        System.out.println("\t 4-Delete Singer");
        System.out.println("\t 5-Search Singer");
        System.out.println("\t 6-Exit Application");
        
    }
    public static void showSinger() {
        singer.singerListDruck();
        
    }
    public static void addSinger(){
        
        System.out.println("Name des Sängers, den Sie hinzufügen möchten: ");
        
        String name = scanner.nextLine();
        singer.singerAdd(name);
        
    }
    public static void updateSinger() {
        
        System.out.println("Die Position, die Sie aktualisieren möchten (1,2,3...)");
        
        int position = scanner.nextInt();
        scanner.nextLine();
        
        String neuName = scanner.nextLine();
        
        singer.singerAktuallisieren(neuName, position - 1);
        
    }
    public static void delete() {
        
        System.out.println("Die Position, die Sie löschen möchten (1,2,3....)");
        
        int position = scanner.nextInt();
        
        singer.singerLoesch(position-1);
        
        
    }
    public static void search() {
        
        System.out.println("Der Singer, den Sie suchen möchten:");
        
        String name = scanner.nextLine();
        
        singer.singerSuch(name);
        
        
    }
    public static void main(String[] args) {
        
        System.out.println("\t Willkommen bei der Singer-Anwendung...");
        
        aktionDruck();
        
        boolean ausgang = false;
        
        int aktion;
        
        while(!ausgang) {
            System.out.println("Wählen Sie eine Aktion:");
            
            aktion = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(aktion) {
                case 0:
                    aktionDruck();
                    break;
                case 1:
                    showSinger();
                    break;
                case 2:
                    addSinger();
                    break;
                case 3:
                    updateSinger();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    ausgang = true;
                    System.out.println("Beenden der Anwendung...");
                    break;
                  
                
            }            
            
        }      
        
    }    
}

