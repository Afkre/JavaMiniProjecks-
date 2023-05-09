import java.lang.reflect.Constructor;

public class Konto {
        private String benutzerName;
        private String passwort;
        private int bilanz;

        public String getPasswort() {
            return passwort;
        }

        public void setPasswort(String passwort) {
            this.passwort = passwort;
        }

        

        public String getBenutzerName() {
            return benutzerName;
        }

        public void setBenutzerName(String benutzerName) {
            this.benutzerName = benutzerName;
        }

        public int getBilanz() {
            return bilanz;
        }

        public void setBilanz(int bilanz) {
            this.bilanz = bilanz;
        }

        public Konto(String benutzerName, String pass, int bilanz){
            this.benutzerName= benutzerName;
            this.passwort = passwort;
            this.bilanz = bilanz;
        }
        public void geldeinzahlen(int betrag){
            bilanz +=betrag;
            System.out.println("Ihr neu Bilanz " + bilanz);

        }
        public void geldabheben(int betrag){
            if ((bilanz - betrag)<0){
                System.out.println("Sie haben nicht genug Bilanz/Geld auf Ihrem Konto");
            }
        }else {
            bilanz -= betrag;
            System.out.println("Ihr neu Bilanz " + bilanz);

        }


    
}
