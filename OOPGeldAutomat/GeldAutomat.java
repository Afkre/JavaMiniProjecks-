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
                int einloginrecht = -=1;

                System.out.println("verbleibender Einlogin:  " + login );
            }
        }
    }
}
