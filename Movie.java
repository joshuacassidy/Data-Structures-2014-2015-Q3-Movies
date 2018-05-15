public class Movie {

    private String movieTitle;
    private int year;

    public Movie(String movieTitle, int year) {
        this.movieTitle = movieTitle;
        this.year = year;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getYear() {
        return year;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{movieTitle= " + movieTitle  + ", year=" + year+"}";
    }
}
