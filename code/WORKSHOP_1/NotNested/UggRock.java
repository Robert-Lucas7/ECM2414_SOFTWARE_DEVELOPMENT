package WORKSHOP_1.NotNested;

public class UggRock {
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
