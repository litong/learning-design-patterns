# 懒汉式单例静态内部类写法（反射安全）

## 优点

此种写法有以下优点
* 节省了内存
* 线程安全
* 执行性能高
* 利用了Java本身的语法特点
* 不能被反射破坏

## 缺点

此种写法有以下缺点
* 可读性难度增大