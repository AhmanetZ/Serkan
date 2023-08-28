
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Serkan
 */
public class Main {
    
    public static void main(String[] args) {
        
        try(Scanner scanner=new Scanner(new FileReader("ogrenciler.txt"))){
            
            
            while(scanner.hasNextLine()){
                String ögrenciBilgiler=scanner.nextLine();
                String [] array=ögrenciBilgiler.split(",");
                
                if(array[1].equals("Bilgisayar Mühendisliği"))
                        {
                            System.out.println("Öğrenci bilgiler: "+ögrenciBilgiler);
                        }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        }
        
    }
    
}
