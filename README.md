[TOC]



# 23GOF

设计模式

### 设计模式原则

| 六大原则      | 总结                     | 作用   |
| --------- | ---------------------- | ---- |
| 开闭原则（OPC） | 类对于扩展是开放的，对于修改是封闭的     |      |
| 单一职责原则    | 一个类只负责一项职责             |      |
| 接口隔离原则    | 建立单一接口，即：一个接口只干一件事     |      |
| 依赖倒置原则    | 上层模块不应该依赖下层模块，两者应依赖其抽象 |      |
| 里氏替换原则    | 调用其他类时，必须使用父类或接口       |      |
| 迪米特法则     | 一个类对其他的类有最少的了解         |      |
| 合成复用原则    | 尽量使用组合实现代码复用           |      |



| 设计模式                    | 作用             | 举例                    |
| :---------------------- | -------------- | --------------------- |
| Iterator（迭代器）           | 遍历集合，将遍历与实现分离开 | Iterator，ListIterator |
| Adapter（适配器）            | 使得被适配者满足对象的要求  |                       |
| Template Method         |                |                       |
| Factory Method          |                |                       |
| Singleton               |                |                       |
| Prototype               |                |                       |
| Builder                 |                |                       |
| Abstract Factory        |                |                       |
| Bridge                  |                |                       |
| Strategy                |                |                       |
| Composite               |                |                       |
| Decorator               |                |                       |
| Visitor                 |                |                       |
| Chain of Responsibility |                |                       |
| Facade                  |                |                       |
| Mediator                |                |                       |
| Observer                |                |                       |
| Memento                 |                |                       |
| state                   |                |                       |
| Flyweight               |                |                       |
| Proxy                   |                |                       |
| Command                 |                |                       |
| Interpreter             |                |                       |



## Iterator 设计模式

​	将循环变量的作用抽象化、通用化后形成的模式，称为 **`Iterator（迭代器）`** 模式

```java
// 基本的 Iterator 接口
public interface Iterator {
  	// 是否有下一个元素
    public abstract boolean hasNext();
  	// 获取下一个元素，并将 “指针” 下移
  	public abstract Object next();
}
```

​	将遍历与实现分离开来，更好的进行复用以及解耦合

举例：

集合的遍历

Collection，Iterator，ListIterator，ArrayList，Itr，ListItr

详细见 processOn 图解：

```
https://www.processon.com/view/link/625ad6350e3e7410dc7b84e1
```



## Adapter（适配器）模式

​	经常会存在现有的程序无法直接使用，需要做出适当的变换之后才能使用的情况，这种用于填补 “现有程序” 和 “所需程序” 之间的差异的设计模式，就是 Adapter（适配器） 模式

​	适配器模式分为两种：

*   类适配器模式（使用继承的适配器）
*   对象适配器模式（使用委托的适配器）



### 类适配器模式

​	由于

```java

```

举例：

Iphone 的有线耳机线是扁头的，但是有些手机的耳机线是圆头的，如果想要将圆头的耳机线插入扁头的耳机线，就需要一个转换器进行转换

 











