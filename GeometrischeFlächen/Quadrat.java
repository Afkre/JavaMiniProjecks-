package GeometrischeFlächen;

public class Quadrat extends Form{
    private int seite;


    public Quadrat(String name, int seite){
        super(name);
        this.seite= seite;
    }

    @Override
    void flaechenRechner(){

        System.out.println(getName() + " flaechen : " + (seite * seite));

    }
    
}
