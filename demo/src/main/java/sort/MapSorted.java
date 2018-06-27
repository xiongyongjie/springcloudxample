package sort;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/26 15:00
 */
public class MapSorted {
    public static void main(String[] args) {
        Map<String, Long> finalMap = new LinkedHashMap<>();
        Map<String, String> map = new HashMap<>();
        map.put("2018-09","1");
        map.put("2018-03", "2");
        map.put("2017-01", "3");
        map.put("2017-23","mm");
        map.put("2011-22","");
        map.put("2018-11","1");
        map.put("2018-88", "2");

        Map<String,String> Ascsorted = new LinkedHashMap<>();
        //小到大排序
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).forEachOrdered(e->Ascsorted.put(e.getKey(),e.getValue()));
        System.out.println(Ascsorted);
        System.out.println("2011-12".compareTo("2011-12"));


        //大到排序
        Map<String,String> Descsorted = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, String>comparingByKey().reversed()).forEachOrdered(e-> Descsorted.put(e.getKey(),e.getValue()));
        System.out.println(Descsorted);
    }
}
