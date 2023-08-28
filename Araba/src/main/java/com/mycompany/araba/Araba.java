

package com.mycompany.araba;

/**
 * İnstagram Coding Teknologi
 * @author Serkan
 */
public class Araba {
private int üretimYılı;
private String model;
private String yakıtTürü;
private int kapıSayısı;
private String renk;

    /**
     * @return the üretimYılı
     */
    public int getÜretimYılı() {
        return üretimYılı;
    }

    /**
     * @param üretimYılı the üretimYılı to set
     */
    public void setÜretimYılı(int üretimYılı) {
        this.üretimYılı = üretimYılı;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the yakıtTürü
     */
    public String getYakıtTürü() {
        
        return yakıtTürü;
    }

    /**
     * @param yakıtTürü the yakıtTürü to set
     */
    public void setYakıtTürü(String yakıtTürü) {
        if (yakıtTürü=="Benzin"||yakıtTürü=="LPG"||yakıtTürü=="Motorin")
        {
        this.yakıtTürü = yakıtTürü;}
        else {
            System.out.println("Lütfen geçerli bir parametre giriniz.");
        }
    }

    /**
     * @return the kapıSayısı
     */
    public int getKapıSayısı() {
        return kapıSayısı;
    }

    /**
     * @param kapıSayısı the kapıSayısı to set
     */
    public void setKapıSayısı(int kapıSayısı) {
        if(kapıSayısı<0)
        {
            System.out.println("Kapı sayısı negatif bir değer alamaz");
        } else {
             this.kapıSayısı = kapıSayısı;
    }
       
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }


}
