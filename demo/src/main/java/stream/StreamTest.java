package stream;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: 熊永杰
 * @CreateDate: 2018/6/26 17:27
 */
public class StreamTest {
    public static void main(String[] aergss){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(33);
        list.add(4);
        Integer total = (Integer) Stream.of(list.toArray())
                .peek(item->System.out.println("as:"+item))
                .reduce(1, (sum, item) -> (Integer) sum + (Integer) item);


        System.out.println(total);
        execute(()->"mmmm");
    }

    public static void execute(Supplier<String> supplier) {
        System.out.println("Exec:"+supplier.get());
    }

    public void getValues(BinaryOperator<BigDecimal> bigDecimalBinaryOperator) {

    }
}
