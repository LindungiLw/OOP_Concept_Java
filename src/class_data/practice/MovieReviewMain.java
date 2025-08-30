package class_data.practice;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview = new MovieReview();
        movieReview.title = "Movie1";
        movieReview.review = "Review1";
        System.out.println(movieReview.title + " " + movieReview.review);
    }
}