/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calisanlarprogrami;

import java.util.Scanner;

/**
 *
 * @author Serkan
 */
public class CalisanlarProgrami {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çalışanlar Programı Hoşgeldiniz.");
        System.out.println("*********************************");
        System.out.println("Yapabileceğiniz İşlemler");
        String islemler="1. Yazılımcı İşlemleri\n"+
                        "2. Yönetici İslemleri\n"+
                        "Programdan Çıkmak için q ya basınız.";
        System.out.println(islemler);
        while(true){
            System.out.print("Bir  işlem seçiniz: ");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
                
            }
            else if (islem.equals("1"))
            {
                Yazilimci yazılımcı=new Yazilimci("Serkan", "AYDIN", 0, "IT", "C,PHP,JAVA,C#,PYTHON", "Devoloper", "Market Otomasyon Sistemi, DonanımSeti Uygulaması ");
                  String yazılımcıİslemleri="1.Format At\n"+ 
                                            "2. Bilgileri Göster\n"+
                                            "Programdan çıkmak için q ya basın.";
                  System.out.println(yazılımcıİslemleri);
                  while(true){
                      System.out.print("Bir işlem Seçiniz: ");
                      String yazılımcıIslme=scanner.nextLine();
                      if(yazılımcıIslme.equals("q")){
                          System.out.println("Bu Bölümden Çıkılıyor...");
                          break;
                      }
                      else if(yazılımcıIslme.equals("1")){
                          yazılımcı.formatAt(islemler);
                      }
                      else if(yazılımcıIslme.equals("2")){
                          yazılımcı.bilgileriGöster();
                          
                      }
                      else{
                          System.out.println("Yazılımcı İşlemlerinde böyle bir işlem bulunamadı....");
                      }
                  }
            }
            else if(islem.equals("2")){
                Yönetici yönetici =new Yönetici("Serkan", "AYDIN", 12, "IT", 15);
                String yöneticiIslemleri="1. Bilgileri Göster \n"+
                                     "2. Zam Yap\n"+
                                     "Bu bölümden çıkmak için q ya basınız." ;
                System.out.println(yöneticiIslemleri);
                while(true){
                    System.out.print("Bir İşlem Seçiniz: ");
                    String yöneticiIslme=scanner.nextLine();
                    if(yöneticiIslme.equals("q")){
                        System.out.println("Bu bölümden çıkılıyor...");
                        break;
                    }
                    else if(yöneticiIslme.equals("1")){
                        yönetici.bilgileriGöster();
                    }
                    else if(yöneticiIslme.equals("2")){
                        System.out.print("Ne kadar zam istiyorsun.");
                        int zamMikrarı=scanner.nextInt();
                        scanner.nextLine();
                        yönetici.zamYap(zamMikrarı);
                    }
                    else {
                        System.out.println("Yönetici de böyle bir işlem bulunmamaktadır.");
                    }
                }
                yok yok yok diyemem
            }
            else{
                System.out.println("Hatalı bir işlem seçtiniz lütfen kontrol ediniz.");
            }
        }
    }
}
