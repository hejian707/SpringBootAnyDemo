package teststring;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/8/7 17:12
 */
@Slf4j
public class TestString {

    @Test
    void test(){
        boolean [][] isPass = new boolean[][]{
                {true,  true,  true,  true,  true,  true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true},
                {false, true,  true,  true,  true,  true,  true,  true},
                {false, false, true,  true,  true,  true,  true,  true},
                {false, false, false, true,  true,  true,  true,  true},
                {false, false, false, false, true,  true,  true,  true},
                {false, false, false, false, false, true,  true,  true},
                {false, false, false, false, false, false, true,  true},
                {false, false, false, false, false, false, false, true}
        };
        if (isPass[1][7] == true){
            System.out.println("true");
        }else System.out.println("false");


    }
}
