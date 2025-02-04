package com.ojprogram.ojprogram.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ojprogram.ojprogram.common.api.R;
import com.ojprogram.ojprogram.common.exception.ServiceException;
import com.ojprogram.ojprogram.common.utils.AuthUtil;
import com.ojprogram.ojprogram.entity.Hw;
import com.ojprogram.ojprogram.mapper.UserMapper;
import com.ojprogram.ojprogram.mapper.WorksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Blog")
public class BlogController {


    @Autowired
    private WorksMapper worksMapper;


    @Autowired
    private UserMapper userMapper;


    @PostMapping("/save")
    public R save(@RequestBody Hw works) {
        works.setAccount(AuthUtil.getUserAccount());
        blog.setCreateTime(new Date());
        blogMapper.insert(blog);
        return R.success("博客保存成功");
    }

    @GetMapping("/list")
    public R list(Blog blog) {
        LambdaQueryWrapper<Blog> wrapper = new LambdaQueryWrapper<>();

        wrapper.orderByAsc(Blog::getCreateTime);

        List<Blog> blogs = blogMapper.selectList(wrapper);

        for (Blog item : blogs) {
            LambdaQueryWrapper<User> userWrapper = new LambdaQueryWrapper<>();

            userWrapper.eq(User::getAccount, item.getAccount());

            User user = userMapper.selectOne(userWrapper);

            item.setIcon(user.getIcon());
        }

        return R.data(blogs);
    }
}