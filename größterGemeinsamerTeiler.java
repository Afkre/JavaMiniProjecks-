import java.util.Scanner;

public class größterGemeinsamerTeiler {
    public static int ggT(int zahl1, int zahl2){        //ggT--->bedeutet größterGemeinsamerTeiler
        int ggT = 1;
        for(int i = 1; i<= zahl1 && i<= zahl2; i++ ){
            if ((zahl1 % i ==0) && (zahl2 % i ==0)){
                ggT = i;
            }
        }
        return ggT;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Geben Sie Zahl1 aus= ");
            int zahl1 = scanner.nextInt();

            System.out.print("Geben Sie Zahl2 aus= ");
            int zahl2 = scanner.nextInt();

            System.out.println("ggT : " + ggT(zahl1, zahl2));
        }

    }
}
