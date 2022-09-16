public class GenericMethod {
    public<T,U> void generics(T []arr, U name)
    {
        for(T item:arr)
            System.out.println("Items in array are:"+item);
        System.out.println("The other datatype member is:"+name);
    }

    public static void main(String[] args) {
        String [] arr={"one","two"};
        char anyChar='R';
        //Integer []arr={1,2,3,4};
        //String anyChar="Hi";
        GenericMethod obj=new GenericMethod();
        obj.generics(arr,anyChar);

    }
}
/*
class RegularFaculty {
    String name="Ritika";
    int n=5;
    public void info()
    {
        System.out.println(name+" "+n);
    }
}
public class GC<T extends RegularFaculty>
{
    T value;

    public GC(T value)
    {
        this.value = value;
    }
    public void pv()

    {
        value.info();
    }

    public static void main(String[] args) {
        RegularFaculty regularFaculty=new RegularFaculty();
        GC<RegularFaculty> n=new GC<>(regularFaculty);
        n.pv();
    }

}

 */
