import java.io.Serializable;

/**
 * Created by yanyongjun on 2020/5/16.
 */
public interface SerializableConsumer<T> extends Serializable {
    void accept(T t);
}
