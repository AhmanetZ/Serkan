
package com.mycompany.bankacilikuygulamasi;

/**
 * İnstagram Coding Teknologi
 * @author Serkan
 */
public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String mail;
    private String telefonNo;
public Account(String hesapNo,double bakiye,String isim,String mail,String telefonNo){
    this.hesapNo=hesapNo;
    this.bakiye=bakiye;
    this.isim=isim;
    this.mail=mail;
    this.telefonNo=telefonNo;
}
    /**
     * @return the hesapNo
     */
    public void paraYatırma(double miktar){
        bakiye +=miktar;
        System.out.println("Güncel Bakiyeniz: "+bakiye);
    }
    public void paraCekme(double miktar){
        if(miktar>bakiye){
            System.out.println("Girmiş olduğunuz tutar bakiyenizden fazla");
        }
        else if(miktar>1500){
            System.out.println("Bir gün içerisinde en fazla 1500 tl çekebilirsiniz");
        }
        else{
            bakiye-=miktar;
            System.out.println("Güncel bakiyeniz: "+bakiye);
        }
    }
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
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

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
}
