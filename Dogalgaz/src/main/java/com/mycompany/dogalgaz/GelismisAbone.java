
package com.mycompany.dogalgaz;

/**
 *
 * @author Serkan
 */
public class GelismisAbone {
    private String isim;
    private int bakiye=120;
    private String sehir;

    public GelismisAbone(String isim, String sehir,int bakiye) {
        this.isim = isim;
        if(bakiye>=0 && bakiye<=120){
            this.bakiye=bakiye;
        }
        this.sehir = sehir;
    }
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
    
    public void bakiyeGöster(){
            System.out.println("Mevcut Bakiteniz: "+bakiye);
        }
            
    }

