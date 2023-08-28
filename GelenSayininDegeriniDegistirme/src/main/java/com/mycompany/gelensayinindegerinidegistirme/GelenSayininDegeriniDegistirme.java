
package com.mycompany.gelensayinindegerinidegistirme;

import java.util.Scanner;

public class GelenSayininDegeriniDegistirme {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz");
        int sayi1=scanner.nextInt();
        System.out.print("Lütfen Bir Sayı Giriniz");
        int sayi2=scanner.nextInt();
        int sayi3 ;
        sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;
         System.out.print("Girilen ilk sayı: "+sayi1);
         System.out.print("Girilen ikinci sayı: "+sayi2);
        
    }
}
