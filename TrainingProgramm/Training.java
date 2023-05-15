package TrainingProgramm;

public class Training {
    private int burpeezahl;
    private int pushupzahl;
    private int situpzahl;
    private int squatzahl;

    //Constructor
    public Training(int burpeezahl, int pushupzahl, int situpzahl, int squatzahl) {
        this.burpeezahl = burpeezahl;
        this.pushupzahl = pushupzahl;
        this.situpzahl = situpzahl;
        this.squatzahl = squatzahl;
    }

    //Getter && Setter

    public int getBurpeezahl() {
        return burpeezahl;
    }

    public void setBurpeezahl(int burpeezahl) {
        this.burpeezahl = burpeezahl;
    }

    public int getPushupzahl() {
        return pushupzahl;
    }

    public void setPushupzahl(int pushupzahl) {
        this.pushupzahl = pushupzahl;
    }

    public int getSitupzahl() {
        return situpzahl;
    }

    public void setSitupzahl(int situpzahl) {
        this.situpzahl = situpzahl;
    }

    public int getSquatzahl() {
        return squatzahl;
    }

    public void setSquatzahl(int squatzahl) {
        this.squatzahl = squatzahl;
    }

    public void machttraining(String artTraining, int zahl){
        if (artTraining.equals("Burpee") ){
            burpeeMaht(zahl);
        } else if (artTraining.equals("Pushup")){
            pushupMaht(zahl);
        }else if (artTraining.equals("Situp")){
            situpMaht(zahl);
        }else if (artTraining.equals("Squat")){
            squatMaht(zahl);
        }else {
            System.out.println("Ungültige Training...");
        }
    }

    public void burpeeMaht(int zahl){
        if(burpeezahl == 0){
            System.out.println("Burpeetraining ist fertig. Herzlichen Glückwunsch! Sie haben Ihr Ziel erreicht.");
        }
        if (burpeezahl- zahl < 0){
            System.out.println("Perfekt! Herzlichen Glückwunsch, Sie haben Ihr Ziel übertroffen.");
            burpeezahl = 0;
            System.out.println("Anzahl der verbleibenden Burpeezahl : " + burpeezahl );
        } else {
            burpeezahl-= zahl;
            System.out.println("Anzahl der verbleibenden Burpeezahl : " + burpeezahl );
        }
    }

    public void situpMaht(int zahl){
        if(situpzahl == 0){
            System.out.println("Situptraining ist fertig. Herzlichen Glückwunsch! Sie haben Ihr Ziel erreicht.");
        }
        if (situpzahl- zahl < 0){
            System.out.println("Perfekt! Herzlichen Glückwunsch, Sie haben Ihr Ziel übertroffen.");
            situpzahl = 0;
            System.out.println("Anzahl der verbleibenden Situpzahl : " + situpzahl );
        } else {
            situpzahl-= zahl;
            System.out.println("Anzahl der verbleibenden Situpzahl : " + situpzahl );
        }
    }

    public void pushupMaht(int zahl){
        if(pushupzahl == 0){
            System.out.println("Pushuptraining ist fertig. Herzlichen Glückwunsch! Sie haben Ihr Ziel erreicht.");
        }
        if (pushupzahl- zahl < 0){
            System.out.println("Perfekt! Herzlichen Glückwunsch, Sie haben Ihr Ziel übertroffen.");
            pushupzahl = 0;
            System.out.println("Anzahl der verbleibenden Pushupzahl : " + pushupzahl );
        } else {
            pushupzahl-= zahl;
            System.out.println("Anzahl der verbleibenden Pushupzahl : " + pushupzahl );
        }
    }

    public void squatMaht(int zahl){
        if(squatzahl == 0){
            System.out.println("Squattraining ist fertig. Herzlichen Glückwunsch! Sie haben Ihr Ziel erreicht.");
        }
        if (squatzahl- zahl < 0){
            System.out.println("Perfekt! Herzlichen Glückwunsch, Sie haben Ihr Ziel übertroffen.");
            squatzahl = 0;
            System.out.println("Anzahl der verbleibenden Squatzahl : " + squatzahl );
        } else {
            squatzahl-= zahl;
            System.out.println("Anzahl der verbleibenden Squatzahl : " + squatzahl );
        }
    }

    //Controller

    public boolean isTrainingfertig(){
        return (burpeezahl==0) && (situpzahl==0) && (pushupzahl==0) && (squatzahl==0) ;
    }



}
