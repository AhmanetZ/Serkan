/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.kullanicigirisi;

import java.util.Scanner;

/**
 *
 * @author Serkan
 */
public class KullaniciGirisi {

    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        String kullaniciAdi = "Serkan";
        String sifre = "12345";
        while(true)
        {
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
            String kadi=scanner.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            String parola=scanner.nextLine();
            if(kadi.equals(kullaniciAdi)&&parola.equals(sifre)){
                System.out.println("Başarı bir Şekilde Sistme giriş yaptınız");
                break;
            }
            else
            {
                System.out.println("Lütfen Bilgilerinizi Kontrol Ediniz.");
            }
        }
    }
}
