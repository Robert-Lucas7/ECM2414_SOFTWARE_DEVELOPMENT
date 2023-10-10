package WORKSHOP_2;

public class MyCounter {
    private int count = 0;
    public void addTwo(){
        this.count += 2;
    }
    public synchronized void subtractTwo(){
        this.count -= 2;
    }
    public synchronized int  countValue(){
        return this.count;
    }
}
