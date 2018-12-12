package com.qf.mvc;

import com.qf.pojo.po.User;
import com.qf.pojo.vo.PageVO;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/users")
public class UserAction {
    @Autowired
    private IUserService userService;

    @ResponseBody
    @PostMapping("/listUsers")
    public PageVO listUsers(@RequestBody Map map){
        //获取当前页
        int pageIndex = 1;
        Object param1 = map.get("pageIndex");
        if (param1!=null){
            pageIndex = (int)param1;
        }
        //获取每页显示个数
        int pageSize = 5;
        Object param2 = map.get("pageSize");
        if(param2!=null){
            pageSize = (int)param2;
        }
        //求出商品总数
        List<User> users = userService.listUser();
        int total = users.size();
        //获得分页
        PageVO pageVO = userService.pageListUser(pageIndex,pageSize,total);
        System.out.println(pageVO);
        return pageVO;
    }
//    删除用户
    @DeleteMapping("/removeUser")
    public void removeUser(@RequestBody Map map){
        int id = (int)map.get("id");
        System.out.println(id);
        userService.removeUserById(id);
    }

    //批量删除用户
    @PostMapping("/removeUsers")
    public void removeUsers(@RequestBody Map map){
        String ids = (String)map.get("ids");
        System.out.println(ids);
        userService.removeUsers(ids);
    }

    //===编辑用户
    //通过id获取用户信息
    @ResponseBody
    @PostMapping("/getUserById")
    public User getUserById(@RequestBody Map map){
        User user = new User();
        int id = (int)map.get("id");
        user = userService.getUserById(id);

        return user;
    }
    @PutMapping("/editUser")
    public void editUser(@RequestBody Map map){
        User user = new User();
        user.setId((int)map.get("id"));
        user.setPassword((String)map.get("password"));
        user.setCity((String)map.get("city"));
        user.setMail((String)map.get("mail"));
        user.setDesc((String)map.get("desc"));
        user.setName((String)map.get("name"));
        user.setGender((String)map.get("gender"));

        System.out.println(user);
        userService.editUser(user);
    }

    @PostMapping("/insertUser")
    public void insertUser(@RequestBody Map map){
        User user = new User();
        user.setPassword((String)map.get("password"));
        user.setCity((String)map.get("city"));
        user.setMail((String)map.get("mail"));
        user.setDesc((String)map.get("desc"));
        user.setName((String)map.get("name"));
        user.setGender((String)map.get("gender"));

        System.out.println(user);
        userService.insertUser(user);
    }
}
