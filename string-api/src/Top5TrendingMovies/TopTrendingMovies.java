package Top5TrendingMovies;

import java.util.*;

public class TopTrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 8.5, 2023),
                new Movie("Movie B", 9.2, 2024),
                new Movie("Movie C", 7.9, 2019),
                new Movie("Movie D", 9.0, 2022),
                new Movie("Movie E", 8.7, 2023),
                new Movie("Movie F", 9.5, 2024),
                new Movie("Movie G", 8.9, 2021)
        );

        movies.stream()
                .filter(m -> m.year >= 2021)                     // filter recent movies
                .sorted((a, b) -> Double.compare(b.rating, a.rating)) // sort by rating desc
                .limit(5)                                        // top 5
                .forEach(System.out::println);
    }
}