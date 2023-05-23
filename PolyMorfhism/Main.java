package PolyMorfhism;

class Tier{
    private String name;

    public Tier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String spricht (){
        return "Tier bewegt...";
    }

}

class Katze extends Tier{

    public Katze(String name){
        super(name);
    }

    @Override
    public String spricht() {
        return this.getName() + "  miaut...";
    }
}

class Hund extends Tier{

    public Hund(String name){
        super(name);
    }

    @Override
    public String spricht() {
        return this.getName()+ "  bellt...";
    }
}

class Pferd extends Tier{

    public Pferd(String name){
        super(name);
    }

    @Override
    public String spricht() {
        return this.getName()+ "  wiehert...";
    }
}




public class Main {

    public static void spricht(Tier tier){
        System.out.println(tier.spricht());
    }

    public static void main(String[]args){

        /*
        Tier tier1 = new Katze("Blau");
        Tier tier2 =  new Hund("Braun");
        Tier tier3 =  new Pferd("Stern");

        System.out.println(tier1.spricht());
        System.out.println(tier2.spricht());
        System.out.println(tier3.spricht());
        */
        



    }
    
}
