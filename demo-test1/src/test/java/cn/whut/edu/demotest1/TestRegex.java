package cn.whut.edu.demotest1;

import org.junit.jupiter.api.Test;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/4/7 11:20
 */
public class TestRegex {

    @Test
    void testReg1() {
        String version = "mongodb 43.0";
        Matcher mat = Pattern.compile("(mongodb)\\s*(\\d+\\.\\d+)(\\.\\d+)*").matcher(version.toLowerCase());
        if (mat.find()) {
            System.out.println(mat.group(2));
        }
    }

    @Test
    void test2() {
//        String version = "ee-6.0";
        String protocal = "redis 6.0";
//        String[] split = version.split(" ");
//        System.out.println(protocal.substring((protocal.substring(0, protocal.indexOf(" "))).length()+1));
        Matcher mat = Pattern.compile("(redis|memcached)\\s*(\\d+\\.\\d+)(\\.\\d+)*").matcher(protocal.toLowerCase());
        if (mat.find()) {
            System.out.println(mat.group(2));;
        }
        System.out.println(protocal);

    }

    @Test
    void test32() {
        String timezone = "22:00-00:00";
        Integer start = Integer.parseInt(timezone.substring(0,2));
        Integer end = Integer.parseInt(timezone.substring(6,8));
        if (start == 23){
            if (!end.equals(0)){
                System.out.println("timezone,备份时间区间格式错误");
            }
        }  else {
            if ((end-start) != 1){
                System.out.println("timezone,备份时间区间格式错误");
            }
        }
        System.out.println("ok");
    }
    @Test
    void test33(){
        System.out.println(String.format("The backup file does not exist: %s", "111"));
    }




}
