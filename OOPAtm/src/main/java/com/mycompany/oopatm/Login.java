
package com.mycompany.oopatm;

import java.util.Scanner;

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Login {
    public boolean login(Hesap hesap){
        Scanner scanner =new Scanner(System.in);
        String kullanıcıAdı;
        String parola;
        System.out.print("Lütfen Kullamnıcı Adınızı Giriniz: ");
        kullanıcıAdı=scanner.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        parola=scanner.nextLine();
        if(hesap.getKullanıcıAdı().equals(kullanıcıAdı)&& hesap.getParola().equals(parola))
        {
            return true;
        }
        else {
            System.out.println("Girilen Bilgiler Yanlış.");
            return false;
        }
    }
    
}
