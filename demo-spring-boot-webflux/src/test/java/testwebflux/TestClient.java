package testwebflux;

import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/1/5 14:28
 */
public class TestClient {

    @Test
    void testClient() {
        WebClient webClient = WebClient . create( );
        Mono<String> mono = webClient.get().uri("https://localhost:8081")
                .retrieve()
                .bodyToMono(String.class);
        mono.subscribe(System.out::println);
    }

    @Test
    void testClientBodyJson() {
        WebClient webClient = WebClient.create("http://localhost:8081");

        Map<String, Object> user = new HashMap<>();
        user.put(" name", "hello");
        user.put("id","123");

        Mono<Void> mono = webClient
                .post()
                .uri("/user/add")
                .bodyValue(user)    //参数user也可以是Json字符串
                .retrieve()
                .bodyToMono(Void.class);
        mono.block();
    }

}
