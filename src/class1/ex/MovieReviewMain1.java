package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.stars = 5;

        MovieReview darkKnight = new MovieReview();
        darkKnight.title = "다크나이트";
        darkKnight.stars = 4;

        System.out.println("영화 제목: " + inception.title + ", 별점: " + inception.stars);
        System.out.println("영화 제목: " + darkKnight.title + ", 별점: " + darkKnight.stars);
    }
}
