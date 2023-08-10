import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/8/2 18:20
 */

public class TestGson {

    @Test
    void testSerializeDeserialize() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User(1, 2);
        System.out.println(objectMapper.writeValueAsString(user));

    }


}
@Data
@AllArgsConstructor
class User {
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer page;

    private Integer limit;
}
