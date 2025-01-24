package basics.class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.stars = 5;
        reviews[0] = inception;

        MovieReview darkKnight = new MovieReview();
        darkKnight.title = "다크나이트";
        darkKnight.stars = 4;
        reviews[1] = darkKnight;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 별점: " + review.stars);
        }
    }
}
