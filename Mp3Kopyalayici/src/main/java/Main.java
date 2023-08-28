
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static ArrayList<Integer> icerik=new ArrayList<>();
    public static void okuma(){
        
        try {
            FileInputStream in=new FileInputStream("deneme.mp3");
             
            int deger;
            try {
                while ((deger=in.read())!=-1){
                    
                    icerik.add(deger);
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void kopyalama(String dosyaİsmi){
        
        try {
            FileOutputStream file=new FileOutputStream(dosyaİsmi);
            
            for(int deger:icerik){
                out.write(deger);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void main(String[] args) {
        
        okuma();
        
        kopyalama("deneme3.mp3");
        
        
    }
    
}
