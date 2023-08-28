
package com.serkan.tread1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Print  extends Thread{
    
    private String isim;

    @Override
    public void run() {
        
        System.out.println(isim+"   çalışıyor...");
        
        for(int i=0;i<10;i++){
            
            try {
                System.out.println(isim+" Yazıyor: "+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye uğradı.");

            }
            
        }
        System.out.println(isim+" işini bitirdi");


    }

    public Print(String isim) {
        this.isim = isim;
    }
    
}
