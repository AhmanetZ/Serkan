
package com.mycompany.dogalgaz;

/**
 *
 * @author Serkan
 */
public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;
    
    public void dogalgazKullan(int miktar){
        if(bakiye-miktar<=0){
            System.out.println("Yeterli bakiye yok");
            
        }
        else{
            bakiye-=miktar;
            System.out.println("Kalan Doğalgaz bakiyesi: "+bakiye);
            if(bakiye<=0){
                System.out.println("Doğalgaz bitmiştir.Lütfen en yakın yükleme noktasına gidiniz");
            }
        }
            
    }
}
