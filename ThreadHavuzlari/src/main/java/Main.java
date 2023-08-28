
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        ExecutorService executor=Executors.newFixedThreadPool(2);
        
        for(int i=0;i<5;i++){
            
            executor.submit(new Worker(String.valueOf(i) , i));
        }
        executor.shutdown();
        
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
                      } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                    /* Thread t1 = new Thread(new Worker("Serkan ", 1));
                    Thread t2 = new Thread(new Worker("Fatma ", 2));
                    Thread t3 = new Thread(new Worker("Hüma ", 3));
                    Thread t4 = new Thread(new Worker("Kızıl ", 4));
                    Thread t5 = new Thread(new Worker("Kaan ", 5));
                    
                    t1.start();
                    t2.start();
                    
                    try {
                    t1.join();
                    t2.join();
                    } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    t3.start();
                    t4.start();
                    
                    try {
                    t3.join();
                    t4.join();
                    } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    t5.start();
                    
                    try {
                    t5.join();
                    } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }*/
                    
                  

    }
}
