package ProblemLoesungen;

import java.util.Scanner;

public class Vek {
    private String name;
    private int m;
    private int n;
    private int o;

    public Vek(String name ){
        this.name = name;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Geben Sie die Werte m, n und o des " + name +" ein.");
        System.out.print("m : ");
        this.m =  scanner.nextInt();
        System.out.print("n : ");
        this.n =  scanner.nextInt();
        System.out.print("o : ");
        this.o =  scanner.nextInt();
    
    }
}

























































































































































    
}
