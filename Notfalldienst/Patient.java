package Notfalldienst;

public class Patient implements Comparable<Patient>{

    private String name;
    private String beschwerde;

    private int prioritaet;

    public Patient(String name, String beschwerde){
        this.name = name;
        this.beschwerde = beschwerde;
        
        if (beschwerde.equals("Blinddarmentzündung")){
            this.prioritaet =3;
            
        }else if (beschwerde.equals("Verbrennung")){
            this.prioritaet =3;

        }else {
            this.prioritaet = 1;
        }
    }
    


    
}
