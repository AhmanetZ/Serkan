
package com.mycompany.composition;

/**
 *
 * @author Serkan
 */
public class Aanakart {
    private String üretici;
    private String model;
    private String isletimSitemi;
    private int yuvaSayısı;

    public Aanakart(String üretici, String model, String isletimSitemi, int yuvaSayısı) {
        this.üretici = üretici;
        this.model = model;
        this.isletimSitemi = isletimSitemi;
        this.yuvaSayısı = yuvaSayısı;
    }
public void isletimSistemiYükle(String isletimSistemi){
    this.isletimSitemi=isletimSistemi;
    System.out.println("İşletim Sistemi Yüklendi: "+isletimSistemi);
}
    /**
     * @return the üretici
     */
    public String getÜretici() {
        return üretici;
    }

    /**
     * @param üretici the üretici to set
     */
    public void setÜretici(String üretici) {
        this.üretici = üretici;
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
     * @return the isletimSitemi
     */
    public String getIsletimSitemi() {
        return isletimSitemi;
    }

    /**
     * @param isletimSitemi the isletimSitemi to set
     */
    public void setIsletimSitemi(String isletimSitemi) {
        this.isletimSitemi = isletimSitemi;
    }

    /**
     * @return the yuvaSayısı
     */
    public int getYuvaSayısı() {
        return yuvaSayısı;
    }

    /**
     * @param yuvaSayısı the yuvaSayısı to set
     */
    public void setYuvaSayısı(int yuvaSayısı) {
        this.yuvaSayısı = yuvaSayısı;
    }
    
    
}
