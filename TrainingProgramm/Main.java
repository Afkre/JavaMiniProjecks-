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

        System.out.print("Burplee Zahl: ");
        int burpee = scanner.nextInt();

        System.out.print("Pushup Zahl: ");
        int pushup = scanner.nextInt();

        System.out.print("Situp Zahl: ");
        int situp = scanner.nextInt();

        System.out.print("Squat Zahl: ");
        int squat = scanner.nextInt();

        scanner.nextLine();

        Training training = new Training(burpee, pushup, situp, squat);

        System.out.println("Ihre Training beginnt...");

        while (training.isTrainingfertig() == false) {
            System.out.print("Art der Training(Burpee, Pushup, Situp, Squat) :");
            String art = scanner.nextLine();
            System.out.println("Wie viele würden Sie diese Art? ");
            int zahl = scanner.nextInt();
            scanner.nextLine();
            training.machttraining(art, zahl);

        }
        System.out.println("Ihre Training ist schon fertig...");









    } 
    
}
