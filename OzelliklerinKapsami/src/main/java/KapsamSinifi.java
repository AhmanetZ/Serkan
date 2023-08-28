
/**
 *
 * @author Serkan
 */
public class KapsamSinifi {
    private int privateSDegisken=30;

    public KapsamSinifi() {
        System.out.println("PrivateDeğişken ="+privateSDegisken);
    }
    public void onileÇarp(){
        int privateDegisken=10;
        
        for(int i=0;i<6;i++)
        {
            System.out.println(i+" * "+privateDegisken+" = "+(i*privateDegisken));
        }
    }
    
}
