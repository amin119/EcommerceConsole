import java.util.ArrayList;
import java.util.List;

public class ProductReview {
    private List<Review> reviews;

    public ProductReview() {
        reviews = new ArrayList<>();
    }

    public void addReview(String username, int rating, String comment) {
        Review newReview = new Review(username, rating, comment);
        reviews.add(newReview);
    }

    public void displayReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews available for this product.");
        } else {
            System.out.println("Product Reviews:");
            for (Review review : reviews) {
                System.out.println(review);
                System.out.println("----------------------------");
            }
        }
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0;
        }

        int totalRating = 0;
        for (Review review : reviews) {
            totalRating +=review.getRating();
        }

        return (double) totalRating / reviews.size();
    }


}
