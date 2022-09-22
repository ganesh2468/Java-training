import java.util.Scanner;
//
//public class MaxWaterStorage {
//    public static int maxArea(int[] height) {
//        int left = 0;
//        int right = height.length - 1;
//        int max = 0;
//        while(left < right){
//            int w = right - left;
//            int h = Math.min(height[left], height[right]);
//            int area = h * w;
//            max = Math.max(max, area);
//            if(height[left] < height[right]) left++;
//            else if(height[left] > height[right]) right--;
//            else {
//                left++;
//                right--;
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        for(int i=0;i<n;i++)
//            arr[i]=sc.nextInt();
//        System.out.println(maxArea(arr));
//    }
//}
public class MaxWaterStorage {
    public static int maxArea(int[] H) {
        int ans = 0, i = 0, j = H.length-1, res = 0;
        while (i < j) {
            if (H[i] <= H[j]) {
                res = H[i] * (j - i);
                i++;
            } else {
                res = H[j] * (j - i);
                j--;
            }
            if (res > ans) ans = res;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(maxArea(arr));
    }

}