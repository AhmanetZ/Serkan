
/**
 *
 * @author Serkan
 */
public class MakineMühendisi implements IMühendis,ICalıs{

    private boolean askerlik;
    private boolean adliSicil;

    public MakineMühendisi(boolean askerlik, boolean adliSicil) {
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
        if(isTecrübe.length==0){
            System.out.println("Herhangibir iş tecrübem bulunmamaktadır.");
        }
        else
        {
            System.out.println("Makine mühendisi olarak iş tecrübem:");
            for(int i=0;i<isTecrübe.length;i++)
            {
                System.out.println(isTecrübe[i]);
            }
        }
    }

    @Override
    public void calis() {
        System.out.println("Makine Mühendisi çalışıyor.");
    }
    
}
