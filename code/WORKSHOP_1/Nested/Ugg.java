package WORKSHOP_1.Nested;
import java.util.Random;

public class Ugg {
    enum UggRockSize{
        BIGUN(5),
        QUITE_BIGUN(3),
        NOT_SO_BIGUN(3);
    
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
    class UggRock {
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
        
    
    }
    Random randomUgg = new Random();
    /*
     * Returns an UggRock at random.
     * not so bigun 3x more likely than quite-biguns, quite-bigun 2x more likely than biguns.
     * Equally likely to return any of the rock types.
     */
    public UggRock drawBack(){

    }
}
