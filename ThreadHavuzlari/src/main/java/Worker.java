
import java.util.logging.Level;
import java.util.logging.Logger;


public class Worker implements Runnable{
    
    private String name;

    public Worker(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }
    private int taskId;
    

    @Override
    public void run() {
        
        try {
            System.out.println("Worker: "+name+" "+taskId+". işe başladı.   ");
            
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
 System.out.println("Worker: "+name+" "+taskId+". işi bitirdi.");

    }
    
}
