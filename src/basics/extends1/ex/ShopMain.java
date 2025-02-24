package basics.extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "lee", "12345");
        Album album = new Album("ALBUM", 15000, "JIN");
        Movie movie = new Movie("MOVIE", 12000, "DIRECTOR", "ACTOR");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
