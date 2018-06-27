package ann.test;

import ann.dao.PriceRedisDao;
import ann.ro.PriceRO;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 16:29
 */
public class Test {
    public static  void  main(String[] args){
        PriceRedisDao redisEntity = new PriceRedisDao();
        PriceRO ro = new PriceRO();
        ro.setPname("name");
        ro.setPrice(2.33);
        ro.setAddress("地址信息");
        redisEntity.save(ro);
        Long l = new Long(4597322288264642569l);
        System.out.println(l+","+Long.MAX_VALUE);

        System.out.println(new BigDecimal(0).multiply(new BigDecimal(100))
                .setScale(0, BigDecimal.ROUND_HALF_UP).intValue());
    }
}
