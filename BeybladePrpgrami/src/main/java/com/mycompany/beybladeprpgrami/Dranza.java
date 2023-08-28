
package com.mycompany.beybladeprpgrami;

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Dranza extends Beyblade{
    private String kutsalCanavar;

    public Dranza(String beybladeci, int dönüşHızı, int saldırıGücü,String kutsalCanavar) {
        super(beybladeci, dönüşHızı, saldırıGücü);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster(); 
        System.out.println("Kutsal Canavar Adı: "+kutsalCanavar);
    }

    @Override
    public void kusalCanavarOrtayaCıkıyor() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ı ortaya çıkarıyor");
        System.out.println(getBeybladeci()+" ın saldırısı:  "+"Alev Kılıcı");
    }
    
}
