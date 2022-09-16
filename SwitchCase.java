import java.util.*;
public class SwitchCase {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("First day is sunday");
                break;
            case 2:
                System.out.println("Second day is sunday");
                break;
            case 3:
                System.out.println("Third day is sunday");
                break;
            case 4:
                System.out.println("Fourth day is sunday");
                break;
            case 5:
                System.out.println("Fifth day is sunday");
                break;
            case 6:
                System.out.println("Sixth day is sunday");
                break;
            case 7:
                System.out.println("Seventh day is sunday");
                break;
            default:
                System.out.println("Not a valid week day number");
        }
    }
}
