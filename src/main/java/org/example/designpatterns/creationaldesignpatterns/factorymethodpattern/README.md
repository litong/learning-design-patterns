# 工厂方法模式

> Define an interface for creating an object, but let subclasses decide with class to instantiate. The Factory method lets a class defer instantiation it uses to subclasses

工厂方法模式（Factory Method Pattern）是指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法模式**让类的实例化推迟到子类中进行**。

工厂方法模式属于创建型设计模式。

## 工厂方法模式适用场景

创建对象需要大量重复的代码。

客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。

一个类通过其子类来指定创建哪个对象。

## 工厂方法模式的优点

用户只需要关心所需产品对应的工厂，无需关心创建细节。

加入新产品符合开闭原则，提高了系统的可扩展性。

## 工厂方法模式的缺点

类的个数容易过多，增加了代码结构的复杂度。

增加了系统的抽象性和理解难度。