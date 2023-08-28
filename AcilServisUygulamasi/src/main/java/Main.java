
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Serkan
 */
public class Main {

    public static void main(String[] args) {

        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
        acilServis.offer(new Hasta("Fatma", "Baş Ağrısı"));
        acilServis.offer(new Hasta("Serkan", "Yanık"));
        acilServis.offer(new Hasta("Ferhat", "Apandisit"));
        acilServis.offer(new Hasta("Hüma", "Baş Ağrısı"));
        acilServis.offer(new Hasta("Kaan", "Yanık"));
        acilServis.offer(new Hasta("Burak", "Apandisit"));
        acilServis.offer(new Hasta("Deniz", "Baş Ağrısı"));
        
        System.out.println("Acil Servis Uygulamasına Hoşgeldiniz");

        
        int i=1;
        
        while(acilServis.isEmpty()!=true)
        {
            System.out.println("***************************");
            System.out.println(i+" .Sırada : ");
            System.out.println(acilServis.poll());
            System.out.println("***************************");
            i++;
        }
        
    }

}
