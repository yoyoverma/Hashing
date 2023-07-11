package hashing;
import java.util.*;

public class majority {
    public static void majorityElement(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])){//true
                map.put(nums[i], map.get(nums[i])+1);
            } else {//false
                map.put(nums[i], 1);
            }
        }

        for(int key : map.keySet()){// sare key ko de dena
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String args[]){
        // int nums[] = {1,3,2,5,1,3,1,5,1};
        int nums[] = {1,2};
        majorityElement(nums);
    }    
}
