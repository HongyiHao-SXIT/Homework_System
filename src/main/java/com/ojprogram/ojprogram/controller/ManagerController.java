package com.ojprogram.ojprogram.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ojprogram.ojprogram.common.api.R;
import com.ojprogram.ojprogram.common.exception.ServiceException;
import com.ojprogram.ojprogram.common.utils.AuthUtil;
import com.ojprogram.ojprogram.entity.Manager;
import com.ojprogram.ojprogram.entity.User;
import com.ojprogram.ojprogram.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Manager")
public class ManagerController {

    @Autowired
    private ManagerMapper managerMapper;

    @GetMapping("/loginOut")
    public R loginOut() {
        AuthUtil.clear();
        return R.success("操作成功");
    }

    @GetMapping("/current")
    public R current() {
        User user = AuthUtil.getUser();
        return R.data(user);
    }

    @PostMapping("/register")
    public R register(@RequestBody User user) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getAccount, user.getAccount());
        Long count = managerMapper.selectCount(wrapper);

        if (count > 0) {
            throw new ServiceException("账号已存在");
        }

        manager.setPassword(AuthUtil.codePassword(user.getPassword()));
        managerMapper.insert(user);
        return R.success("注册成功");
    }

    @PostMapping("/login")
    public R login(@RequestBody User user) {
        AuthUtil.clear();

        user.setPassword(AuthUtil.codePassword(user.getPassword()));

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Manager::getAccount, Manager.getAccount());
        wrapper.eq(Manager::getPassword, Manager.getPassword());
        Manager exist =.selectOne(wrapper);

        if (exist == null) {
            return R.fail("用户名或密码错误");
        }

        AuthUtil.setToken(exist);
        return R.success("登录成功");
    }

    @PostMapping("/update")
    public R update(@RequestBody User user) {
        userMapper.updateById(user);
        AuthUtil.setToken(user);
        return R.success("");
    }
}