package testjava;

import cn.edu.whut.demospringbootreactor.DemoSpringBootWebFluxApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/1/3 15:13
 */
@SpringBootTest(classes = DemoSpringBootWebFluxApplication.class)
public class TestCompletableFuture {

    @Test
    void testCompletableFuture() {

        //任务1：洗水壶->烧开水
        // runAsync基于Consumer接口，无返回值
        CompletableFuture<Void> f1 = CompletableFuture
                .runAsync(() -> {
                    System.out.println("T1:洗水壶...");
                    sleep(1, TimeUnit.SECONDS);

                    System.out.println("T1:烧开水...");
                    sleep(15, TimeUnit.SECONDS);
                });

        //任务2：洗茶壶->洗茶杯->拿茶叶
        // SupplyAsync基于Supplier接口，有返回值
        CompletableFuture<String> f2 = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("T2:洗茶壶...");
                    sleep(1, TimeUnit.SECONDS);

                    System.out.println("T2:洗茶杯...");
                    sleep(2, TimeUnit.SECONDS);

                    System.out.println("T2:拿茶叶...");
                    sleep(1, TimeUnit.SECONDS);
                    return "龙井";
                });


        //任务3：任务1和任务2完成后执行：泡茶
        CompletableFuture<String> f3 = f1.thenCombine(f2, new BiFunction<Void, String, String>() {
            @Override
            public String apply(Void __, String tf) {
                System.out.println("T1:拿到茶叶:" + tf);
                System.out.println("T1:泡茶...");
                return "上茶:" + tf;
            }
        });
        //等待任务3执行结果
        System.out.println(f3.join());
    }

   void sleep(int t, TimeUnit u){
        try {
            u.sleep(t);
        } catch (InterruptedException e) {
        }
    }

}
