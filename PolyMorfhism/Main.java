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

class Vogel extends Tier{

    public Vogel(String name){
        
        super(name);
    }

    @Override
    public String spricht() {
        
        return this.getName() + " singt.";
    }
    
     
}




public class Main {

    /*
    public static void sprichtlaesst(Tier tier){
        System.out.println(tier.spricht());
    }
    */

    public static void spricht (Object object){
        //  System.out.println(object.spricht);
        
        if (object instanceof Hund){
            Hund hund = (Hund) object;
            hund.spricht();
            System.out.println(hund.spricht());

        }else if (object instanceof Katze ){
            Katze katze = (Katze) object;
            katze.spricht();
            System.out.println(katze.spricht());


        }else if (object instanceof Pferd){
            Pferd pferd = (Pferd) object;
            pferd.spricht();
            System.out.println(pferd.spricht());

        }else if (object instanceof Tier){
            Tier tier = (Tier) object;
            tier.spricht();
            System.out.println(tier.spricht());
        
        }else if (object instanceof Vogel){
            Vogel vogel = (Vogel) object;
            vogel.spricht();
            System.out.println(vogel.spricht());
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

        /*
        sprichtlaesst(new Katze("Hellblau"));
        sprichtlaesst(new Hund("Hellbraun"));
        sprichtlaesst(new Pferd("HellPferd"));
        */


        // instanceof
        /*
        Hund hund = new Hund("Lessi");

        if ( hund instanceof Hund){
            System.out.println("Dies Objekt ist von der Classe des Hundes");
        }

        if (hund instanceof Tier){
            System.out.println("Dies Objekt ist von der Classe des Tieres");
        }

        // FALSCH - 
        //if (hund instance Katze){
        //
        //}
        */

        Hund hund = new Hund("Lessi");
        Katze katze = new Katze("Hellblau");
        Pferd pferd = new Pferd("Hellpferd");
        Tier tier =  new Tier("Weiss");
        Vogel vogel new Vogel("Goldenssegel");
        spricht(hund);
        spricht(katze);
        spricht(pferd);
        spricht(tier);
        spricht(vogel);





    }
    
}
