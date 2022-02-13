package com.huajia.mapper;

import com.huajia.entity.UserTab;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTabMapper {

    List<UserTab> getUserList();

}
