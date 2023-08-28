/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition;

/**
 *
 * @author Serkan
 */
public class Monitor {
    private String model;
    private String üretici;
    private String boyut;
    private Resolution resolution;

    public Monitor(String model, String üretici, String boyut, Resolution resolution) {
        this.model = model;
        this.üretici = üretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
public void monitorKapat(){
    System.out.println("Monitör kapatılıyor....");
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
     * @return the boyut
     */
    public String getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
}
