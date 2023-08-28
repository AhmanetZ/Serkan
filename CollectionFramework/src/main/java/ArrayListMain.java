
import java.util.ArrayList;



/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        
        arrayList.add("Java");//ArrayListe Eleman eklemek için kullanılır
        arrayList.add("C#");
        arrayList.add("PYTHON"); 
        
        for(String s:arrayList){
            System.out.println(s);
        }
        
        System.out.println(arrayList.get(0));//Arraylist içinde istediğimiz elemana ulaşmak için klullanılır.
        
    }
    
}
