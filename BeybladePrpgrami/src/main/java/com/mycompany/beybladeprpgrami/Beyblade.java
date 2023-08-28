
package com.mycompany.beybladeprpgrami;

/**
 * Instagram Code Teknologi
 * @author Serkan
 */
public class Beyblade {
    private String beybladeci;
    private int dönüşHızı;
    private int saldırıGücü;

    public Beyblade(String beybladeci, int dönüşHızı, int saldırıGücü) {
        this.beybladeci = beybladeci;
        this.dönüşHızı = dönüşHızı;
        this.saldırıGücü = saldırıGücü;
    }

    /**
     * @return the beybladeci
     */
    public String getBeybladeci() {
        return beybladeci;
    }

    /**
     * @param beybladeci the beybladeci to set
     */
    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    /**
     * @return the dönüşHızı
     */
    public int getDönüşHızı() {
        return dönüşHızı;
    }

    /**
     * @param dönüşHızı the dönüşHızı to set
     */
    public void setDönüşHızı(int dönüşHızı) {
        this.dönüşHızı = dönüşHızı;
    }

    /**
     * @return the saldırıGücü
     */
    public int getSaldırıGücü() {
        return saldırıGücü;
    }

    /**
     * @param saldırıGücü the saldırıGücü to set
     */
    public void setSaldırıGücü(int saldırıGücü) {
        this.saldırıGücü = saldırıGücü;
    }
    public void Saldırı(){
        System.out.println(getBeybladeci()+" " + saldırıGücü+ " ve " + dönüşHızı+" "+"ile saldırıyoru..." );
    }
    public void kusalCanavarOrtayaCıkıyor(){
        System.out.println("Bu  beybladenin kutsal canavarı bulunmuyor...");
    }
    public void bilgileriGöster(){
        System.out.println("Beybladecinin İsmi: "+beybladeci);
        System.out.println("Sladırı Gücü: "+saldırıGücü);
        System.out.println("Dönüş Hızı: "+dönüşHızı);
    }
}
