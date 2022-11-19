package task8generics_collections;

import com.sun.istack.internal.NotNull;

import java.util.HashMap;
import java.util.Map;

public class HashAndEquals implements Comparable {


    public HashAndEquals() {
    }

    public static void main (String[] args) {
        Map<Integer, String> myAnimalMap = new HashMap<>();
        myAnimalMap.put(Integer.valueOf(1), "Cat Vasilii");
        myAnimalMap.put(Integer.valueOf(2), "Cat Sharik");

        for (Map.Entry<Integer, String> item :  myAnimalMap.entrySet()) {
            System.out.printf("%d '%s' \n", item.getKey(), item.getValue());
        }}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}