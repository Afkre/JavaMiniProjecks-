package ProblemLoesungen;

public class Problem {

    public static class Mathematik{
        public static void kreisflache(int  radius){
            System.out.println("Kreisflaechen: " + (Math.PI * radius * radius);
        }
        public static void umfangDreieck(int seite1, int seite2, int seite3){
            System.out.println("Umfang des Dreiecks: " + (seite1 + seite2 + seite3) );
        }

    }

    public static class Physik{
        public static void inneresMultiplikation(Vec vec1, Vec vec2){

            int inneresMultpilikation = vec1.getM() * vec2.getM() + vec1.getN()*vec2.getN() + vec1.getO() * vec2.getO();
            System.out.println(vec1.getName() + " und " + vec2.getName() + " inneres Multiplikation = " + inneresMultiplikation);
        }

    }
    
}
