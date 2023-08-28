
package com.mycompany.beybladeprpgrami;

/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int dönüşHızı, int saldırıGücü,String kutsalCanavar,String gizliYetenek) {
        super(beybladeci, dönüşHızı, saldırıGücü);
        this.gizliYetenek=gizliYetenek;
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void bilgileriGöster() {
        System.out.println("Kutsal Canavarın Adı: "+kutsalCanavar);
        System.out.println("Gizli Yeteneği: "+gizliYetenek);
        
    }

    @Override
    public void kusalCanavarOrtayaCıkıyor() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ı ortaya çıkarıyor");
        System.out.println(getBeybladeci()+" ın saldırısı:  "+"Hayalet Kasırga");
    }
    
}
