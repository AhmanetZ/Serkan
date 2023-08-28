
/**
 *
 * @author Serkan
 */
public class KapsamSınıfı2 {

    private int privateDegisken = 30;

    public KapsamSınıfı2() {
        System.out.println("Private Değişken: " + privateDegisken);
    }

    public class DahiliSinif {
 private int privateDegisken=20;
        public void onliCarp() {
           
            for (int i = 1; i < 10; i++) {
                int privateDeğişken = 10;
                System.out.println(i +" * "+privateDeğişken+" = "+(i*privateDeğişken));
            }

        }
    }

}
