import java.util.Scanner;

public class GeldAutomat {
    public void arbeit(Konto konto){

        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzlich willkommen bei unserer Bank...");

        System.out.println("****************************************");

        System.out.println("Benutzer EinLogin");

        System.out.println("****************************************");

        int einloginrecht = 3;

        while (true){
            if (login. login(konto)){
                System.out.println("Erfolgreiherlige Einlogin");
                break;
            }else{
                System.out.println("unerfolgreichliche Einlogin");
                einloginrecht -=1;

                System.out.println("verbleibender Einlogin:  " +einloginrecht );

                if (einloginrecht == 0){
                    System.out.println("Ihr Einlogginrecht ist erloschen.");
                    
                    return;
                }
            }

            System.out.println("****************************************");

            String operationen = "1.Bilanz ansehen\n"
                                +"2.Geld  einzahlen\n"
                                +"3.Geld abheben\n"
                                +"Zum Verlassen drücken Sie Q";
            
            System.out.println(operationen);
            System.out.println("****************************************");
        }
    }
}
