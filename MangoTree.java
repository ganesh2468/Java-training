import java.util.*;
public class MangoTree {
    public static void main(String args[]){
        System.out.println("Enter number of row,column and number of trees");
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int trees=sc.nextInt();
        if(trees<column || trees%column==0 || trees%column==1)
            System.out.println("Its a mango tree");
        else
            System.out.println("Its not a mano tree");
    }
}
