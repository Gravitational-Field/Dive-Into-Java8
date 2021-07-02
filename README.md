### 1. 函数式编程与Lambda表达式

[ Java8 函数式编程详解](https://www.cnblogs.com/Dorae/p/7769868.html)







### 2. 三种编程范式及异步响应式编程

[编程范式：命令式编程(Imperative)、声明式编程(Declarative)和函数式编程(Functional)](https://www.cnblogs.com/sirkevin/p/8283110.html)

> 1. 命令式
> 2. 声明式
> 3. 函数式
> 4. 响应式编程



### 3. 响应式编程

[（4）Reactor 3快速上手——响应式Spring的道法术器](https://blog.51cto.com/liukang/2090191)

[响应式Spring的道法术器（Spring WebFlux 快速上手 + 全面介绍）](https://blog.51cto.com/liukang/2090163)





### 4. Netty

Netty是一个开源框架， 是一个基于NIO的客户、服务器端的编程框架，使用Netty 可以确保你快速和简单的开发出一个网络应用。提供异步的、事件驱动的网络应用程序框架和工具，用以快速开发高性能、高可靠性的网络服务器和客户端程序。





### 5. non-blocking IO（NIO）非阻塞IO 与 blocking IO（BIO）阻塞式IO

[Java NIO浅析 by 美团技术团队](https://zhuanlan.zhihu.com/p/23488863)





### 6. @RequestBody和@RequestParam用法及区别

[@RequestBody的使用](https://blog.csdn.net/justry_deng/article/details/80972817)



### 7. URI与URL

[uri与url的区别](https://www.php.cn/div-tutorial-413616.html)

[URI、 URL 和 URN 的区别](https://www.jianshu.com/p/09ac6fc0f8cb)

#### 1. URI

URI = Universal Resource Identifier 统一资源标志符

- URI是一种特定语法标识的字符串，来表示某一资源。

- 包含URL、URN；

- 支持协议有http、https、ftp、mailto、magnet、telnet、data、file、nfs、gopher、ldap等；

- java还大量使用了一些非标准的定制模式，如rmi，jar、jndi和doc，来实现各种不同用途。



#### 2. URL

URL = Universal Resource Locator 统一资源定位符



#### 3. URN

URN = Universal Resource Name 统一资源名称



### 8. Spring中的命名空间及其作用

[Spring XML 配置文件中命名空间的理解](https://zhuanlan.zhihu.com/p/194263065)

- 命名空间配置在beans标签的属性中
- 命名空间作用是自动为xml标签补全前缀，避免标签名冲突



### 9. 浏览器状态码

200

301

302

400

404：

405：客户端发送的请求服务器端处理不了，如错误类型String类型的age值传到服务器用Integer 的age接收。

406：服务器响应到客户端的数据，客户端处理不了。如将java对象直接传回给客户端

500

### 10.  classpath*: 和classpath:有什么区别





### 11. bean注解和Component注解

https://blog.csdn.net/weixin_35544490/article/details/112143211



### 12. 上下文组件扫描中的 use-default-filters

>context:component-scan 中use-default-filters默认为true，代表组件扫描扫描@Componment、@Repository、@Service、@Controller四种注解。

- spring.xml中

> 我们的需求是在spring.xml文件中只让其管理除了Controller之外的包,故需要将Controller注解排除在外,但是必须满足其它三种注解能够被扫描

```xml
<context:component-scan base-package="com.lzj" use-default-filters="true">
	<!--采用默认的use-default-filters即可，use-default-filters="true"可省略-->
    <!--排除注解为@Controller的 -->
    <comtext:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
</context:component-scan>
```

- SpringMVC.xml中

> 在SpringMVC.xml中，需要只扫描Controller注解，不使用默认的过滤器，仅包含controller注解

```xml
<context:component-scan base-package="com.lzj" use-default-filters="false">

        <context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
</context:component-scan>
```

