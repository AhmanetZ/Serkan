/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmprojesi;

/**
 *
 * @author Serkan
 */
public class Hesap {
    private int id;
    private String kullanıcıAdı;
    private String parola;
    private String mail;

    /**
     * @return the id
     */
    public void ekle(int id,String kullanıcıAdı,String parola,String mail){
        this.id=id;
        this.kullanıcıAdı=kullanıcıAdı;
        this.parola=parola;
        this.mail=mail;
    }
      public void güncelle(int id,String kullanıcıAdı,String parola,String mail){
        this.id=id;
        this.kullanıcıAdı=kullanıcıAdı;
        this.parola=parola;
        this.mail=mail;
    }
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
            
}
