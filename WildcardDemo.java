import java.util.*;
public class WildcardDemo {
    public static void main(String[] args) {
        List<Double> doubleList=new ArrayList<>();
        doubleList.add(2.2);
        doubleList.add(4.4);
        printList(doubleList);
        List<String>stringList=new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        printList(stringList);
    }
    public static void printList(List<?> ListOfAll)//unbounded wildcard
    {
        System.out.println(ListOfAll);
    }
}
