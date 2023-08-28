

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/**
 *
 * @author Serkan
 */
public class ObjeOkuma {
    public static void main(String[] args) {
        
        try(ObjectInputStream input =new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {
            
            Ögrenci [] list =(Ögrenci[])input.readObject();
            ArrayList<Ögrenci>ögrenciArray=(ArrayList<Ögrenci>)input.readObject();
            System.out.println("************************************");
            
            for(Ögrenci ö:list){
                System.out.println(ö);
                System.out.println("---------------------------------------------------");
            }
             System.out.println("************************************");
             
            
            for(Ögrenci l:ögrenciArray){
                System.out.println(l);
                System.out.println("---------------------------------------------------");
            }
                System.out.println("************************************");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException hatası oluştu.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sınıf bulunamadı.");
        }
        
    }
    
}
