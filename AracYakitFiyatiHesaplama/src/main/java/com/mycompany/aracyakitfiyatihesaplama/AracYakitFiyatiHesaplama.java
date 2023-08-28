

package com.mycompany.aracyakitfiyatihesaplama;

import java.util.Scanner;


public class AracYakitFiyatiHesaplama {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Araçnız Kilometrede kaç kuruş yakıyor?");
        double fiyat=scanner.nextDouble();
        System.out.print("Aracınız kaç kilometre yaptı?");
        double km=scanner.nextDouble();
        double tutar=fiyat*km;
        System.out.println("Ödemeniz gereken toplam ücret: "+tutar);
    }
}
