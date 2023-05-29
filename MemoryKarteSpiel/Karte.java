package MemoryKarteSpiel;

public class Karte {

    public char wert;
    public boolean vermutung=false;

    public Karte(char wert) {
        this.wert = wert;
    }

    public char getWert() {
        return wert;
    }

    public void setDeger(char wert) {
        this.wert = wert;
    }

    public boolean isVermutung() {
        return vermutung;
    }

    public void setVermutung(boolean vermutung) {
        this.vermutung = vermutung;
    }
}