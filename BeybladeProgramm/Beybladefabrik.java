package BeybladeProgramm;

public class Beybladefabrik {

    public Beyblade beyblademacht(String artBeyblade){

        if (artBeyblade.equals("Dragon")){
            return new Dragon("Takao", 800, 300, "blauer Drache", "Das Gespräch mit der heiligen Bestie");
        }
        else if(artBeyblade.equals("Dranza")){
            return new Dranza("Kai", 600, 400, "Roter Phonix");

        }
        else if(artBeyblade.equals("Drayga")){
            return new Drayga("Rei",800, 1000,  "Weisser Tiger");
        
        }
        else if(artBeyblade.equals("Draciel")){
            return new Draciel("Max",400, 1000,  "Schwarze Schildkröte ");
        }
        return null;
        

    }
    
}
