package GeometrischeFlächen;

public abstract class Form {
    
    private String name;

    public Form (String name){
        this.name=name
    }

    abstract void flaechenRechner();
}
