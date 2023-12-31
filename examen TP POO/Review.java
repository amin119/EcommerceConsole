public class Review {
    private String username;
    private int rating;
    private String comment;

    public Review(String username, int rating, String comment) {
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    
    public String toString() {
        return "Username: " + username +"\nRating: " + rating +"\nComment: " + comment;
    }
}
