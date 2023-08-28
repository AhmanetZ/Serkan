package com.mycompany.beybladeprpgrami;

/**
 * Instagram Cade Tekonologi
 *
 * @author Serkan
 */
public class Drayga extends Beyblade {

    private String kutsalCanavar;

    public Drayga(String beybladeci, int dönüşHızı, int saldırıGücü, String kutsalCanavar) {
        super(beybladeci, dönüşHızı, saldırıGücü);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Kutsal Canavar Adı: " + kutsalCanavar);
    }

    @Override
    public void kusalCanavarOrtayaCıkıyor() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + " ın saldırısı:  " + "Kaplan Pençesi");
    }

}
