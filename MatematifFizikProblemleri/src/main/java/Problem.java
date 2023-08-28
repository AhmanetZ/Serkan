
/**
 *Isntagram Code Tekonologi
 * @author Serkan
 */
public class Problem {
    public static class matematik{
        public static void daireAlanı(int yarıCap){
            System.out.println("Dairle Alanı: "+(Math.PI*yarıCap*yarıCap));
        }
        public static void ücgenAlanı(int kenar1,int kenar2,int kenar3){
            System.out.println("Üçgenin Alanı: "+(kenar1+kenar2+kenar3));
        }
    
}
    public static class fizik{
        public static void icCarpım(Vec vec1,Vec vec2){
            int icCarpım=vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
            System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" in iç çarpımı: "+icCarpım);
        }
        
    }
}
