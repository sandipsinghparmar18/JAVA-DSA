import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HASHING {
    public static int findKthSmallestNumber(int arr[],int k){
        Set<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int num=1;
        while(k>0){
            if(!set.contains(num)){
                k--;
            }
            num++;
        }
        return num-1;
    }

    public static void findItinerary(Map<String,String>tickets){
        String startCity=findStartCity(tickets);

        while(startCity !=null){
            String nextCity=tickets.get(startCity);
            if(nextCity!=null){
                System.out.print(startCity+"->"+nextCity);
                startCity=nextCity;
                if(tickets.containsKey(startCity)){
                    System.out.print(" , ");
                }
            }else{
                break;
            }
        }
    }
    private static String findStartCity(Map<String,String> tickets){
        Set<String> destinations=new HashSet<>(tickets.values());
        for(String city:tickets.keySet()){
            if(!destinations.contains(city)){
                return city;
            }
        }
        return null;
    }

    private static String getKey(String str){
        String key="";
        for(int i=1;i<str.length();i++){
            int diff=str.charAt(i)-str.charAt(i-1);
            if(diff<0){
                diff+=26;
            }
            key+=diff+"#";
        }
        key+=".";
        return key;
    }
    public static ArrayList<ArrayList<String>> groupShiftedString(String[] strs){
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String str:strs){
            String key=getKey(str);
            if(!map.containsKey(key)){
                ArrayList<String>list=new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }else{
                ArrayList<String>list=map.get(key);
                list.add(str);
            }
        }
        ArrayList<ArrayList<String>> result=new ArrayList<>();
        for(ArrayList<String> list:map.values()){
            result.add(list);
        }
        return result;
    }
    public static void main(String[] args) {
        // int[] arr2 = {1, 3};
        // int k2 = 4;
        // System.out.println(findKthSmallestNumber(arr2, k2));

        // Map<String, String> tickets = new HashMap<>();
        // tickets.put("Chennai", "Banglore");
        // tickets.put("Bombay", "Delhi");
        // tickets.put("Goa", "Chennai");
        // tickets.put("Delhi", "Goa");

        // // Find and print the itinerary
        // findItinerary(tickets);

        String[] strs = {"acd", "dfg", "wyz", "yab", "mop", "bdfh", "a", "x", "moqs"};
        ArrayList<ArrayList<String>> result = groupShiftedString(strs);

        for (ArrayList<String> group : result) {
            System.out.println(group);
        }
    }
}