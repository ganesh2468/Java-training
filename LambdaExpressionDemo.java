//interface  CheckLength{
//    void test();
//}
//public class LambdaExpressionDemo {
//    public static void main(String[] args) {
//        CheckLength l=()->
//                System.out.println("Hello");
//        //{System.out.println("Hello");};
//        l.test();
//    }
//}
interface  CheckLength{
        int op(int a,int b);
    }

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        CheckLength l=(a,b)->a*b;
        System.out.println(l.op(10,2));
//        CheckLength lp=new CheckLength() {
//            @Override
//            public int op(int a, int b) {
//                return a*b;
//            }
//        };
//        System.out.println(lp.op(10,2));
    }
}
