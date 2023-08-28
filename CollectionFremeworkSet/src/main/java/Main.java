
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author Serkan
 */
public class Main {
    public static void main(String[] args) {
        
        
        Set<String> set1=new LinkedHashSet<String>();
        Set<String> set2=new HashSet<String>();
        Set<String> set3=new TreeSet<String>();
        //LinkedHasdSet
        set1.add("Java");
        set1.add("PHP");
        set1.add("Python");
        set1.add("Javascript");
        set1.add("C#");
        
        //HashSet 
        set2.add("Java");
        set2.add("PHP");
        set2.add("Python");
        set2.add("Javascript");
        set2.add("C#");
        
        //TreeSet
        set3.add("Java");
        set3.add("PHP");
        set3.add("Python");
        set3.add("Javascript");
        set3.add("C#");
        
        System.out.println(set1.contains("Go"));//Bir listin içinde bir elementin olup olmadığını kontrol eder
        System.out.println(set1.isEmpty());//Listin içinin boş olup olmadığını kontrol eder
                
        System.out.println("LinkedHashSet********************************");
        for(String s:set1)
        {
            System.out.println(s);
        }
         System.out.println("HashSet********************************");
        for(String s:set2)
        {
            System.out.println(s);
        }
         System.out.println("TreeSet********************************");
        for(String s:set3)
        {
            System.out.println(s);
        }
        
    }
}
