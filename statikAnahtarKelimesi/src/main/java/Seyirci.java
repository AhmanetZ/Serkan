

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Seyirci {
    private String isim;
    public  static int seyirciSayısı=0;
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
        
    }

    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayısı++;
    }
    public void oyunSeyret(){
        
        System.out.println(isim+" Oyun seyrediyor.");
    }
}
