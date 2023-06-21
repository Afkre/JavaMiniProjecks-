package GeometrischeFlächen;

public class Dreieck extends Form{
    private int a;
    private int b;
    private int c;

    public Dreieck(String name, int a, int b, int c){
        super(name);
        this.a=a;
        this.b=b;
        this.c=c;

    }


    @Override
    void flaechenRechner() {
    
        double u = (a+b+c)/2.0;

        double flaeche= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println();
        
    }

    
    
}
