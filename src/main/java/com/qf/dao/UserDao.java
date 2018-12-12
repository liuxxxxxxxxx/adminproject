package com.qf.dao;

import com.qf.pojo.po.User;
import com.qf.pojo.vo.PageVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> listUser();

    void removeUserById(int id);

    List<User> pageListUser(@Param(value="offset")int offset, @Param(value = "pageSize") int pageSize);

    User getUserById(int id);

    void editUser(User user);

    void insertUser(User user);

    void removeUsers(List<String> list);
}
