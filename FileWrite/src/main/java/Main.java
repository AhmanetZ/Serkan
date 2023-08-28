
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Serkan
 */
public class Main {
    public static void main(String[] args) {
        
       try(FileWriter write =new FileWriter("diller.txt")){
         Scanner scanner=new Scanner(System.in);
         String dil;
         
         while(true){
             System.out.print("Lütfen bir programlama dili giriniz: ");
             dil=scanner.nextLine();
            
             if(dil.equals("-1"))
             {
                 System.out.println("Programdan çıkılıyor...");
                 System.out.println("Dosyayı kontrol ediniz.");
                 break ;             }
              write.write(dil+"\n");
             
         }
         
         
         
       } catch (IOException ex) {
           
           System.out.println("Dosya oluşurken IOException hatası oluştu.");
           
        }
        
        
    } 
}
