public class Movie {
    private final String title;
    private final String studio;
    private final String rating;
    public Movie(String t,String s,String r){
        title=t;
        studio=s;
        rating=r;
    }
    public Movie(String t,String s){
        title=t;
        studio=s;
        rating="PG";
    }
    public static Movie[] getPG(Movie[] mov) {
        Movie[] pgMov = new Movie[mov.length];
        int newArrayIndex = 0;
        for (Movie movie : mov) {
            if (movie.rating.contains("PG")) {
                pgMov[newArrayIndex] = movie;
                newArrayIndex++;
            }
        }
        return pgMov;
    }

    public static void main(String[] args) {
        Movie mov = new Movie("Casino Royale","Eon Productions","PG");
        Movie mov1 = new Movie("Royale","Eon Productions","PG-13");
        Movie[] pg =new Movie[2];
        pg[0]=mov;
        pg[1]=mov1;
            Movie[] results = getPG(pg);
            for(int i=0; i < results.length; i++){
                if(results[i]!=null){
                System.out.println(results[i].title + " "+results[i].studio+" "+results[i].rating);}
            }

    }

}
