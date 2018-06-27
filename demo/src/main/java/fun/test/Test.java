package fun.test;

import fun.Convert;
import fun.ConvertImpl;
import vo.ClassA;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/25 8:58
 */
public class Test {
    public static void main(String[] ar) {
        ConvertImpl convert = new ConvertImpl();
        ClassA classA = new ClassA();
        classA.setAddress("xxx");
        classA.setName("A classs");
        System.out.println(convert.execute(classA));

        Convert convert1 = new Convert() {
            @Override
            public Object execute(Object o) {
                return null;
            }
        } ;


    }
}
