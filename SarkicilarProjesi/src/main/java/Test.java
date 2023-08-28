
import java.util.Scanner;



/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Test {
    private static Sarkicilar sarkıcılar=new Sarkicilar();
    private static Scanner scanner=new  Scanner(System.in);
    public static void sarkıcılarıGörüntüle(){
        sarkıcılar.sarkıcılarıGöster();
    }
    public static void sarkıcıEkle(){
        System.out.print("Eklemek istediğiniz Şarkıcının ismini giriniz: ");
        String isim=scanner.nextLine();
        sarkıcılar.sarkıcıEkle(isim);
    }
    public static void sarkıcıGüncelle(){
        System.out.print("Güncellemek istediğiniz şarkıcının sırasını giriniz:");
        int sıra=scanner.nextInt();
        scanner.nextLine();
        String yeniİsim=scanner.nextLine();
        sarkıcılar.sarkıcıGüncellem(yeniİsim, sıra-1);
    }
    public static void sarkıcıSil(){
        System.out.print("Silmek İstediğiniz Şarkıcının ismini giriniz: ");
        String silinecekİsim=scanner.nextLine();
        sarkıcılar.sarkıcıSil(silinecekİsim);
    }
    public static void sarkıcıAra(){
        System.out.print("Aramak istediğiniz Şarkıcının Adını Giriniz: ");
        String deger=scanner.nextLine();
        sarkıcılar.sarkıcıAra(deger);
    }
    public static void islemlerBastır(){
        System.out.println("\t 0- İşlemleri Görüntüle.");
        System.out.println("\t 1- Şarkıcı listesini Görüntüle.");
        System.out.println("\t 2- Şarkıcı Ekle.");
        System.out.println("\t 3- Şarkıcı Güncelle.");
        System.out.println("\t 4- Şarkıcı Sil.");
        System.out.println("\t 5- Şarkıcı Ara.");
        System.out.println("\t 6- Uygulamayı Kapat.");
    }
    public static void main(String[] args) {
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz");
        System.out.println("\t--------------------------------");
        islemlerBastır();
        
        boolean cıkıs=false;
        int islem;
        while(!cıkıs){
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            islem=scanner.nextInt();
            scanner.nextLine();
            switch (islem) {
                case 0:
                    islemlerBastır();
                    break;
                case 1:
                    sarkıcılarıGörüntüle();
                    break;
                case 2:
                    sarkıcıEkle();
                    break;
                case 3:
                    sarkıcıGüncelle();
                    break;
                case 4:
                    sarkıcıSil();
                    break;
                case 5:
                    sarkıcıAra();
                    break;
                case 6:
                    cıkıs=true;
                    System.out.println("Program kapatılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir işlem Girdiniz.");
            }
        }
        
    }
    
}
