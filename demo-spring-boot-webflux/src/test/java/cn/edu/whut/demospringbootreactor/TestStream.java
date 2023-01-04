package cn.edu.whut.demospringbootreactor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class TestStream {

    @Test
    void contextLoads() {
    }

    @Test
    void testStream_flatMap() {
        Stream<Integer> s = Stream.of(new Integer[]{1, 2, 3}, new Integer[]{4, 5, 6}, new Integer[]{7, 8, 9})
                .flatMap(i -> Arrays.stream(i));
        s.forEach(System.out::println);
    }

    @Test
    void testStream_collect() {
        List<Integer> list = Stream.of(1, 2, 3, 4).filter(p -> p > 2).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * reduce 的参数是 BinaryOperator，这个接收两个参数，
     * 第一个参数是之前计算的结果，第二个参数是本次参与计算的元素，两者累加求和。
     */
    @Test
    void testStream_reduce() {
        Optional<Integer> optional = Stream.of(1, 2, 3, 4).reduce((i, j) -> {
            System.out.println("i:"+i+"   j:"+j);
            return i + j;
        });
        System.out.println(optional);

    }

}
