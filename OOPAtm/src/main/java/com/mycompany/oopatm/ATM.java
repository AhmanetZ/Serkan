
package com.mycompany.oopatm;

import java.util.Scanner;

/**
 *
 * @author Serkan
 */
public class ATM {
    public void calıs(Hesap hesap){
        Login login=new Login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("************************");
        System.out.println("Kullanıcı Girişi...");
        System.out.println("************************");
        int girisHakkı=3;
      while(true){
          if(login.login(hesap)){
              System.out.println("Giriş Başarılı...");
              break;
          }
          else{
              System.out.println("Hatalı Giriş Yaptınız.Lütfen Bilgilerinizi Kontrol Ediniz...");
              girisHakkı--;
              System.out.println("Kalan Giriş Hatkınız: "+girisHakkı);
          }
          if(girisHakkı==0){
              System.out.println("Giriş Hakkınız Bitmiştir...");
              return;
          }
      }
      String islemler="1. Bakiye Sorgulama\n"+"2. Para Çekme\n"+"3. Para Yatırma\n"+"q. Programdan Çıkılıyor";
      System.out.println(islemler);
      System.out.println("*******************************");
      while(true)
      {
          System.out.println("Bir işlem seçiniz");
          String islem=scanner.nextLine();
          if(islem.equals("q")){
              break;
          }
          else if(islem.equals("1")){
              System.out.println("Güncel Bakiyeniz: "+hesap.getBakiye());
          }
          else if(islem.equals("2")){
             System.out.print("Çekmek istediğiniz Tutarı Giriniz: ");
             double tutar=scanner.nextDouble();
             hesap.paraCekme(tutar);
          }
          else if(islem.equals("3")){
              System.out.print("Yatırmak İstediğiniz Turarı Giriniz: ");
              double tutar=scanner.nextDouble();
              hesap.paraYatırma(tutar);
          }
          else
          {
              System.out.println("Geçersiz işlem Gerçekleşti...");
          }
      }
    }
    
}
