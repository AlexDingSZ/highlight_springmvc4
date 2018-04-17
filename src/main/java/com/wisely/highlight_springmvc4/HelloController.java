package com.wisely.highlight_springmvc4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
/*
    运行方法：
            1 mvn install 打成war包，war包在target文件夹中
            2、war包名称修改为highlight_springmvc4.war
            3、把 highlight_springmvc4.war放在tomcat 的webapps文件夹中
            4、浏览器打开：http://localhost:8080/highlight_springmvc4/index
*/
}
