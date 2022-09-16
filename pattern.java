public class pattern {
    public static void main(String args[]){
        for(int i=0;i<5;i++) {
            int alphabet=65;
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet));
                alphabet++;
            }
            System.out.println();
        }
    }
}
