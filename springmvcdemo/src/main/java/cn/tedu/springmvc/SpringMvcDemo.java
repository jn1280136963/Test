package cn.tedu.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class SpringMvcDemo {

    /*登录*/
    @RequestMapping("login.do")
    public String helloWord() {
        System.out.println("SpringMvcDemo.helloWord");
        return "login";
    }

    @RequestMapping("index1.do")
    public String index() {
        System.out.println("SpringMvcDemo.index");
        return "index1";
    }

    /*处理登录请求*/
    @RequestMapping("handlerlogin.do")
    public String login(String username, String password, HttpServletRequest request, HttpSession httpSession) {
        System.out.println("SpringMvcDemo.login");
        if ("jack".equals(username)) {

            if ("1234".equals(password)) {
                System.out.println("登录成功");
                httpSession.setAttribute("uid",6666);
                return "redirect: index1.do";
            }else {
                String dd="密码错误";
                request.setAttribute("errors",dd);
                return "error";
            }
        }else {
            String dd="账号错误";
            request.setAttribute("errors",dd);
            return "error";
        }
    }

}
