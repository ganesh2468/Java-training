import java.util.Scanner;
public class MagicSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int arr[][] = new int[n+1][n+1];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int digsum=0,digsum2=0;
        boolean res=true;
        int rowsum[]=new int[n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                rowsum[i]= rowsum[i] + arr[i][j];
            }
            //System.out.println(rowsum[i]);
            }
        boolean result;
        for(int i=0;i<n;i++) {
            if (rowsum[i] != rowsum[n - i - 1]) {
                result = false;
                //System.out.println(result);
            } else {
                result = true;
                res=true;
                //System.out.println(result);
            }
            if (result == false) {
                //System.out.println("not a magic");
                res = false;
            }
            //System.out.println(res);
        }

        boolean res1=true;
       int colsum[]=new int[n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                colsum[i]= colsum[i] + arr[j][i];
            }
            //System.out.println(colsum[i]);
            }
            for(int i=0;i<n;i++) {
            if (colsum[i] != colsum[n - i - 1]) {
                result = false;
                //System.out.println(result);
            } else {
                result = true;
                res1=true;
                //System.out.println(result);
            }
            if (result == false) {
                //System.out.println("not a magic");
                res1 = false;
                break;
            }
            //System.out.println(res);
        }
        for (int i = 0; i <n; i++) {
//            for (int j = 0; j < n; j++) {
                    digsum=digsum+arr[i][i];
                    digsum2=digsum2+arr[i][n-1-i];
//            }
        }
            boolean res2=true;
            if (digsum!=digsum2) {
                result = false;
                //System.out.println(result);
            } else {
                result = true;
                //System.out.println(result);
                res2=true;
            }
            if (result == false) {
                //System.out.println("not a magic");
                res2 = false;
            }
            if(res==true&&res1==true&&res2==true)
                System.out.println("Magic");
            if(res==false||res1==false||res2==false)
                System.out.println("not a magic");
    }
    }
/*
static String checkNumber(int [][]arr) {
    int sum_r=0,sum_c=0,sum_dl=0,sum_dr=0,n=arr.length;
    for(int i=0;i<arr.length;i++) {
        for(int j=0;j<arr.length;j++) {
            sum_r=sum_r+arr[i][j];
            sum_c=sum_c+arr[j][i];
        }
        sum_dl=sum_dl+arr[i][i];
        sum_dr=sum_dr+arr[i][n-1];
        //System.out.println(arr[i][n-1]);
        n=n-1;
    }

    //System.out.println("diagonal sum dl "+sum_dl+" d sum dr "+sum_dr+" sum_r "+sum_r+" sum_c "+sum_c);
    if(sum_r==sum_c && sum_dr==sum_dl)
        return "MagicSqaure";
    else
        return "Not MagicSqaure";
 */
