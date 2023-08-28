

/**
 *
 * @author Serkan
 */
public class Hasta implements Comparable<Hasta>{
    private String hastaAdı;
    private String sikayet;
    private int öncelikSırası;

    public Hasta(String hastaAdı, String sikayet) {
        this.hastaAdı = hastaAdı;
        this.sikayet = sikayet;
        
        if(sikayet.equals("Apadisit"))
        {
            this.öncelikSırası=1;
        }
        else if(sikayet.equals("Yanık"))
        {
            this.öncelikSırası=2;
        }
        else
        {
            this.öncelikSırası=3;
        }
        
    }

    @Override
    public String toString() {
        
        String bilgiler="Hasta Adı: "+hastaAdı+
                        "\nŞikayeti"+sikayet+
                        "\nÖncelik Sırası: "+öncelikSırası;
        
        return bilgiler;
                        


    }

    @Override
    public int compareTo(Hasta hasta) {
        
        
        if(this.öncelikSırası>hasta.öncelikSırası)
        {
            return -1;
        }
        else if(this.öncelikSırası<hasta.öncelikSırası)
        {
            return 1;
        }
        else
        {
            return 0;
        }



    }
    
    
    
}
