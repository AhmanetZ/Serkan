
package com.mycompany.calisanlarprogrami;

/**
 *
 * @author Serkan
 */
public class Yazilimci extends Calısanlar{
    private String diller;
    private String projeler;
    private String unvan;
    
    public Yazilimci(String ad, String soyad, int id,String departman,String diller,String unvan,String projeler) {
        super(ad, soyad, id,departman);
        this.diller=diller;
        this.projeler=projeler;
        this.unvan=unvan;
    
    }  public void formatAt(String isletimSistemi){
            System.out.println(getAd()+" "+isletimSistemi+"in yüklüyor..." );
        }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Programcının Bildiği diller:" +diller);
        System.out.println("Programcının Yapmış Olduğu Projeler: "+projeler);
        System.out.println("Unvan: "+unvan);
    }
    
    
    
}
