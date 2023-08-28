
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



/**
 *Instagram Code Telnologi
 * @author Serkan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner (System.in);
        System.out.print("Cümleyeyi giriniz: ");
        String cümle =scanner.nextLine();
        Map<Character,Integer>frekans=new TreeMap<Character,Integer>();
        
        for(int i=0;i<cümle.length();i++){
            char harf=cümle.charAt(i);
            
            if(frekans.containsKey(harf))
            {
                frekans.replace(harf, frekans.get(harf)+1);
                
            }
            else
            {
                    frekans.put(harf,1);
                    }
        }
        for(Map.Entry<Character,Integer> entry:frekans.entrySet()){
            System.out.println("Karakter : "+ entry.getKey()+" "+entry.getValue()+" kadar geçiyor...");
        }
        
        
    }
    
    
}
