public class GenericsTraining<T>//t-datatype
{
    T value;

    public GenericsTraining(T value) {//shortcut-alt+insert for creating constructor
        this.value = value;
    }
    public void printable(){
        System.out.println(value);
    }
    public static void main(String[] args){
        GenericsTraining<Integer> obj=new GenericsTraining<>(2);
        GenericsTraining<String> obj1=new GenericsTraining<>("two");
        obj.printable();
        obj1.printable();
    }
}
