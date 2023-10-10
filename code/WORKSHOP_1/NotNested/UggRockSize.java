package WORKSHOP_1.NotNested;

public enum UggRockSize{
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