public class OwnWrapper {
    int i;
    OwnWrapper(int i){
        this.i=i;
    }
    public String toString(){
        return Integer.toString(i);
    }
    public static void main(String[] args){
        OwnWrapper j=new OwnWrapper(10);
        System.out.println(j);
        System.out.println(((Object)j).getClass().getSimpleName());
    }
}
