

/**
 * Instagram Code Teknologi
 * @author Serkan
 */
public class Ögrenci {
    private String isim;

    public Ögrenci(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
      return "Öğrenci: "+isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
