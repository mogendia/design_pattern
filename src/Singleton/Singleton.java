package Singleton;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton {
    private final Integer[] Numbers={1,2,2,4,5};
    private final List<Integer> data= Arrays.asList(Numbers);

    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public Singleton(){
        Collections.shuffle(data);
    }
    public void printData(){
        for (Integer items:data){
            System.out.print(items.toString()+ " ");
        }
        System.out.println();
    }
}
