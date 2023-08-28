
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadSafe {
    
    private int count=0;

   public synchronized void  arrtırma(){
       count++;
   }
    
    public void threadlariCalistir(){
        
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {

             for(int i=1;i<5000;i++){
                 
               arrtırma();
             }
              



            }
        });
         Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {

             for(int i=1;i<5000;i++){
                 
              arrtırma();
             }
              



            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            System.out.println("Thread1 oluşturulurken InterruptedException hatası oluştu.");
        }
        try {
            thread2.join();
        } catch (InterruptedException ex) {
          System.out.println("Thread2 oluşturulurken InterruptedException hatası oluştu.");
        }
        
        System.out.println("Count değişkeninin değer: "+count);
        
        
        
    }
            
            public static void main(String[] args) {
                
                
                ThreadSafe threadSafe=new ThreadSafe();
                
                threadSafe.threadlariCalistir();
        
    }
    
}
