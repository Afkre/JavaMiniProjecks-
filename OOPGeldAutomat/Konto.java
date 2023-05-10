
public class Konto {
        private String benutzerName;
        private String pass;
        private int bilanz;

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
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
            this.pass = pass;
            this.bilanz = bilanz;
        }
        public void geldeinzahlen(int betrag){
            bilanz +=betrag;
            System.out.println("Ihr neu Bilanz " + bilanz);

        }
        /**
         * @param betrag
         */
        public void geldabheben(int betrag){
            if ((bilanz - betrag)<0){
                System.out.println("Sie haben nicht genug Bilanz/Geld auf Ihrem Konto");
            } else {
            bilanz -= betrag;
            System.out.println("Ihr neu Bilanz " + bilanz);

        }


    
}
}
