# 结构型设计模式

## Spring 中的代理选择原则

1. 当 Bean 有实现接口时， Spring 就会用JDK的动态代理。
2. 当 Bean 没有实现接口时， Spring 选择CGLib。
3. Spring 可以通过配置强制使用 CGLib ，只需在 Spring 的配置文件中加入如下代码：

```xml
<aop:aspectj-autoproxy proxy-target-class="true"/>
```

