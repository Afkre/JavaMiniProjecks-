import java.util.Scanner;

public class Login {
    public boolean login(Konto konto) {

    Scanner scanner = new Scanner(System.in);
    String benutzerName;
    String pass;

    System.out.println("Benutzer Name: ");
    benutzerName = scanner.nextLine();
    System.out.println("Passwort : ");
    pass = scanner.nextLine();

    if (konto.getBenutzerName().equals(benutzerName) && konto.getPass().equals(pass)){
        return true;
    } else{
        return false;
    }
    
    }
    
}
