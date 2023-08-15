
package com.mycompany.oopatm;

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Hesap {
    private String kullanıcıAdı; 
    private String parola;
    private double bakiye;
    public Hesap(String kullanıcıAdı,String parola, double bakiye){
    this.kullanıcıAdı=kullanıcıAdı;
    this.parola=parola;
    this.bakiye=bakiye;
    
}

    /**
     * @return the kullanıcıAdı
     */
    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    /**
     * @param kullanıcıAdı the kullanıcıAdı to set
     */
    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatırma(double  tutar){
        if(tutar<0){
            System.out.println("Negatif bir tutar yatıramazsınız.");
        }
        else
        bakiye+=tutar;
        System.out.println("Güncel Bakiyeniz: "+bakiye);
    }
    public void paraCekme(double tutar){
        if(tutar>bakiye){
            System.out.println("Girmiş olduğnuz tutar bakiyenizden büyük.Bakiyeniz: "+bakiye);
        }
        else{
            bakiye-=tutar;
            System.out.println("Kslan Bakiyeniz: "+bakiye);
        }
    }
}
