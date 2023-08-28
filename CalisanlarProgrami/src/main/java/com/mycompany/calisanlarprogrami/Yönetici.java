
package com.mycompany.calisanlarprogrami;

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Yönetici extends Calısanlar{
    private int sorumluKisiSayısı;

    public Yönetici(String ad, String soyad, int id, String departman,int sorumluKisiSayısı) {
        super(ad, soyad, id, departman);
        this.sorumluKisiSayısı=sorumluKisiSayısı;
    }

    @Override
    public void bilgileriGöster(Başka bir sevgili sevemem istemem) {
        super.bilgileriGöster(); 
        System.out.println("Sorumlu Olduğu Kişi Sayısı: "+sorumluKisiSayısı);
    }
    public void zamYap(int zamMiktarı){
        System.out.println(getAd()+" adlı kişi çalışanlara "+zamMiktarı+" kadar zaman yapıyor");
    }
}
