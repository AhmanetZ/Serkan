
import java.util.ArrayList;
import java.util.Iterator;



/**
 *
 * @author Serkan
 */
public class Radyo implements Iterable<String>{
    
    private ArrayList<String> kanalListesi=new ArrayList<String>();
    public class RadyoIterator implements Iterator<String>{
        private int index=0; 

        @Override
        public boolean hasNext() {
            
            if(index<kanalListesi.size())
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public String next() {
            String değer=kanalListesi.get(index);
            index++;
            
            return değer;
        }
        
    }
    public Radyo(String [] kanallar){
        for(String kanal:kanallar){
            this.kanalListesi.add(kanal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        
        return new RadyoIterator();


    }

   
}
