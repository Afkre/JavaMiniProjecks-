package Notfalldienst;

public class Patient implements Comparable<Patient>{

    private String name;
    private String beschwerde;

    private int prioritaet;

    public Patient(String name, String beschwerde){
        this.name = name;
        this.beschwerde = beschwerde;
        
        if (beschwerde.equals("Blinddarmentzündung")){
            this.prioritaet = 3;
            
        }else if (beschwerde.equals("Verbrennung")){
            this.prioritaet = 2;

        }else {
            this.prioritaet = 1;
        }
    }

    @Override
    public String toString() {

        String informationen =  " Name : " + name
                            + "\nBeschwerde : " + beschwerde 
                            +"\nPriority : " + prioritaet;
                            
       return informationen;
       
    }

    @Override
    public int compareTo(Patient patient) {

        if (this.prioritaet > patient.prioritaet) {
            
            return -1;
            
        }
        else if (this.prioritaet < patient.prioritaet) {
            return 1;
        }
        else {
            return 0;
        }

    }




    
}
