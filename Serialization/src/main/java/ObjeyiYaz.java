
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {

    public static void main(String[] args) {
        Ögrenci ögrenci1 = new Ögrenci("Serkan", 123, "Bilişim Teknolojileri ve Yazılım Öğretmeni");
        Ögrenci ögrenci2 = new Ögrenci("Fatma(Bebeğim)", 213, "Bilişim Teknolojileri ve Yazılım Öğretmeni");
        Ögrenci ögrenci3= new Ögrenci("Hüma", 254, "Bilgisayar Mühendisi");
        Ögrenci ögrenci4= new Ögrenci("Deniz", 583, "Bilgisayar Mühendisi");
        Ögrenci ögrenci5= new Ögrenci("Meryem", 185, "Mimar");
        Ögrenci ögrenci6 = new Ögrenci("Kaan", 217, "İngilizce Öğretmeni");
        Ögrenci ögrenci7 = new Ögrenci("Ferhat", 189, "Resim Öğretmeni");
        Ögrenci ögrenci8 = new Ögrenci("Aydın", 879, "Matematik Öğretmeni");
        Ögrenci ögrenci9 = new Ögrenci("Adil", 502, "Müzik Öğretmeni");
        
        Ögrenci[] ögrenciArray={ögrenci1, ögrenci2,ögrenci3,ögrenci4,ögrenci5,ögrenci6,ögrenci7 ,ögrenci8 ,ögrenci9 };
        ArrayList<Ögrenci> list=new ArrayList<Ögrenci>(Arrays.asList(ögrenciArray));
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {
            
            
            out.writeObject(ögrenciArray);
            out.writeObject(list);
 

        } catch (FileNotFoundException e) {
            System.out.println("Dosya oluşurken hata oluştu.");

        } catch (IOException e) {
            System.out.println("Beklenmedik bir hata oluştu.");
        }

    }
}
