package cn.tedu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    private SubUser subUser;
    public  void dopost(){
        System.out.println("User.dopost");
        subUser.logindo();
    }
}
