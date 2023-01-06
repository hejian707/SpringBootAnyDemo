package cn.edu.whut.demospringbootreactor;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

import java.util.function.Consumer;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2022/12/30 14:27
 */

public class TestFlux {


    @Test
    void testGgenerate() {
        BaseSubscriber<String> subscriber = new SampleSubscriber();
        Flux<String> flux = Flux.generate(
                () -> 1,  // Callable
                (state, sink) -> {    //BiFunction
                    sink.next("3 x " + state + " = " + 3 * state);
                    if (state == 10) sink.complete();
                    return state + 1;
                });
        flux.subscribe(subscriber);
    }

    @Test
    public void testFluxCreate() {
        //这个Flux创建和使用just方法本质没有区别，写死了生成的数据，不能体现出create的作用
        Flux.create(sink -> {
            for (int i = 0; i < 10; i++) {
                sink.next(i);
            }
            sink.complete();
        }).subscribe(System.out::println);
    }

    FluxSink<String> outSink;
    @Test
    void testFluxCreate1() {
        Flux<String> f = Flux.create(sink -> {
            //将 sink 开放出去
            outSink = sink;
        });
        f.subscribe(e -> System.out.println(e));
        //do something

        //下发元素
        outSink.next("我来了");

        outSink.next("我来了2");
    }


    Consumer<String> producer;
    @Test
    //testFluxCreate1的升级方案，并不直接将sink暴露，而是使用了一个 Consumer 进行封装。
    //官网的例子是在create的lambda表达式中创建一个Listener并将它注册到监听器中。而这个Listener在事件触发的时候就会调用sink的下发元素的方法。
    public void testFluxCreate2() {
        Flux.create(sink -> {
            producer = nextData -> sink.next(nextData);
        }).subscribe(e -> System.out.println(e));

        //do something

        //下发元素
        producer.accept("我来了");

        producer.accept("我来了2");

    }

}

class SampleSubscriber extends BaseSubscriber<String> {
    protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("OnSubscribe");
        subscription.request(Long.MAX_VALUE);
    }
}

