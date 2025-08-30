package class_data.practice;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "Inception";
        movieReview1.review = "Life is an infinite loop!";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "About Time";
        movieReview2.review = "Time travel is a game!";
        MovieReview[] movieReviews = {movieReview1, movieReview2};
        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("Movie Title: " + movieReviews[i].title + ", Review: " + movieReviews[i].review);
        }
    }
}