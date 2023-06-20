package Zahlfinden;

public class Main {
    public static void main(String[] args) {
        int [] zahlen = new int[] {1,2,5,7,9,0};
            int suchen = 6;
            boolean gibt=false;

        for(int zahl : zahlen){
            if(zahl==suchen){
                gibt=true;
                break;
            }
        }

        if(gibt){
            System.out.println("Zahl verfügbar");
        }else {
            System.out.println("Zahl verfügbarnicht");
        }
    }
    
}
