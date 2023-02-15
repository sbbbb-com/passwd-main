package com.passwd.main.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.passwd.main.domain.UserData;
import com.passwd.main.mapper.UserdataMapper;
import com.passwd.main.service.UserdataService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【userdata】的数据库操作Service实现
* @createDate 2023-02-14 12:23:02
*/
@Service
public class UserdataServiceImpl extends ServiceImpl<UserdataMapper, UserData>
    implements UserdataService {

    @Override
    public Boolean saveAndCheck(UserData userData) {
        this.saveOrUpdate(userData);
        return  true;
    }
}




