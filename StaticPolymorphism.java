//overloading(static polymorphism at compile time)
//class AreaOfShape{
//    int area(int length,int breadth){
//        return length*breadth;
//    }
//    float area(int radius)
//    {
//        return 3.14f*radius*radius;
//    }
//        }
//public class StaticPolymorphism{
//    public static void main(String[] args) {
//        AreaOfShape as=new AreaOfShape();
//        System.out.println(as.area(10,20));
//        System.out.println(as.area(5));
//    }
//}
class Jungle{
    String animal(String tiger){
        return tiger;
    }
    String animal(String lion,String fox){
        return (lion+" "+fox);
    }
}
public class StaticPolymorphism{
    public static void main(String[] args) {
        Jungle j=new Jungle();
        System.out.println(j.animal("Tiger"));
        System.out.println(j.animal("Lion","Fox"));
    }
}
