
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Serkan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Queue<String> queu=new LinkedList<String>();
        
        queu.offer("Java");//Eleman ekleme
        queu.offer("Python");
        
        System.out.println(queu.peek());//kuyruğun en başısndaki elemanı göstermek için kullanılır.
        
        System.out.println("Eleman kuyruktan çıkarılıyor: "+queu.poll());//kuyruğun başındaki elemanı kuyruktan çıkarıyor.
    
        System.out.println(queu.isEmpty());//Kuyruğun içinin boş olup olmadığını kontrol eder
      
    }
    
}
