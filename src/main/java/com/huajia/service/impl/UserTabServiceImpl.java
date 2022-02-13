package com.huajia.service.impl;

import com.huajia.entity.UserTab;
import com.huajia.mapper.UserTabMapper;
import com.huajia.service.IUserTabService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserTabServiceImpl implements IUserTabService {

    @Resource
    private UserTabMapper userTabMapper;

    @Override
    public List<UserTab> getUserList() {
        return userTabMapper.getUserList();
    }
}
