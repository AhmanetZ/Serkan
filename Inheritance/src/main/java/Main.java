
/**
 *ınstagram Code Teknologi
 * @author Serkan
 */
public class Main {
    public static void main(String[] args) {
        String[]tecrübe={"Google","IBM","Apple","Windows"};
        PcMühendis pcMühendis=new PcMühendis(true, false);
        pcMühendis.adliSicilBelgesi();
        pcMühendis.askerliDurumBelgesi();
        System.out.println( pcMühendis.mezuniyetOrtalaması(80.0));
        
        pcMühendis.isTecrübesi(tecrübe);
        System.out.println("************************************");
        String[] makineTecrübe={};
        MakineMühendisi makineMühendisi=new MakineMühendisi(true,false);
        makineMühendisi.adliSicilBelgesi();
        makineMühendisi.askerliDurumBelgesi();
        System.out.println(makineMühendisi.mezuniyetOrtalaması(82.5));
        makineMühendisi.isTecrübesi(makineTecrübe);
        makineMühendisi.calis();
                
    }
}
