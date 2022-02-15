import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class builderMain {
    public static void main(String[] args){
        Map<String, Integer> firstMap = new LinkedHashMap<>();
        System.out.println(firstMap.isEmpty());
        for(int i=0; i<7; i++){
            firstMap.put("value is "+i+" ", i*7);
        }
        System.out.println("map usingSystem.out.println();:");
        System.out.println(firstMap);
        System.out.println(""+firstMap.isEmpty());
        System.out.println(firstMap.keySet());
        System.out.println(firstMap.size());

        Map newObj = new LinkedHashMap();
        newObj.putAll(firstMap);
        System.out.println(newObj);
        System.out.println(newObj);
        System.out.println("first parson: " +" ");
        System.out.println("this is the "+" new builder class for the this class" );
        System.out.println("the values are: "+newObj.values());
        System.out.println("the values ara: "+ "are change by the their S");
        System.out.println("this is not change by anyone!");
        System.out.println(firstMap.keySet());
        System.out.println("this program is run by many people it ok with every code!!");
        System.out.println("is there na ");
        System.out.println("this is the nar ");
        System.out.println("this is the final result of this  program!!");
        System.out.println("it is going to be close in 10 minutes!!");
        
    }
}
