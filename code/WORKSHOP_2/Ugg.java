package WORKSHOP_2;

import java.util.Random;

public class Ugg {
    public static void main(String[] args){
        new Thread("T1") {
            public void run(){
                for(int i=0;i<20;i++){
                    UggRock u = drawRock();
                    System.out.println(Thread.currentThread().getName()+": "+"Random Rock " + (i+1)+": " + u.toString()+", Value: "+u.rockValue());
                }
            }
        }.start();
        new Thread("T2") {
            public void run(){
                for(int i=0;i<20;i++){
                    UggRock u = drawRock();
                    System.out.println(Thread.currentThread().getName()+": "+"Random Rock " + (i+1)+": " + u.toString()+", Value: "+u.rockValue());
                    
                }
            }
        }.start();
       

    }
    enum UggRockSize{
        BIGUN(5),
        QUITE_BIGUN(3),
        NOT_SO_BIGUN(1);
    
        public final int multiplierValue;
        private UggRockSize(int value){
            this.multiplierValue = value;
        }
        public int getMultiplierValue(){
            return this.multiplierValue;
        }
    }
    enum UggRockType{
        SPECKILY(7),
        OUCHY_BLACK(20),
        FLOATY(2),
        HOT_HOT_HOT(15);
    
        private final int multiplierValue;
        UggRockType(int value){
            this.multiplierValue = value;
        }
        public int getMultiplierValue(){
            return this.multiplierValue;
        }
    }
    static class UggRock {
        private final UggRockSize size;
        private final UggRockType type;
    
        public UggRock(UggRockSize size, UggRockType type){
            this.size = size;
            this.type = type;
        }
        public UggRockSize getSize(){
            return this.size;
        }
        public UggRockType getType(){
            return this.type;
        }
        @Override
        public String toString(){
            return String.format("%s, %s", size, type);
        }
        public int rockValue(){
            return size.multiplierValue * type.multiplierValue;
        }
        
    
    }
    static Random rnd = new Random();
    /*
     * Returns an UggRock at random.
     * not so bigun 3x more likely than quite-biguns, quite-bigun 2x more likely than biguns.
     * Equally likely to return any of the rock types.
     */
    public static UggRock drawRock(){
        double rndSize = rnd.nextDouble();
        double rndType = rnd.nextDouble();
        UggRockSize rs;
        UggRockType rt;
        if(rndType < 0.25){
            rt = UggRockType.SPECKILY;
        } else if(rndType < 0.5){
            rt = UggRockType.OUCHY_BLACK;
        } else if(rndType < 0.75){
            rt = UggRockType.FLOATY;
        } else{
            rt = UggRockType.HOT_HOT_HOT;
        }

        if(rndSize < 6.0/9.0){
            rs = UggRockSize.NOT_SO_BIGUN;
        } else if(rndSize < 8.0/9.0){
            rs = UggRockSize.QUITE_BIGUN;
        } else{
            rs = UggRockSize.BIGUN;
        }
        return new UggRock(rs, rt);


    }
}

