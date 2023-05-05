package Day_45_Static_01;

public class Countable {
    int instanceCount;//instance variable
    static int instanceCount2;//CLASS VARIABLE

    Countable(){
        instanceCount2++;
        instanceCount++;
    }
    public int getInstanceCount(){
        return instanceCount2;
    }
    public int getInstanceCount1(){
        return instanceCount;
    }
}
