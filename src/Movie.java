import java.util.ArrayList;

public class Movie {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    private String title;
    private String studio;
    private String rating;
    Movie(  String title, String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(  String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    public ArrayList<Movie> getPG(Movie[] arr){
        ArrayList<Movie> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].rating ==  "PG")
                result.add(arr[i]);
        }
        return result;
    }
}
