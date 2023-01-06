package cn.edu.whut.demospringbootreactor;

import org.junit.Test;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/1/6 14:22
 */
public class TestSchedulers {

    @Test
    public void testSchedulers() {
        Schedulers.boundedElastic();
    }

    @Test
    public void testPublishOn() throws InterruptedException {
        Scheduler s = Schedulers.newParallel("parallel-scheduler", 4);
        Flux<String> flux = Flux
                .range(1, 2)
                .map(i -> {
                    System.out.println("publishOn之前："+Thread.currentThread());
                    return 10 + i;})
                .publishOn(s)
                .map(i -> {
                    System.out.println("publishOn之后："+Thread.currentThread());
                    return "value " + i;});
      Thread t = new Thread(() -> {
            System.out.println("subscribe："+Thread.currentThread());
            flux.subscribe(System.out::println);
        });
      t.setName("匿名线程");
      t.start();
      t.join();
    }


}
