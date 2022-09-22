import java.util.*;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        char[] cr = s.toCharArray();
        int si =0;
        int ei =0;
        int n = cr.length;
        int sum =0;
        Boolean flag = false;
        String str1= "";
        for (int i =0; i < n; i++){
            for(int j=n-1; j>=0 ; j--){
                if(cr[i]==cr[j]){
                    si =i;
                    ei =j;
                    while(si <= ei){
                        if(cr[si] == cr[ei]){
                            si++;
                            ei--;
                            flag = true;
                        }else{
                            flag = false;
                            break;
                        }
                    }
                    if(flag ==true && j-i+1 > sum){
                        sum = j-i+1;
                        str1 = s.substring(i,j+1);
                    }
                }
            }
        }
        return str1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.next();
        String str=longestPalindrome (s);
        System.out.println(str);
    }
    }
