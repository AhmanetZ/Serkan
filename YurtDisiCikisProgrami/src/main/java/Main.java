
/**
 *Instagram Code Tenologi

 * @author Serkan
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz.");
        System.out.println("---------------------------------------");
        String sartlar="Yurt Dışına Çıkarken Uymanız Gereke Kurallar \n"+
                       "1- Siyasi Yasağınızın Bulunmaması Gerekmektedir.\n"+
                       "2- 15 tl ollan Yurt dışına çıkış harcını tam yatırmanız gerekmektedir.\n"+
                       "3- gideceğiniz ülkeye vizenizin olması gerekmektedir.";
        String mesaj="Yurt dışına çıkabilmeniz için tüm şartları sağlamanız gerekmektedir.";
        
        while(true){
            System.out.println(mesaj);
            System.out.println("----------------------------------------------------------");
        System.out.println(sartlar);
        Yolcu yolcu=new Yolcu();
            System.out.println("Yurt dışı harcı kotrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.yurDisiHarci()==false)
            {
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.siyasiYasak()==false)
            {
                
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vize kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumu()==false)
            {
                
                System.out.println(mesaj);
                continue;
            }
            System.out.println("İşlemleriniz tamamlandı.Yurt dışına çıkabilrsiniz.");
            break;
        
        
        }
    }
    
}
