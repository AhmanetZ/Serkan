

/**
 *
 * @author Serkan
 */
public class PcMühendis implements IMühendis{

    private boolean askerlik;
    private boolean adliSicil;

    public PcMühendis(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
    @Override
    public void askerliDurumBelgesi() {
        if(askerlik){
            System.out.println("Askerliğimi yaptım.");
            
        }
        else
        {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyetOrtalaması(double ortalama) {
        return  "Ortalamam: "+ortalama;
    }

    @Override
    public void adliSicilBelgesi() {
        if(adliSicil){
            System.out.println("Adli Sicil Kaydım Bulunuyor...");
        }
        else{
            System.out.println("Adli Sicil Kaydım Bulunmuyor...");
        }
    }

    @Override
    public void isTecrübesi(String[] isTecrübe) {
        System.out.println("Bilgisayar Mühendisi olarak şu şirketlerde çalıştım: ");
        for(int i=0;i<isTecrübe.length;i++){
            System.out.println(isTecrübe[i]);
            
        }
    }
    
}
