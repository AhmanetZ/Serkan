
package com.mycompany.composition;

/**
 * Instagram Code Teknologi
 * @author Serkan
 */
public class Main {
    public static void main(String[] args) {
        Resolution resolution=new Resolution(1920, 1080);
        Monitor monitor=new Monitor("Serial", "IBM", "19.2", resolution);
        Kasa kasa=new Kasa("srtln", "Gigabeyt", "FiberGlast");
        Aanakart aanakart=new Aanakart("Gigabayt", "A123bx", "Windows", 45);
        Bilgisayar bilgisayar=new Bilgisayar(monitor, kasa, aanakart);
         bilgisayar.getKasa().bilgisayarAc();
        
    }
    
}
