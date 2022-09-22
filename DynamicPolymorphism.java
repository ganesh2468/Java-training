//Overriding
//class Vehicle {
//    void running(){
//        System.out.println("Vehicle is running");
//    }
//}
//class Truck extends Vehicle{
//    void running(){
//        System.out.println("Truck is running at 200km/hr");
//    }
//}
//public class DynamicPolymorphism {
//    public static void main(String[] args) {
//        Vehicle v=new Vehicle();
//        Vehicle v1=new Truck();
//        v.running();
//        v1.running();
//    }
//}
class Forest{
    void animal(String t){
        System.out.println("Tiger is in Jungle");
        System.out.println(t);
    }
}
class Earth extends Forest{
    void animal(String t){
        System.out.println("Tiger is in Earth");
        System.out.println(t);
    }
}
public class DynamicPolymorphism{
    public static void main(String[] args) {
        Forest f=new Forest();
        Forest e= new Earth();
        f.animal("a");
        e.animal("b");
    }
}
