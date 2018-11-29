package Bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:14:20
 **/
@Setter
@Getter
@ToString
@Builder
@Accessors(chain = true)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userName;
    private Integer age;
}
