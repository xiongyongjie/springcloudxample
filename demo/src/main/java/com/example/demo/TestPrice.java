package com.example.demo;


import org.omg.CORBA.INTERNAL;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * date: 2018/5/24
 * user:xiongyongjie
 * description:
 **/
public class TestPrice {

    public  static void main(String[] aerg){
        Double s =  Double.parseDouble("19.9") * 100;
        System.out.println(s);
        BigDecimal bg  =new BigDecimal("199");
        BigDecimal bm = bg.multiply(new BigDecimal(0.1));
       System.out.println("bm..:"+bg.doubleValue());

        System.out.println("bm..::"+(bm.setScale(0,BigDecimal.ROUND_HALF_UP).intValue()));


        //474745683686006784,19.9,56.0,7.46
        BigDecimal bg2  =new BigDecimal("10.00");
        BigDecimal bm3 = bg2.multiply(new BigDecimal(100));
       System.out.println(bm3.intValue());

        Map<String, String> map = new HashMap<String, String>();
        map.put("111", "v111");
        map.put("222","v222");
        map.put("333","v333");
        System.out.println(map.keySet().parallelStream().collect(Collectors.toList()));

        int i = -100;
        BigDecimal by = new BigDecimal(i);
        System.out.println(by.add(new BigDecimal(20)).intValue());


        BigDecimal yuan = new BigDecimal(19999).divide(new BigDecimal(100));
       yuan.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();

        //生成流数据不断输出<0.5的随机数
//          Stream.generate(() -> Math.random())
//                  .filter(item->item.doubleValue()<0.5)
//                  .forEach(item->System.out.println(item.doubleValue()));


        List<Integer> ints =  Arrays.asList(4,2,3,4,5,6,11,1,77,49);

//        System.out.println(sum(ints));
        //Stream.of( new Optional(ints.get(2)).orElse(new Integer(12)));
        System.out.println(new BigDecimal("135000").compareTo(new BigDecimal(135000)));

    }

    /**
     * 求和运算
     * @param ints
     * @return
     */
    public static Integer sum(List<Integer> ints) {
        return ints.stream()
                .reduce((sum,item)->new BigDecimal(sum)
                        .add(new BigDecimal(item))
                        .intValue())
                 .get();
    }


    public static List<Student> getList() {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student std = new Student();
            std.setAge(i);
            std.setName("name" + i);
            list.add(std);
        }
        return list;
    }

    /**
     * 测试
     * @param p1
     * @param p2
     */
    public static void optest(Optional<Integer> p1,Optional<String> p2){
        System.out.println(p1.isPresent());
        System.out.println(p2.isPresent());

    }

}
