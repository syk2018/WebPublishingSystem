package com.syk.publishing.service.impl;

import com.syk.publishing.common.api.ResultCode;
import com.syk.publishing.mbg.mapper.UsersMapper;
import com.syk.publishing.mbg.model.Users;
import com.syk.publishing.mbg.model.UsersExample;
import com.syk.publishing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-07-30
 * @Description:UserService实体类
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> getUserByUsername(Users user) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUsernameEqualTo(user.getUsername());

        return usersMapper.selectByExample(usersExample);
    }

    @Override
    public Users getUserById(Long id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int createUser(Users user) {
        List<Users> result = getUserByUsername(user);
        if(result.isEmpty()) {
            return usersMapper.insertSelective(user);
        }

        else return ResultCode.DUPLICATE.getCode();
    }

    @Override
    public int updateUser(Long id, Users user) {
        user.setUserId(id);

        return usersMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteUser(Long id) {
        return usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Users> login(Users user) {
        List<Users> result;
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUsernameEqualTo(user.getUsername())
                .andUserpwdEqualTo(user.getUserpwd());
        result = usersMapper.selectByExample(usersExample);

        return result;
    }
}
