package GeometrischeFlächen;

public class Kreis extends Form {
    private int radius;

    public Kreis(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void flaechenRechner(){

        System.out.println(getName() +"flache : " + (Math.PI*radius*radius));

    }
    
}
