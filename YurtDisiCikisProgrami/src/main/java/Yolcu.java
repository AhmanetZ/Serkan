
import java.util.Scanner;



/**
 *Instagram Code Tenologi

 * @author Serkan
 */
public class Yolcu implements IYurdisiCikisKurallari{
    
    private int harc;
    private boolean siyasıYasak;
    private boolean vizeDurumu;

    public Yolcu() {
       Scanner scanner =new Scanner (System.in);
        System.out.print("Lütfen yatırşmış olduğunuz harç tutarını giriniz: ");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Siyasi Yasağınız var mı?(Evet ya da Hayır)");
        String cevap=scanner.nextLine();
        if(cevap.equals("Evet"))
        {
            this.siyasıYasak=true;
        }
        else {
            this.siyasıYasak=false;
        }
        System.out.print("Vizeniz var mı?(Evet ya da Hayır)");
        String vizeCevap=scanner.nextLine();
        
        if(vizeCevap.equals("Evet"))
        {
            this.vizeDurumu=true;
        }
        else{
            this.vizeDurumu=false;
        }
    }

    @Override
    public boolean yurDisiHarci() {
        if(this.harc<15)
        {
            System.out.println("Lütfen yurt dışı harcını eksiksiz bir şekilde yatırın.");
            return false;
        }
        else
        {
                System.out.println("Yurt dışı harcı başarılı bir şekilde yatırıldı.");
                return true;
                }
                
    }

    @Override
    public boolean siyasiYasak() {
        if(this.siyasıYasak==true){
            System.out.println("Siyasi yasağınız bulunduğu için yurt dışına çıkamazsınız");
            return false;
        }
        else{
            System.out.println("siyasi yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumu() {
        if(this.vizeDurumu==true){
            System.out.println("Vize işlemleri başarılı bir şekilde gerçekleştirildi");
            return true;
        }
        else{
            System.out.println("gideceğiniz ülkeye vizeniz bulunmsmaktadır.");
            return false;
        }
    }
    
}
