
import java.util.*;
public class WildcardDemo {
    public static void main(String[] args) {
//        List<Float> floatList = new ArrayList<>();
//        floatList.add(2.2f);
//        floatList.add(4.4f);
//        printList(floatList);
        List<Number> numberlist=new ArrayList<>();
        numberlist.add(1);
        numberlist.add(1.1);
        numberlist.add(1.1f);
        printList(numberlist);
//        List<String> AnimalsList = new ArrayList<>();
//        AnimalsList.add("Tiger");
//        AnimalsList.add("Fox");
//        printList(AnimalsList);
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);

    }
//
//    public static void printList(List<?> ListOfAll)//unbounded wildcard
//    {
//        System.out.println(ListOfAll);
//    }
//Upper bounded
//    public static void printList(List<? extends Number> listOfAll) {
//        System.out.println(listOfAll);//Here ? is replaced with datatype
//    }
    //Lower Bounded
    public static void printList(List<? super Integer> listOfAll) {//Integer and its super class i.e. Number
        System.out.println(listOfAll);//Here ? is replaced with datatype
    }
}


