package ann.test;

import ann.dao.PriceRedisDao;
import ann.ro.PriceRO;

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
        redisEntity.save(ro);
    }
}
