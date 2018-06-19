package ann.ro;

import ann.RedisRo;
import ann.keyann.Key;
import lombok.Data;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 16:45
 */
@Data
@Key(key = "PRICE:price")
public class PriceRO extends RedisRo {
    private String pname;
    private Double price;
}
