
import java.util.ArrayList;



/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Sarkicilar {
     private  ArrayList<String> sarkıcıListesi=new ArrayList<String>();
       public  void sarkıcılarıGöster(){
           System.out.println("Şarkıcı listesinde " + sarkıcıListesi.size() + " kadar şarkıcı var");
           for(int i=0;i<sarkıcıListesi.size();i++)
           {
               System.out.println((i+1)+".Şarkıcı: "+sarkıcıListesi.get(i));
           }
       }
       public void sarkıcıEkle(String isim){
           sarkıcıListesi.add(isim);
           System.out.println("Yeni şarkıcı listeye eklendi.");
            for(int i=0;i<sarkıcıListesi.size();i++)
           {
               System.out.println((i+1)+".Şarkıcı: "+sarkıcıListesi.get(i));
           }
           
       }
       public void sarkıcıGüncellem(String yeniİsim,int pozisyon){
           sarkıcıListesi.set(pozisyon, yeniİsim);
           System.out.println("Şarkıcı Listesi Güncellendi.");
            for(int i=0;i<sarkıcıListesi.size();i++)
           {
               System.out.println((i+1)+".Şarkıcı: "+sarkıcıListesi.get(i));
           }    
       }
       public void sarkıcıSil(String silinecekİsim){
           sarkıcıListesi.remove(silinecekİsim);
           System.out.println(silinecekİsim+" Şarkıcı başarıyla silindi");
       }
       public void sarkıcıAra(String aranacakSarkıcı){
            int pozition=sarkıcıListesi.indexOf(aranacakSarkıcı);
            if (pozition>=0){
                System.out.println("Şarkıcı baraşılı bir şekilde bulundu");
                System.out.println(aranacakSarkıcı+" isimli Şarkıcı"+(pozition+1)+" .sırada");
            }
            else{
                System.out.println("Listede böyle bir şarkıcı yoktur.");
            }
            
       }
}

