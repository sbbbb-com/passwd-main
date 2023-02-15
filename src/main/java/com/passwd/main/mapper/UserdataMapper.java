package com.passwd.main.mapper;

import com.passwd.main.domain.UserData;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author Administrator
* @description 针对表【userdata】的数据库操作Mapper
* @createDate 2023-02-14 12:23:02
* @Entity generator.domain.UserData
*/
@Repository
@Mapper
public interface UserdataMapper extends BaseMapper<UserData> {

}




