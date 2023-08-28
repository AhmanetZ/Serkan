
import java.util.Scanner;



/**
 *Instagram Code Tekonologi
 * @author Serkan
 */
public class Matematik {
    private double pi=Math.PI;
    
    public class faktörüyel{
        
        public  void faktöriyel(){
        Scanner scanner=new Scanner(System.in);
            System.out.print("Lütfen bir sayı giriniz: ");
            int sayi=scanner.nextInt();
            int fakt=1;
            
            for(int i=2;i<=sayi;i++){
                fakt*=i;
            }
            System.out.println("Faktöriyer: "+fakt);
    }
        
    }
    public class asal{
        public boolean asalMı(int sayi){
            int i=2;
            
            while(i<sayi){
                if(sayi%i==0)
                {
                    return false;
                }i++;
                
                        
            }
            return true;
        }
    }
    public class Alan{
        public void daireAlanı(int yarıÇap){
            
            System.out.println("Dairenin Alanı: "+(yarıÇap*yarıÇap*pi));
        }
    }
    
}
