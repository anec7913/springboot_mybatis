package anec.vip.studyspringboot04.controller;

import anec.vip.studyspringboot04.bean.user;
import anec.vip.studyspringboot04.mapper.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usercontroller {

    @Autowired
    usermapper usermapper;

    @RequestMapping("user")
    public List<user> selectuser(){
        return usermapper.selectAllUser();
    }

//    @RequestMapping("adduser")
//    public int addtuser(){
//        user u = new user();
//        u.setUsername("alex");
//        u.setPassword("654321");
//        u.setEmail("123465@qq.com");
//        u.setIdcard("431123198708033143");
//        u.setPhone("18700101010");
//        return usermapper.selectAllUser(u);
//    }
}
