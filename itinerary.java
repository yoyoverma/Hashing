package hashing;
import java.util.*;

public class itinerary {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            //key->key; val->tick.get(key)
            revMap.put(tick.get(key), key);
        }
        //original map
        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){//reverse string tree ke andr exist nhi krti to key retrun ho jayega
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
