package com.mycompany.vizefinalnotuhesaplama;

import java.util.Scanner;

/**
 *
 * @author Serkan
 */
public class VizeFinalNotuHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci vize notunuzu giriniz");
        double vize1=scanner.nextDouble();
         System.out.println("İkinci vize notunuzu giriniz");
        double vize2=scanner.nextDouble();
         System.out.println("Final vize notunuzu giriniz");
        double fınal=scanner.nextDouble();
        double not=((vize1%30)+(vize2%30)+(fınal%40));
        System.out.println("sonuç: "+not);

    }
}
