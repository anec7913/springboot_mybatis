package anec.vip.studyspringboot04.mapper;

import anec.vip.studyspringboot04.bean.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface usermapper {

    public List<user> selectAllUser();

}
