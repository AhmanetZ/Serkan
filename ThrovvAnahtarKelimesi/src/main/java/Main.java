
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Serkan
 */
public class Main {
    public static void mekanKontrol(int age) throws IOException{
        
        if(age<18){
            throw new IOException();
        }
        else
        {
            System.out.println("welcome to the place...");
        }
        
    }
    public static void main(String[] args) throws IOException {
        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age=scanner.nextInt();
        
      
         
                mekanKontrol(age);
           
        }
        
        
    }
    

