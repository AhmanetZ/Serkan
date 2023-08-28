
package com.mycompany.beybladeprpgrami;

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class BeybladeFabrikası {
    public Beyblade beybladeÜret(String beybladeTürü){
        if(beybladeTürü.equals("Dragon")){
           return new Dragon("Taco", 800, 300, "Mavi Ejderha", "Konuşma");
        }
        else{
        return null;
        }
}
}
