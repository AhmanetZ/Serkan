package com.mycompany.vucutkitleendekasihesaplama;

import java.util.Scanner;

/**
 * @Follow İnstagram Codin Teknologi
 * @author Serkan
 */
public class VucutKitleEndekasiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu giriniz: (Örnek=1.65)");
        double boy=scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu giriniz");
        double kilo=scanner.nextDouble();
        double vki=kilo/(boy*boy);
        if(vki<18.5)
        {
            System.out.println(vki+"Zayıfsınız " +"Tavsiye: Biraz Kilo Alabilirsiniz");
            
        }
        else if (18.5<=vki && vki<=25)  
        {
            System.out.println(vki+"Normal Kilodasınız"+ "Sağlıklı Günler Dileriz");
        }
        else if (25<vki && vki<=30)
        {
            System.out.println(vki+"Çok Kilolu "+"Tavsiye: Sağlıklı bir şekilde kilo vermeniz gerekmektedir.");
        }
        else if (vki>30)
        {
            System.out.print(vki+"Obez statüsündesiniz "+" Doktor eşliğinde bir zayıflama diyetine girmeniz gerekmektedir");
        }
        else
        {
            System.out.println("Hatalı bir işlem gerçekleşti");
        }

    }
}
