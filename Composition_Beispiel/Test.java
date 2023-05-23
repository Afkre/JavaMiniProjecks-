package Composition_Beispiel;

public class Test {

    public static void main(String[] args) {
        
        Resolution resolution = new Resolution(1920, 1080);
        Bildschrim bildschrim = new Bildschrim("VS197DE", "ASUS", "18.52", resolution);
        Tower tower = new Tower("Shadow Blade", "Shadow", "Tempered Glass");

        Mainboard mainboard = new Mainboard("B-250-PRO", "Asus", 10, "Windoows 10");

        Computer pc = new Computer(bildschrim, tower, mainboard);

        pc.getTower().computeroffen();

        pc.getBildschrim().bildschrimAusschalten();
        pc.getMainboard().betriebsSystemInstallieren("Ubuntu 16.04");
    }
}
