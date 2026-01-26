public class Movie {
    private String title;
    private int minutes;
    private String rating;

    Movie(String title,int minutes,String rating){
        this.title = title;
        this.minutes = minutes;
        this.rating = rating;
    }
    Movie(){
        this("",0,"");
    }
    String getTitle(){
        return this.title;
    }
    public String toString(){
        return title + " (" + rating + ", " + minutes + " mins)";
    }
}