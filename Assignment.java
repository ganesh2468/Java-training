import java.util.*;

/*You need to write the software to calculate the minimum number of coins required to return an amount of
        change to a user of Acme Vending machines. For example, the vending machine has coins 1,2,5 and 10
        what is the minimum number of coins required to make up the change of 43 cents?
        The coin denominations will be supplied as a parameter. This is so the algorithm is not specific to one country. You
        may not hardcode these into the algorithm, they must be passed as a parameter.
        The country’s denominations to use for the kata are:
        ● British Pound
        ○ 1,2,5,10,20,50
        ● US Dollar
        ○ 1,5,10,25
        ● Norwegian Krone
        ○ 1,5,10,20
        The kata assumes an infinite number of coins of each denomination.

*/
public class Assignment {
    static int minCoins(int[] coins, int amount)
    {
        int len=coins.length;
        Arrays.sort(coins);
        int sum=coins[len-1];
        int count=1;
        if(amount==0){
            return 0;
        }
        if(len==1){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }
            else{
                return -1;
            }
        }
        for(int i=len-1;i>=0;){
            if(sum<amount){
                sum+=coins[i];
                count++;
            }
            if(sum>amount){
                sum-=coins[i];
                i--;
                count--;
            }
            if(sum==amount){
                break;
            }
            if(i==-1){
                return -1;
            }
        }
        return count;

    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the country ");
            String country=sc.next();
            System.out.println("Enter Amount");
            int V=sc.nextInt();
            int[] coins;
            if(country.equals("US")) {
                coins= new int[]{1,5,10,25};
                V=V*100;
                System.out.println(minCoins(coins, V));
            }
            if(country.equals("British")){
                coins= new int[]{1, 2, 5, 10, 20, 50};
                V=V*113;
                System.out.println(minCoins(coins, V));
            }
            if(country.equals("Norway")){
                coins=new int[]{1,5,10,20};
                V=V*10;
                System.out.println(minCoins(coins, V));
            }
//            System.out.println(m);
//            for(int i=0;i<m;i++)
//                System.out.println(coins[i]);
//            System.out.println(V);
//            int value=minCoins(coins,m,V);
//            System.out.println("Minimum coins required is:"+value);
        }
    }

    //Example:
//if country is US and amount is 1$ so 1$=100cents so changes will be{25,25,25,25} so output will be 4
