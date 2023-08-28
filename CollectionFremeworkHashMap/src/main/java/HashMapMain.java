
import java.util.HashMap;


/**
 *
 * @author Serkan
 */
public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(10, "Serkan");//Liste eleman ekleme
        map.put(20, "Serkan");
        map.put(50, "Fatma");
        System.out.println(map);//listi ekrana yazdırma
        System.out.println(map.get(10));//listedeki elemanı bulma
        
    }
    
}
