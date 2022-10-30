# 单例模式

单例模式（Singleton Pattern）是指确保一个类在**任何情况下**都绝对只有一个实例，并提供一个全局访问点。

隐藏其所有的构造方法。

单例模式属于创建型设计模式。

## 单例模式的适用场景

确保任何情况下都绝对只有一个实例。

`ServletContext`、`ServletConfig`、`ApplicationContext`、`DBPool`

## 破坏单例模式的各种场景
* 线程
* 反射
* 序列化

### 处理反射破坏单例

在构造方法中判断实例是否为空，不为空才创建新的对象

### 处理序列化破坏单例

#### 定义

##### 序列化

把内存中的对象状态转换为字节码的形式

把字节码通过IO输出流写到磁盘上

永久保存下来持久化

##### 反序列化

将持久化的字节码内容，通过IO输入流读到内存中来

转化成一个Java对象

#### 解决方法

增加方法

``` java
private Object readResolve() {
    return ...;
}
```

## 单例模式在源码中的应用

### 单例模式在Spring中的应用

* `AbstractFactoryBean`

### 单例模式在MyBatis中的应用

* `ErrorContext`

## 单例模式的优点

单例模式有以下优点
* 在内存中只有一个实例，减少了内存开销。
* 可以避免对资源的多重占用。
* 设置全局访问点，严格控制访问。

## 单例模式的缺点

单例模式有以下缺点
* 没有接口，扩展困难
* 如果要扩展单例对象，只有修改代码，没有其他途径。违背了开闭原则

## 总结

1. 私有化构造器
2. 保证线程安全
3. 延迟加载
4. 防止序列化和反序列化破坏单例
5. 防御反射攻击单例