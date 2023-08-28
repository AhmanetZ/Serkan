package com.mycompany.callabevefuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Serkan
 */
public class CallabeveFuture {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        /*executor.submit(new Runnable() {
            @Override
            public void run() {
                
                try {
                    Random random=new Random();
                    System.out.println("Thread çalışıyor....");
                    
                    int süre=random.nextInt(1000)+2000;
                    
                    Thread.sleep(süre);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CallabeveFuture.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Thread sonlandırılıyor...");


            }
        });*/
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {

                try {
                    Random random = new Random();
                    System.out.println("Thread çalışıyor....");

                    int sure = random.nextInt(1000) + 2000;

                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CallabeveFuture.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Thread sonlandırılıyor...");
             

                return s

            }
        });

        executor.shutdown();
        
        System.out.println("Dönen değer: "+future.get(s));
    }
}
