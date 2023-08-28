
import java.awt.BorderLayout;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Serkan
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random random=new Random();

        System.out.println("RAMAZAN PİDESİ UYGULAMASI");
        System.out.println("----------------------------");
        Queue<String> pideKuyrugu = new LinkedList<String>();

        pideKuyrugu.offer("Fatma");
        pideKuyrugu.offer("Serkan");
        pideKuyrugu.offer("Hüma");
        pideKuyrugu.offer("Burak");
        pideKuyrugu.offer("Baki");
        pideKuyrugu.offer("Ferhat");
        pideKuyrugu.offer("Meryem");
        pideKuyrugu.offer("Kaan");
        pideKuyrugu.offer("Mehmet");
        pideKuyrugu.offer("Feride");
        
        int pideSayısı=1+random.nextInt(10);
        System.out.println("Pideler çıkıyor...");
        Thread.sleep(3000);
        System.out.println("Çıkan Pide Sayısı: "+pideSayısı);
         Thread.sleep(3000);
        
            while(pideSayısı!=0)
        {
            System.out.println(pideKuyrugu.poll()+" pideyi aldı...");
            pideSayısı--;
            Thread.sleep(1000);
            
        }
            System.out.println("Pide Kalmadı...");

    }

}
