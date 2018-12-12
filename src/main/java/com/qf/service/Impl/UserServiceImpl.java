package com.qf.service.Impl;

import com.qf.dao.UserDao;
import com.qf.pojo.po.User;
import com.qf.pojo.vo.PageVO;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listUser() {
        try{
            return userDao.listUser();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PageVO pageListUser(int pageIndex,int pageSize,int total) {
        //设置
        PageVO pageVO = new PageVO();
        pageVO.setPageIndex(pageIndex);
        pageVO.setPageSize(pageSize);
        pageVO.setTotal(total);
        pageVO.setOffset((pageVO.getPageIndex()-1)*pageVO.getPageSize());
        int offset = pageVO.getOffset();
        System.out.println(offset);
        List<User> users = null;

        try{
            users = userDao.pageListUser(offset,pageSize);
            pageVO.setDate(users);
        }catch (Exception e){
            e.printStackTrace();
        }

        return pageVO;
    }

    @Override
    public void removeUserById(int id) {
        try{
            userDao.removeUserById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void removeUsers(String ids) {
        try{
            String[] split = ids.split(",");
            List<String> list = new ArrayList();
            for (int i=0;i<split.length;i++){
                list.add(split[i]);
            }
            userDao.removeUsers(list);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //
    @Override
    public User getUserById(int id) {
        try{
            return userDao.getUserById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void editUser(User user) {
        try{
            userDao.editUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertUser(User user) {
        try{
            userDao.insertUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
