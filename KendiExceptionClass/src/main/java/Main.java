
import java.util.Scanner;


/**
 *
 * @author Serkan
 */
public class Main {
    public static void mekanKontrol(int age){
        
        if(age<18)
        {
            throw new InvalidAgeException("İnvalid age");
        }
        else
        {
            System.out.println("Mekana hoş geldiniz.....");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Lütfen Yaşınızı Giriniz:");
        int age=scanner.nextInt();
        try{
        mekanKontrol(age);
        }
        catch (InvalidAgeException e)
        {
            e.printStackTrace();
        }
    }
    
}
