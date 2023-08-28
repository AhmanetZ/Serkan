
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
        
        Matematik.faktörüyel faktöriyel=new Matematik().new faktörüyel();
        Matematik.Alan alan=new Matematik().new Alan();
        Matematik.asal asal=new Matematik().new asal();
        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scanner.nextInt();
        faktöriyel.faktöriyel();
        alan.daireAlanı(sayi);
        if(asal.asalMı(sayi))
        {
            System.out.println("Bu bir asal sayı");
        }
        else{
            System.out.println("Bu sayı asal değil.");
        }
        
    }
}
