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



## Iterator（迭代器） 模式

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
https://www.processon.com/view/625834141e085335d545674a
```



## Adapter（适配器）模式

​	将两个不适配的东西，通过适配器连接起来，达成要求。

```java
public class Adapter extends 被适配的目标A implements 要求做到的B {
  	@override
  	public void 要求做到的B的方法() {
    	被适配目标的A调用A的方法
  	}
}
```

举例：

扁耳机空，扁头耳机线，圆头耳机线

详细见 processOn 图解：

```
https://www.processon.com/view/625834141e085335d545674a
```



### Template Method（模板方法）模式

​	在父类中定义具体的处理流程，而在子类中进行实现具体的处理方法，即：父类只负责调用方法的顺序，子类负责调用方法的实现，即便父类调用方法的顺序是一样的，但由于子类实现的不同，也会产生不同的结果

```java
// 父类中的模板方法定义调用方法的流程
public abstract class Template {
  	// 其他类不需要知道这几个方法，并且只有子类实现，那么就可以将修饰符设置为 protected
  	protected abstract void method1();
  	protected abstract void method2();
  	protected abstract void method3();
  	// 定义调用流程，由于不需要子类继承和实现，所以可以用 final 修饰
    public final void templateMethod() {
		method1();
      	method2();
      	method3();
    }
}

// 子类负责方法的具体实现
public class T extends Template {
    public abstract void method1() {
		// 具体实现
    }
    public abstract void method2() {
		// 具体实现
    }  
    public abstract void method3() {
		// 具体实现
    }
}

```



举例：

手机模型

详细见 processOn 图解：

```
https://www.processon.com/view/625834141e085335d545674a
```



