package com.mycompany.basitatm;

import java.util.Scanner;

/**
 * follow instagram codingtekonologi
 *
 * @author Serkan
 */
public class BasitAtm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deger =scanner.nextInt();
        while(true)
        {
            if(deger==1)
            {
                System.out.println("Bakiye Öğrenme İşlemi Gerçekleştirdiniz");
                break;
            }
            else if (deger==2)
            {
               System.out.println("Para Çekme İşlemi Gerçekleştirdiniz");
                break;
            }
        }
    }
}
