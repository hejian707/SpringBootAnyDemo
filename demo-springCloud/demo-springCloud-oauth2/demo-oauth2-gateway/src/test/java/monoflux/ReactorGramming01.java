package monoflux;

import lombok.var;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.util.Comparator;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2022/12/26 15:32
 */
public class ReactorGramming01 {

    public static Flux<Book> getMostExpensiveBooksByCategroyReactive(Flux<Book> books) {
        return books.collectMultimap(Book::getCategory)
                .flatMapMany(m -> Flux.fromIterable(m.entrySet()))
                .flatMap(e -> Flux.fromIterable(e.getValue())
                    .sort(Comparator.comparing(Book::getPrice).reversed())
                    .next());
    }


    @Test
    public void mainTest() {
        Flux<Book> pipeline = getMostExpensiveBooksByCategroyReactive(Flux.just(InMemoryDataSource.books));

        pipeline = pipeline.doOnNext(System.out::println);
        pipeline.subscribe();
    }
}
