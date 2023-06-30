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

        scanner.close();
    
    }

    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

    
}

























































































































































    
}
