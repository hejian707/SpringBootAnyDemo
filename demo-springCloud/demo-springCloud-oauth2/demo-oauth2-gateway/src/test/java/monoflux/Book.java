package monoflux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2022/12/26 15:15
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private BigDecimal price;
    private String category;


}
