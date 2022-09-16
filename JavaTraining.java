import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.util.*;

public class JavaTraining {
    public static void main(String[] args) {
        /*for(int i=0;i<10;i++){
            if(i==5)
                //break;
                //continue;
                //return;
            System.out.println(i);
        }
        System.out.println("Hello");*/

        //1D
        /*
        Scanner sc=new Scanner(System.in);
        int array[]={1,2,3,4,5,6,7,8};
        int newarray[]=new int[5];
        for(int i=0;i<newarray.length;i++)
            newarray[i]=sc.nextInt();
        for(int i:newarray)
            System.out.println(i);
        //newarray[0]=1;
        for(int i:array)
            System.out.println(i);
        for(int i=0;i<newarray.length;i++)
            System.out.println(array[i]);
        System.out.println(array[1]);
    }*/
        //if return it wont proceed forward and return while break breaks loops and proceed forward
    /*for(int i=1;i<=20;i++)
            if(i%2==0)
            System.out.println(i);
        int numbers[]={1,2,3,4,5,6,7};
        for(int i:numbers)//storing numbers value into i
            System.out.println(i);
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=20);
        /*int numbers[]={1,2,3,4,5,6,7};
        for(int i:numbers)//storing numbers value into i
            System.out.println(i);
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=20);*/

        //2D
        /*int arr[][]={{1,2},{3,4},{5,6}};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }*/
        //2D array
        /*int TwoDOne[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        for (int i = 0; i < TwoDOne.length; i++) {
            for (int j = 0; j < TwoDOne.length; j++) {
                System.out.print(TwoDOne[i][j]);
            }
            System.out.println();
        }*/
        //Scanner sc =new Scanner(System.in);
        /*String str="abcd";
        //String str=new String("Hello world");
        //String str1=sc.next();
        System.out.println(str.length());
       //System.out.println(str.toCharArray());
        System.out.println(str.charAt(2));
        str.concat("abcd");
        System.out.println(str);
        String s=str.concat("efgh");
        System.out.println(s);
        //https://www.javatpoint.com/immutable-string
        //String will create a new object while creating new object but while concatinating same string it can't change as it will still point to string before concating

        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        sb.append("hi");
        System.out.println(sb);*/

        //Wrapper Class
        /*Integer number = 10;
        int anumber = number.intValue();
        System.out.println(anumber);
        String str = "20";
        int a = Integer.parseInt(str);
        System.out.println(a);
        Float fnumber = 20.2f;//if not f or else  it will automatically converted to double
        float k = fnumber.floatValue();
        System.out.println(k);

        //Autoboxing
        //conversion of primitive datatype to object of their corresponding wrapper class
        int x = 20;
        Integer z = x;
        //Autounboxing
        //reverse of autoboxing
        Integer oneNumber = 50;
        int y = oneNumber.intValue();
        int y2 = oneNumber;
        System.out.println(y2);

        //Error have to solve else flow is terminated
        //exception can be handled and maintain normal flow of program execution
        //check exceptions-These are checked during compile time ,directly inherits throwable class except runtime exception
        //eg:IOException,SQL Exceptions
        //Unchecked eg:ArrayIndexOutOfBound
        //checked at runtime,inherits runtimeException class
        //Exceptions
        int num1, num2,nu=0;
        num1 = 10;
        num2 = 0;
        String s=null;
        try{
        int num3 = num1 / num2;
        nu=s.length();
    }
        catch(ArithmeticException e){
            System.out.println(e);
            //System.out.println(e.getMessage());
        }
        catch(NullPointerException e){//one exception at a time so this exception doesn't work
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
        int n=num1+num2;
        System.out.println(n);
        System.out.println(nu);


        //throw and throws
        //throw is used within the method.	throws is used with the method signature.
        //public void getName() throws IOException
        //throw new exceptionClassName("Error Message")
        */









        //Collections
        //predefined architecture which is used to store group of elements behaving like a single object

/*
        //ArrayList-Allows duplicate values
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add("a");
        System.out.println(arr);
//To print values one by one
        Iterator itr=arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(4);
        arr1.add(4);
        System.out.println(arr1);
        for(int k:arr1)
        System.out.println(k);


        //HashSet -doesn't allow duplicates
        HashSet h=new HashSet();
        h.add(1);
        h.add("a");
        System.out.println(h);
        Iterator i=h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        HashSet<Integer>j=new HashSet<>();
        //set<Integer>j=new HashSet<>();
        j.add(1);
        j.add(2);
        System.out.println(j);
        for(int k:j)
            System.out.println(k);


        //Map-key value pair,can have unique key but same value
        HashMap<String,Integer> m=new HashMap<>();
        m.put("a",100);
        m.put("b",200);
        m.put("a",500);//overrides
        System.out.println(m);
        Set<Map.Entry<String,Integer>> st=m.entrySet();
        for(Map.Entry<String,Integer>me:st){
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }*/



        //Java Generics-for compile-time type safety


    }
}
/*Design an iterator that supports the peek operation on an existing iterator in addition to the hasNext and the next operations.

Implement the PeekingIterator class:

PeekingIterator(Iterator<int> nums) Initializes the object with the given integer iterator iterator.
int next() Returns the next element in the array and moves the pointer to the next element.
boolean hasNext() Returns true if there are still elements in the array.
int peek() Returns the next element in the array without moving the pointer.
Note: Each language may have a different implementation of the constructor and Iterator, but they all support the int next() and boolean hasNext() functions.



Example 1:

Input
["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
[[[1, 2, 3]], [], [], [], [], []]
Output
[null, 1, 2, 2, 3, false]
*/
/*
Design a class that acts as a library for the following kinds of media: book, video, and newspaper. Provide one version of the class that uses generics and one that does not

 */

/*
You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.

Implement the BrowserHistory class:

BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
void visit(string url) Visits url from the current page. It clears up all the forward history.
string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps

Input:
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
Output:
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com"]
*/
/*
You are given a table, in which every key is a stringified number, and each corresponding value is an array of characters, e.g.

{
  "1": ["A", "B", "C"],
  "2": ["A", "B", "D", "A"],
}
Create a function that returns a table with the same keys, but each character should appear only once among the value-arrays, e.g.

{
  "1": ["C"],
  "2": ["A", "B", "D"],
}


 */
