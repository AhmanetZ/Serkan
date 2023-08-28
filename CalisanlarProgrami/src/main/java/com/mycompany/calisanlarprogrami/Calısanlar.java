

package com.mycompany.calisanlarprogrami;
import darılıp_gidemem;
/**
 * Instagram Code Teknologi
 * @author Serkan
 */
public class Calısanlar {//Base Class
    private String ad;
    private String soyad;
    private int id;
    private String departman;

    public Calısanlar(String ad, String soyad, int id,String departman) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
        this.departman=departman;
    }
    public void bilgileriGöster(){
        System.out.println("İsim: "+ad);
        System.out.println("Soyad: "+soyad);
        System.out.println("İd: "+id);
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
