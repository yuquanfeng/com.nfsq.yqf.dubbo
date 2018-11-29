package api;

import Bean.User;
import Bean.YQFResult;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:14:27
 **/
public interface UserService {
    YQFResult<User> selectUser(String userName);
}
