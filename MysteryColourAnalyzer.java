import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public interface MysteryColourAnalyzer {
    static int numberOfDistinctColors(List<Color> mysteryColors) {
        ArrayList<Color> distinctColors = new ArrayList();
        for (int i = 0; i < mysteryColors.size(); i++) {
            Color thisColor = (Color) mysteryColors.get(i);
            if (distinctColors.indexOf(thisColor) == -1) {
                distinctColors.add(thisColor);
            }
        }
        return distinctColors.size();
    }

    static int colorOccurrence(List mysteryColors, Color color) {
        int occurrences = 0;
        ArrayList distinctColors = new ArrayList();
        for (int i = 0; i < mysteryColors.size(); i++) {
            Color thisColor = (Color) mysteryColors.get(i);
            if (thisColor.equals(color)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    enum Color {
        RED, BLUE, GREEN
    }
        public static void main(String[] args) {
            List<Color> mysteryColors = new ArrayList<>();
            mysteryColors.add(Color.RED);
            mysteryColors.add(Color.BLUE);
            mysteryColors.add(Color.GREEN);
            mysteryColors.add(Color.GREEN);
            int distn = numberOfDistinctColors(mysteryColors);
            System.out.println(distn);
            int occ = colorOccurrence(mysteryColors, Color.GREEN);
            System.out.println(occ);
        }
    }


//import java.util.*;
//interface DistinctColor
//{
//    int numberOfDistinctcolor(List<Color> mysterycolors);
//    int colorOccurence(List<Color> mysterycolors, Color color);
//
//}
//public class MysteryColourAnalyzer implements DistinctColor
//{
//    @Override
//    public int numberOfDistinctcolor(List<Color> mysterycolors)
//    {
//        HashSet<Color> hset = new HashSet<>(mysterycolors);
//        return hset.size();
//    }
//
//    @Override
//    public int colorOccurence(List<Color> mysterycolors, Color color)
//    {
//        int count=0;
//        for(int i=1;i<mysterycolors.size();i++)
//        {
//            if(mysterycolors.get(i).equals(color))
//            {
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args)
//    {
//        ArrayList<Color> list= new ArrayList<Color>(4);
//        list.add(Color.Red);
//        list.add(Color.Blue);
//        list.add(Color.Green);
//        list.add(Color.Blue);
//        System.out.println(list);
//        int DistinctMystery=new MysteryColourAnalyzer().numberOfDistinctcolor(list);
//        System.out.println(DistinctMystery);
//        int occurences=new MysteryColourAnalyzer().colorOccurence(list,Color.Blue);
//        System.out.println(occurences);
//    }
//}
//enum Color
//{
//    Red,
//    Blue,
//    Green;
//}
