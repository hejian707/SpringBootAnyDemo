package cn.edu.whut.demospringbootreactor;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2022/12/30 10:28
 */
@SpringBootTest
public class TestBackPressure {

    @Test
    void testBackPressure() {

        Subscriber<Integer> subscriber1 = new Subscriber<Integer>() {
            private Subscription subscription;

            @Override
            public void onSubscribe(Subscription subscription) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Subcriber接收到消息");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };
        Flux<Integer> flux = Flux.just();


//        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {
//            private Flow.Subscription subscription;
//
//            @Override
//            public void onSubscribe(Flow.Subscription subscription) {
//                this.subscription = subscription;
//                //向数据发布者请求一个数据
//                this.subscription.request(1);
//            }
//
//            @Override
//            public void onNext(String item) {
//                System.out.println("接收到 publisher 发来的消息了：" + item);
//                //接收完成后，可以继续接收或者不接收
//                //this.subscription.cancel();
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                this.subscription.request(1);
//            }
//
//            @Override
//            public void onError(Throwable throwable) {
//                //出现异常，就会来到这个方法，此时直接取消订阅即可
//                this.subscription.cancel();
//            }
//
//            @Override
//            public void onComplete() {
//                //发布者的所有数据都被接收，并且发布者已经关闭
//                System.out.println("数据接收完毕");
//            }
//        };
//        publisher.subscribe(subscriber);
//        for (int i = 0; i < 500; i++) {
//            System.out.println("i--------->" + i);
//            publisher.submit("hello:" + i);
//        }
//        //关闭发布者
//        publisher.close();
//        new Scanner(System.in).next();
    }
}
