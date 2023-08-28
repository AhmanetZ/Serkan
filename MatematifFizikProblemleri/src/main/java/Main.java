
import java.util.Scanner;


/**
 *Instagram Code Teknologi
 * @author Serkan
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik ve Fizik Problemler Uygulamasına Hoşgeldiniz.");
        System.out.println("-------------------------------------------------------");
        
        String islemler="0- İşlemleri yeniden göster.\n"+
                        "1- Dikdörtgen alan hesaplaması yap.\n"+
                        "2- Üçgen alan hesaplaması yap.\n"+
                        "3- 2 Vektörün iç çarpımı yap.\n"+
                        "Q- İşlemleri yeniden göster.\n";
        System.out.println(islemler);
        
        while(true)
        {
            System.out.print("Lütfen bir işlem seçiniz: ");
            String islem=scanner.nextLine();
           
            if(islem.equals("0"))
            {
                System.out.println(islemler);
            }
            else if(islem.equals("Q"))
            {
                System.out.println("Program Kapanıyor...");
                break;
            }
            else if(islem.equals("1"))
            {
                System.out.print("Daire Yarıçapı: ");
                int yarıcap=scanner.nextInt();
                scanner.nextLine();
                Problem.matematik.daireAlanı(yarıcap);
                
            }
            else if(islem.equals("2"))
            {
                System.out.print("1. kenar uzunluğu: ");
                int kenar1=scanner.nextInt();
                scanner.nextLine();
                System.out.print("2. kenar uzunluğu: ");
                int kenar2=scanner.nextInt();
                scanner.nextLine();
                System.out.print("3. kenar uzunluğu: ");
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                Problem.matematik.ücgenAlanı(kenar1, kenar2, kenar3);
            }
            else if(islem.equals("3"))
            {
                Vec vec1=new Vec("Vektör1");
                Vec vec2=new Vec("Vektör2");
                
                Problem.fizik.icCarpım(vec1, vec2);
            }
            else{
                System.out.println("Hatalı bir işlem seçtiniz.");
            }
        }
                
    }
    
}
