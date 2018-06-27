package comb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/26 19:54
 */
public class StringCombinerTest {

    public static void  main(String[] args){
        List<String> res = new ArrayList<>();
        res.add("a");
        res.add("b");

        double[] s = new double[10];
        Arrays.parallelSetAll(s,x->x);
        Arrays.stream(s).forEach(e->System.out.println(e));
    }
}
