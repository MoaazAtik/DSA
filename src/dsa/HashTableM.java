package dsa;

import java.util.Hashtable;
import static dsa.DSA.p;

public class HashTableM {

    public static void main(String[] args) {

        int capacity = 10;
//        Hashtable<Integer, String> table = new Hashtable<>(10);
        Hashtable<String, String> table = new Hashtable(capacity);

//        table.put(100, "Spongebob");
//        table.put(123, "Patrick");
//        table.put(321, "Sandy");
//        table.put(555, "Squidward");
//        table.put(777, "Gary");
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");
        
//        table.remove(555);
//        p(table.get(123));

//        p(table.size());
//        p(table.keySet().size());

        
//        for (Integer key : table.keySet()) {
        for (String key : table.keySet()) {
            p("Hash: " + key.hashCode() + "\t" 
                    + "Index of Bucket: " + key.hashCode() % capacity + "\t"
                    + "Key: " + key + "\t" 
                    + "Value: " + table.get(key));
        }
        
    }
    
}
