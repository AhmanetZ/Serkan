
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Serkan
 */
public class Main {
    
    public static void main(String[] args) {
        
        FileInputStream input=null;
        
        try {
            input =new FileInputStream("Dosya.txt");
            
            /*System.out.println("Dosyadan okunan karakter: "+(char)(input.read()));
            
            input.skip(5);//okumak istediğimiz dosyada nerden başlaması gerejtiğini betirtiyoruz.
            
            System.out.println("Dosyadan okunan karakter: "+(char)(input.read()));*/
            
            int deger;
            String s="";
            
            while((deger=input.read())!=-1)
            {
                s+=(char) deger;
            }
            System.out.println("Dosya içeriği: "+s);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
           System.out.println("Dosya okunurken hata oluştu...");
        }
        finally
        {
            try {
                
                if(input!=null)
                {
                input.close();}
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
