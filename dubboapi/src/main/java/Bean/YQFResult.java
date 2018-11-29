package Bean;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:14:24
 **/
@Getter
@Setter
public class YQFResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private T data;
    private Boolean success;
    private String message;

}
