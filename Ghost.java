import java.lang.Math;
public class Ghost {
    String color(){
        String[] colors ={"white", "yellow", "purple", "red"};
        int randoms= (int) (Math.random()*colors.length);
        return colors[randoms];
    }
    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        System.out.println(ghost.color());
    }
}
