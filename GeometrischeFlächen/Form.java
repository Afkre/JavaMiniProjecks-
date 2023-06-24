package GeometrischeFlächen;

public abstract class Form {
    
    private String name;

    public String getName() {
        return name;
    }

    abstract void flaechenRechner();

    public void setName(String name) {
        this.name = name;
    }

    public Form (String name){
        this.name = name;
    } 



}
