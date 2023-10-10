package WORKSHOP_1.Nested;
import WORKSHOP_1.Nested.Ugg;
public class Program {
    public static void main(String[] args){
        for(int i=0;i<20;i++){
            Ugg.UggRock rndRock = Ugg.drawRock();
            System.out.println("Random Rock " + (i+1)+": " + rndRock.toString());
            System.out.println("Random Rock Value: "+rndRock.rockValue());
        }
    }
}
