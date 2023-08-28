
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;



/**
 *
 * @author Serkan
 */
public class Diller {
    public static void bilgileriGöster(LinkedList<String>navigasyon)
    {
        ListIterator<String> listeyiGöster=navigasyon.listIterator();
        while(listeyiGöster.hasNext()){
            System.out.println(listeyiGöster.next());
        }
        
    }
    public static void main(String[] args) {
        LinkedList<String> navigasyon=new LinkedList<String>();
        navigasyon.add("Postane");
        navigasyon.add("Hastane");
        navigasyon.add("Kütüphane");
        navigasyon.add("Okul");
        navigasyon.add("Ev");
        navigasyon.add("Park");
        navigasyon.add("Spor Salonu");
        navigasyon.add("Market");
        bilgileriGöster(navigasyon);
    }
    
}
 