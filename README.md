# 23GOF
设计模式

| 设计模式                    | 作用   | 举例                    |
| :---------------------- | ---- | --------------------- |
| Iterator（迭代器）           |      | Iterator，ListIterator |
| Adapter                 |      |                       |
| Template Method         |      |                       |
| Factory Method          |      |                       |
| Singleton               |      |                       |
| Prototype               |      |                       |
| Builder                 |      |                       |
| Abstract Factory        |      |                       |
| Bridge                  |      |                       |
| Strategy                |      |                       |
| Composite               |      |                       |
| Decorator               |      |                       |
| Visitor                 |      |                       |
| Chain of Responsibility |      |                       |
| Facade                  |      |                       |
| Mediator                |      |                       |
| Observer                |      |                       |
| Memento                 |      |                       |
| state                   |      |                       |
| Flyweight               |      |                       |
| Proxy                   |      |                       |
| Command                 |      |                       |
| Interpreter             |      |                       |



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



举例：

集合的遍历

Collection，Iterator，ListIterator，ArrayList，Itr，ListItr

详细见 processOn 图解：

```
https://www.processon.com/view/link/625ad6350e3e7410dc7b84e1
```

















