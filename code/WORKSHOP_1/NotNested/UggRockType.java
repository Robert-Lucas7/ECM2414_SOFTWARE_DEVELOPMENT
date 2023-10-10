package WORKSHOP_1.NotNested;

public enum UggRockType{
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