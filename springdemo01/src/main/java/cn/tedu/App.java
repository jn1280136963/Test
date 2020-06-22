package cn.tedu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=ac.getBean("user",User.class);
        user.dopost();
        System.out.println(user);
         System.out.println(“hello”);
        ac.close();
    }
}
