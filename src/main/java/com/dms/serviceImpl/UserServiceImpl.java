package com.dms.serviceImpl;

import com.dms.service.UserService;
import org.springframework.stereotype.Service;

import javax.jnlp.UnavailableServiceException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by laoli on 2017/6/28.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public List<String> getAllUsernames() {
        List<String> users = new ArrayList<String>();
        users.add("MarK");
        users.add("Ken");
        users.add("Fowafolo");
        return users;
    }

    @Override
    public String getName() {
        return "this is from service";
    }


}
