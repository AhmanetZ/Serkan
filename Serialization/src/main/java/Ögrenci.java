
import java.io.Serializable;

public class Ögrenci implements Serializable {
   
    private String isim;
    private int id;
    private String bolum;

    public Ögrenci(String isim, int id, String bolum) {
        super();
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String ögrenciBilgileri = "Öğrenci Adı: " + isim
                + "\nÖğrenci Numarası: " + id
                + "\n Öğrenci Bölümü: " + bolum;
        return ögrenciBilgileri;
    }

}
