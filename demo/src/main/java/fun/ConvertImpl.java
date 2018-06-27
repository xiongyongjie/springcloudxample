package fun;

import org.springframework.beans.BeanUtils;
import vo.ClassA;
import vo.ClassB;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/25 8:55
 */
public class ConvertImpl implements Convert<ClassA, ClassB> {

    @Override
    public ClassB execute(ClassA classA) {
        ClassB clsb = new ClassB();
        BeanUtils.copyProperties(classA,clsb);
        return clsb;
    }

}
