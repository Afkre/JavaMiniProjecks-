package Composition_Beispiel;

public class Computer {

    private Bildschrim bildschrim;

    private Tower tower;

    private Mainboard mainboard;

    public Computer(Bildschrim bildschrim, Tower tower, Mainboard mainboard) {
        this.bildschrim = bildschrim;
        this.tower = tower;
        this.mainboard = mainboard;
    }

    


    public Bildschrim getBildschrim() {
        return bildschrim;
    }

    public void setBildschrim(Bildschrim bildschrim) {
        this.bildschrim = bildschrim;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    





    





}