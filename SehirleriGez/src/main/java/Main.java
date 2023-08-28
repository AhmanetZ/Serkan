
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Instagram Code Teknologi
 *
 * @author Serkan
 */
public class Main {

    public static void islemleriBastır() {
        System.out.println("0 -İşlemleri yeniden göster.");
        System.out.println("1 -Bir sonraki şehre git.");
        System.out.println("2 -Bir önceki şehre geridön.");
        System.out.println("3 -Uygulamayı kapar.");

    }

    public static void sehirleriTurla(LinkedList<String> sehirler) {

        ListIterator<String> iterator = sehirler.listIterator();
        int islem = 0;

        islemleriBastır();
        
        Scanner scanner =new Scanner(System.in);
        if(!iterator.hasNext()){
            System.out.println("Böyle bir sehir bulunamadı...");
        }
         
        boolean cıkıs =false;
        boolean ileri=true;
        while(!cıkıs){
            System.out.println("Lütfen bir işlem seçiniz.");
            islem=scanner.nextInt();
        
            switch(islem)
            {
                case 0:
                    islemleriBastır();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }
                    if(iterator.hasNext()){//sonraki bir değer varmı.
                        System.out.println("Şehre gidiliyor "+iterator.next());
                    }
                    else
                    {
                        System.out.println("gidilecek şehir kalmadı.");
                        ileri=true;
                    }
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if(iterator.hasPrevious())
                    {
                        System.out.println("Şehre gidiliyor "+iterator.previous());
                    }
                    else
                    {
                        System.out.println("Şehir Turu Başlıyor...");
                        ileri=false;
                    }
                    break; 
                case 3:
                    cıkıs=true;
                    System.out.println("Program kapatılıyor...");
                    break;
                    
                default:
                    System.out.println("Hatalı bir işlem seçildi");
        }
    }
    }
    
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();
        sehirler.add("Kars");
        sehirler.add("Erzurum");
        sehirler.add("Ardahan");
        sehirler.add("Sivas");
        sehirler.add("Ağrı");
        sehirler.add("Van");
        System.out.println("\tŞehir turu Programına Hoşgeldiniz");
        System.out.println("\t-----------------------------------");
        sehirleriTurla(sehirler);
      
    }

}
