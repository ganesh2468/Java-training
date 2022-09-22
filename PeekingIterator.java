import java.util.Scanner;

class myIterator{
    int[] arr;
    int step;

    public myIterator(int[] arr) {
        this.arr = arr;
        step=-1;
    }
    public int next(){
        step++;
        return arr[step];
    }
    public boolean hasNext(){
        return(step!= arr.length-1);
    }
    public int peek(){
        return arr[step+1];
    }
}

public class PeekingIterator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        myIterator it=new myIterator(arr);
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.peek());
    }
}