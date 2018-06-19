package ann;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/19 18:50
 */
public interface IRedisEntity<T> {
    public void save(String key,String entity);

    public String getByKey(String key);

}
