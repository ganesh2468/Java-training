import java.sql.SQLOutput;

public class OwnWrapper {
    int i;
    OwnWrapper(int i){
        this.i=i;
    }

    public String toBinary(int i) {
        System.out.println("binary");
        return Integer.toBinaryString(i);
    }
    public String toString(){
        System.out.println("string");
        return Integer.toString(i);
    }

//Testing the custom wrapper class
    public static void main(String[] args){
        OwnWrapper j=new OwnWrapper(10);
        System.out.println(j);
        System.out.println(((Object)j).getClass().getSimpleName());
    }
}
