
package com.mycompany.beybladeprpgrami;

import java.util.Scanner;

/**
 *
 * @author Serkan
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldinz.");
        System.out.println("Programdan çıkmak için q ya basın");
        System.out.println("***********************************");
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("Hangi beyblade türünü üretmek istiyorsunuz?");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Program kapatılıyor...");
                break;
            }
            else{
                BeybladeFabrikası fabrika=new BeybladeFabrikası();
                Beyblade beyblade=fabrika.beybladeÜret(islem);
                if(beyblade==null)
                {
                    System.out.println("Lütfen Geçerli Bir Beyblade İsmi Giriniz.");
                }
                else
                {
                   beyblade.bilgileriGöster();
                   beyblade.Saldırı();
                   beyblade.kusalCanavarOrtayaCıkıyor();
                }
            }
        }
    }
    
}
