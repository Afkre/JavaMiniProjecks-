import java.util.Scanner;

public class Login {
    public boolean login(Konto konto) {

    Scanner scanner = new Scanner(System.in);
    String benutzerName;
    String passwort;

    System.out.println("Benutzer Name: ");
    benutzerName = scanner.nextLine();
    System.out.println("Passwort : ");
    passwort = scanner.nextLine();

    if (konto.getBenutzerName().equals(benutzerName) && konto.getPasswort().equals(passwort)){
        return true;
    } else{
        return false;
    }

    }
}
