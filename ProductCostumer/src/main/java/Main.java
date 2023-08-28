
public class Main {
    
    public static void main(String[] args) {
        
        
        ProducerCostumer pc=new ProducerCostumer();
        
        Thread producer=new Thread(new Runnable() {
            @Override
            public void run() {
                pc.produce();


            }
        });
         Thread costumer=new Thread(new Runnable() {
            @Override
            public void run() {
                pc.costumer();


            }
        });
        
    }
    
}
