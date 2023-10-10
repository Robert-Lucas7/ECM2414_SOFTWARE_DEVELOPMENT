package WORKSHOP_2;

public class Program {
    public static void main(String[] args){
        /*FlagExample t1 = new FlagExample();
        FlagExample t2 = new FlagExample();
        t1.start();
        t2.start();

        System.out.println("Main thread is still running");
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){

        }

        t1.stopThread();
        t2.stopThread();*/
        
        InterruptionExample i1 = new InterruptionExample();
        Thread t1 = new Thread(i1);

        t1.start();
    }
}
