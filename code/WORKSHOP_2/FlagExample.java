package WORKSHOP_2;

public class FlagExample extends Thread{
    private volatile boolean done = false; //Cache Coherence??

    public FlagExample(){}
    public void run(){
        while(!done){
            System.out.println(this.getName() + " : dum diddly dum....");
            try{
                Thread.sleep(10);
                System.out.println(this.getName() + " : finished sleeping");
            } catch(InterruptedException e){

            }
        }
    }
    public void stopThread(){
        System.out.println(this.getName() + " : flag is being set.....");
        this.done = true;
    }
}