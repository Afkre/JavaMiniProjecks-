package TrainingProgramm;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        //Training Programm erstellen
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkomen zum Trainingsprogramm");

        String trainingen ="Gültige Arten ...\n"
                            + "Burpee\n"
                            + "Pushup\n"
                            + "Situp\n"
                            + "Squat";
        System.out.println(trainingen);

        System.out.println("Erstellen Sie eine Training...");

        System.out.println("Burplee Zahl: ");
        int burpee = scanner.nextInt();

        System.out.println("Pushup Zahl: ");
        int pushup = scanner.nextInt();

        System.out.println("Situp Zahl: ");
        int situp = scanner.nextInt();

        System.out.println("Squat Zahl: ");
        int squat = scanner.nextInt();

        Training training = new Training(burpee, pushup, situp, squat);

        







    } 
    
}
