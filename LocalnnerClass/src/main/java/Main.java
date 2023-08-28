

/**
 *
 * @author Serkan
 */
public class Main {
    public static void main(String[] args) {
        
        
         class Alan{
              public void daireAlan(int yarıCap){
                  System.out.println("Dairenin Alanı: "+(yarıCap*yarıCap*Math.PI));
              }
         }
    
         Alan alan =new Alan();
         alan.daireAlan(4);
    }
    
}
