package monoflux;

import java.math.BigDecimal;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2022/12/26 15:45
 */
public class InMemoryDataSource {

    public static final Book[] books = {
            new Book("CS 1", BigDecimal.valueOf(10.7), "CS"),
            new Book("CS 2", BigDecimal.valueOf(10.9), "CS"),

            new Book("CHILD 1", BigDecimal.valueOf(20.7), "CHILD"),
            new Book("CHILD 2", BigDecimal.valueOf(20.9), "CHILD"),

            new Book("NOVLE 1", BigDecimal.valueOf(30.7), "NOVEL"),
            new Book("NOVEL 1", BigDecimal.valueOf(30.9), "NOVEL")

    };

}
