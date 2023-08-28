package com.mycompany.enbuyuksayiyibulma;

import java.util.Scanner;

/**
 *
 * @Coding for İnstagram
 */
public class EnbuyukSayiyiBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number1=scanner.nextInt();
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number2=scanner.nextInt();
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number3=scanner.nextInt();
        if(number1>number2 &&number1>number3){
            System.out.print("En Büyük Sayı: "+number1);
        }
        else if (number2>number1 && number2>number3)
        {
            System.out.print("En Büyük Sayı: "+number2);
        }
        else if (number3>number1 && number3>number2)
        {
            System.out.print("En Büyük Sayı: "+number3);
        }
        else
        {
            System.out.print("Hatalı bir işlem gerçekleşti");
        }
    }
}
