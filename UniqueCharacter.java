//import java.util.ArrayList;
//import java.util.*;
//
//public class UniqueCharacter {
//    public static void main(String[] args) {
//        HashMap<String, String> arr = new HashMap<>();
//        arr.put("1", "A,B,C,D");
//        arr.put("2", "A,B,C,A");
//
//        for (Map.Entry m : arr.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
//        Set<String> keys=arr.keySet();
//        Iterator<String> keyIter = keys.iterator();
//        while(keyIter.hasNext()){
//            String key=keyIter.next();
//            String value=arr.get(key);
//            System.out.println(value);
//            if(value.equals(arr.get(key)){
//                arr.remove(value);
//            }
//        }
//    }
//}
