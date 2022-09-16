import java.util.Scanner;
public class CollatzSequence {
        public static void main(String args[])
        {
            //exit control loop do-while prints ateast one
            //other like for,while are entry control loop
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int n=sc.nextInt();
            if(n==1) {
                System.out.println(n);
                System.out.println(0);
            }
            System.out.println(n);
            while(n>1){
                if(n%2==0)
                    n=n/2;
                else
                    n=3*n+1;
                System.out.println(n);
            }
        }
}
