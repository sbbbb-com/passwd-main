package com.passwd.main.service;

import com.passwd.main.domain.UserData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【userdata】的数据库操作Service
* @createDate 2023-02-14 12:23:02
*/
public interface UserdataService extends IService<UserData> {

    /**
     * 保存密码
     * @param userData
     * @return
     */
    Boolean saveAndCheck(UserData userData);
}
