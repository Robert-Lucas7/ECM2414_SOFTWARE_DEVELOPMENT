package WORKSHOP_2;

public class InterruptionExample implements Runnable{
    public InterruptionExample(){}
    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            try{
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+" : finished sleeping");    
            } catch(InterruptedException e){
                return;
            }
            
        }
    }
}
