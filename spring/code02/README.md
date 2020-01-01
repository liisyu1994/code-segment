# 代码使用

通过maven install 插件，打包成war包（包名为code02.war），放入tomcat的webapps文件夹运行。

访问: localhost:8080\code02\hello,即可

# HelloController

@Controller：表明该类为控制器类

@RequestMapping("/hello")：匹配/hello

@RequestMapping(method = RequestMethod.GET)：匹配所有的GET方法

```java
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    // 返回一个字符串
    public String sayHello(ModelMap model) {
        return "welcome";
    }
}
```

# applicationContext.xml

SpringMVC的配置类

# web.xml

配置了全局的`DispatcherServlet`

