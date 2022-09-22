import java.util.*;

public class Holiday {
    private String name;
    private int day;
    private String month;
    public Holiday(String n,int d,String m){
        name=n;
        day=d;
        month=m;
    }
    public boolean inSameMonth(Holiday hol){
         return this.month.equals(hol.month);
    }
    public static double avgDate(Holiday[] hol){
        int sum=0;
        for(int i=0;i<hol.length;i++)
            sum+=hol[i].day;
        return ((double) sum)/hol.length;
    }

    public static void main(String[] args) {
         Holiday hol=new Holiday("Independence Day",4,"July");
         Holiday h1=new Holiday("Republic Day",5,"June");
         boolean monthCheck= hol.inSameMonth(h1);
         Holiday dates[]=new Holiday[2];
         dates[0]=hol;
         dates[1]=h1;
         for(Holiday i:dates)
             System.out.println(i.name+ i.day+" "+ i.month);
         double avg=avgDate(dates);
         System.out.println(avg);
         System.out.println(monthCheck);
    }
}
