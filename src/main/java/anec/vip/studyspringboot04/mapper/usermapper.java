package anec.vip.studyspringboot04.mapper;

import anec.vip.studyspringboot04.bean.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface usermapper {

    @Select("select * from user")
    public List<user> selectAllUser();

    @Select("select * from user where id=#{id}")
    public user selectUser(user u);

    @Insert("insert into user(username,password,email,idcard,phone) values(#{username},#{password},#{email},#{idcard},#{phone})")
    public int insertUser(user u);

    @Delete("delete from user where id=#{id}")
    public int deleteUser(user u);

    @Update("update user set email=#{email}")
    public int updateUser(user u);
}
