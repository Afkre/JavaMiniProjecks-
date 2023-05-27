import java.util.Scanner;

public class taschenRechnerOverloading {
    /*
    Aufgabe: 
    Versuchen Sie, einen Taschenrechner mit Methodenüberladung zu entwerfen.
    Entwirf die Methoden Addition und Multiplikation so, dass sie 2 oder 3 Parameter benötigen.
    */

    public static int subtraktion(int a, int b){
        return (a - b);
    }
    public static double divison(int a, int b){
        return ((double)a / b);
    }
    public static int addition(int a, int b){
        return (a + b );
    }
    public static int addition(int a, int b, int c){
        return (a + b + c);
    }
    public static int addition(int a, int b, int c, int d){
        return (a + b + c + d);
    }
    public static int multiplikation(int a, int b){
        return (a * b );
    }
    public static int multiplikation(int a, int b, int c){
        return (a * b * c );
    }
    public static int multiplikation(int a, int b, int c, int d){
        return (a * b * c * d);
    }  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operationen = "1.Addition Operation\n"
				+ "2.Subtraktionsvorgang\n"
				+ "3.Multiplikation Prozess\n"
				+ "4.Division Vorgang\n";
        System.out.println("*********************************");
		System.out.println(operationen);
        System.out.println("*********************************");
       
		

        while (true) {
            System.out.print("Wählen Sie eine Operation:");
            String operation = scanner.nextLine();


            if (operation.equals("q")){
                System.out.println("Das Programm wurde verlassen...");
                break;
            } else if (operation.equals("1")){
                System.out.println("Wie viele Werte werden Sie bei der Addition schreiben? (2, 3 oder 4)");

                int wievieleZahl = scanner.nextInt();
                
                if(wievieleZahl==2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Summe der eingegebenen Zahlen "+ (addition(a,b)));

                } else if(wievieleZahl==3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Summe der eingegebenen Zahlen "+ (addition(a,b,c)));


                } else if(wievieleZahl==4){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    System.out.print("c: ");
                    int c = scanner.nextInt();

                    System.out.print("d: ");
                    int d = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Summe der eingegebenen Zahlen "+ (addition(a,b,c,d)));


                } else{
                    System.out.println("Es keine geeignete Methode für dieses Verfahren gibt.");
                }         
            }else if (operation.equals("2")){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Subtraktion der eingegebenen Zahlen "+ (subtraktion(a, b)));
            } else if (operation.equals("3")){
                System.out.println("Wie viele Werte werden Sie bei der Multiplikation schreiben? (2, 3 oder 4)");

                int wievieleZahl = scanner.nextInt();
                
                if(wievieleZahl==2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Multiplikation der eingegebenen Zahlen "+ (multiplikation(a,b)));

                } else if(wievieleZahl==3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Multiplikation der eingegebenen Zahlen "+ (multiplikation(a,b,c)));


                } else if(wievieleZahl==4){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    System.out.print("c: ");
                    int c = scanner.nextInt();

                    System.out.print("d: ");
                    int d = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Multiplikation der eingegebenen Zahlen "+ (multiplikation(a,b,c,d)));


                } else{
                    System.out.println("Es keine geeignete Methode für dieses Verfahren gibt.");
                }         
        } else if (operation.equals("4")){
            System.out.print("a: ");
            int a = scanner.nextInt();

            System.out.print("b: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Divison der eingegebenen Zahlen "+ (divison(a, b)));
        }else {
            System.out.println("ungültige Operation");
        
        } 
        scanner.close();
        
    }


    }
}
