import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by yanyongjun on 2020/5/16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        doConsume(System.out::println);
    }

    private static void doConsume(SerializableConsumer<Long> consumer) throws Exception {
        consumer.accept(123L);
        // 直接调用writeReplace
        Method writeReplace = consumer.getClass().getDeclaredMethod("writeReplace");
        writeReplace.setAccessible(true);
        Object sl = writeReplace.invoke(consumer);
        SerializedLambda serializedLambda = (SerializedLambda) sl;
        System.out.println(serializedLambda);
    }


//    public static <T, S> T map(S source, FilterCallBack<T, S> callBack){
//        return callBack.from(source);
//    }

}
