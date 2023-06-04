import java.util.ArrayList;
public class Singer{
    private ArrayList<String> singerList = new ArrayList<String>();
    
    public void singerListDruck() {
        
        System.out.println("Auf cer Liste der Sängerinnen und Sänger stehen " + singerList.size() + " Personen");
        
        for (int i = 0; i < singerList.size();i++) {
            
            System.out.println((i+1) + ".Singer :" + singerList.get(i));
            
        }
    }


    public void singerAdd(String name) {
        singerList.add(name);
        
        System.out.println("Aktualisierte Liste der Sänger...");
    }
    public void singerAktuallisieren(String neuName,int position) {
        
        singerList.set(position, neuName);
        
        System.out.println("Aktualisierte Liste der Sänger...");
    }
    
    public void singerLoesch(int position) {
        
        String name = singerList.get(position);
        
        singerList.remove(position);
        
        System.out.println(name + " der Name des Sängers wurde aus der Liste gestrichen...");
       
    }
    public void singerSuch(String singerName) {
        
        int position = singerList.indexOf(singerName);
        
        if (position >= 0) {
            System.out.println("Singer ist gefunden...");
            System.out.println(singerName + " der Name des Sängers ist auf der Position " + (position+1) + ".");
            
        }
        else {
            System.out.println("Singer ist nicht gefunden...");

        }
    }


}
