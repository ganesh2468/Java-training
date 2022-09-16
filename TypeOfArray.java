import java.util.Scanner;
public class TypeOfArray {
    /*public int even(int []arr){
        for(i=0;i<arr.length;i++){
            boolean a=false;
            if(arr[i]%2==0)
                a=true;
        }
        if (a==true)
            System.out.println("Even");
        return 0;
    }
    public int odd(int []arr){
        boolean b=false;
        for(i=0;i<arr.length;i++){
            if(arr[i]%2!=0)
                 b=true;
        }
        if(b==true)
            System.out.println("odd");
        return 1;
    }*/

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int result=checkArray(n,arr);
        if(result==1)
            System.out.println("Even");
        else if(result==2)
            System.out.println("Odd");
        else if(result==3)
            System.out.println("Mixed");
        }
        public static int checkArray(int n, int[] arr) {
            int odd = 0, even = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }
                if (even > 0 && odd == 0) {
                    return 1;
                } else if (odd > 0 && even == 0) {
                    return 2;
                } else {
                    return 3;
                }
            }
        }
