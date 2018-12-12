package com.qf.service;

import com.qf.pojo.po.User;
import com.qf.pojo.vo.PageVO;

import java.util.List;

public interface IUserService {
    List<User> listUser();

    void removeUserById(int id);

    PageVO pageListUser(int pageIndex,int pageSize,int total);

    User getUserById(int id);

    void editUser(User user);

    void insertUser(User user);

    void removeUsers(String ids);
}
