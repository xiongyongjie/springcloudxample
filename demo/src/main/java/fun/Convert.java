package fun;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/25 8:50
 */
@FunctionalInterface
public interface Convert<A,B> {
    /**
     * 接口定义
     * @param a
     */
    public B execute(A a);

}
