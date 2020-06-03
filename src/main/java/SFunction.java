import java.io.Serializable;
import java.util.function.Function;

/**
 * Created by yanyongjun on 2020/5/16.
 */
@FunctionalInterface
public interface SFunction<T, R> extends Function<T, R>, Serializable {
}