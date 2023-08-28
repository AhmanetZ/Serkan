
import java.util.Scanner;



/**
 *Instagram Code Tenologi
 * @author Serkan
 */
public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;

   
    
    public Vec(String isim){
        this.isim=isim;
        Scanner scanner =new Scanner(System.in);
        System.out.println(isim+"Vektörleri giriniz: ");
        System.out.print("Lütfen i değerini giriniz: ");
        this.i=scanner.nextInt();
        System.out.print("Lütfen j değerini giriniz: ");
        this.j=scanner.nextInt();
        System.out.print ("Lütfen k değerini giriniz: ");
        this.k=scanner.nextInt();
    }    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
