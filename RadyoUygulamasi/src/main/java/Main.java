
import java.util.Iterator;


/**
 *
 * @author Serkan
 */
public class Main {
    public static void main(String[] args) {
        String [] kanallar={"Radyo Viva","Raydo Türk","Kahta Fm","Kral Pop"};
        
        Radyo radyo=new Radyo(kanallar);
        
        Iterator<String> iterator=radyo.iterator();
        
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    
}
