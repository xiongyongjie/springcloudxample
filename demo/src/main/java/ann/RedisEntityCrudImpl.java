package ann;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 18:53
 */
public class RedisEntityCrudImpl implements IRedisEntity<Jedis>{

    @Override
    public void save(String key,String entity) {
        System.out.println("从reids保存成功,key:"+key);
    }

    @Override
    public String getByKey(String key) {
        System.out.println("从redis获取成功");
        return null;
    }
}
