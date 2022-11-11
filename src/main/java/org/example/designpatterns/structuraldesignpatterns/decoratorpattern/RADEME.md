# 装饰器模式

装饰器模式（Decorator Pattern）也叫包装模式（Wrapper Pattern），是指在不改变原有对象的基础上，将功能附加到对象上，提供了比继承更有弹性的替代方案（拓展原有对象的功能）。

装饰器模式属于结构型模式。

## 生活中的装饰器模式

煎饼侠（大鹏）
水果蛋糕

## 装饰器模式的适用场景

1. 用于扩展一个类的功能或给一个类添加附加职责。
2. 动态地给一个对象添加功能，这些功能可以再动态地撤销。

## 装饰器模式在源码中的应用

InputStream is = new FileInputStream(filePath);
BufferedInputStream bis = new BufferedInputStream(is);
bis.read();
bis.close();

BufferedReader br = new BufferedReader(new FileReader(filePath));
br.readLine();

BufferedReader bs = new BufferedReader(new StringReader("""));
bs.readerLine();

## 装饰器模式和代理模式对比

1. 装饰器模式就是一种特殊的代理模式。
2. 装饰器模式强调自身的功能扩展（用户自己看得到的用户自己做决定的透明的，可动态定制的）。
3. 代理模式强调代理过程的控制。

## 装饰器模式的优点

1. 装饰器模式是继承的有力补充，比继承灵活，可以不改变原有对象的情况下动态地个一个对象拓展功能，即插即用。
2. 通过适用不同装饰器类以及这些装饰类的排列组合，可实现不同的效果
3. 装饰器完全遵守开闭原则。

## 装饰器模式的缺点

1. 会出现更多的代码，更多的类，增加程序的复杂度。
2. 动态装饰时，多层装饰时会更复杂。
