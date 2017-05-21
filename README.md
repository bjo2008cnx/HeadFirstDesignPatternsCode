# HeadFirstDesignPatternsCode
实现《Head First Design Patterns》一书中的代码，并整理相关的个人笔记。

[原书作者的GitHub代码地址](https://github.com/bethrobson/Head-First-Design-Patterns)

## 第0章 全书中每一章节的小结

### (1) OO原则

> * 封装变化；
> * 多用组合，少用继承；
> * 针对接口编程，不针对实现编程；
> * 为交互对象之间的松耦合设计而努力；
> * 对扩展开放，对修改关闭；
> * 依赖抽象，不要依赖具体类；
> * 只和朋友交谈；
> * 别找我，我会找你；
> * 类只应该有一个改变的理由；

---

## 第1章 设计模式入门--欢迎来到设计模式的世界

### (1)一个概念

&emsp;&emsp;在软件开发过程中，一个伴随我们不变的真理：change。不轮当初软件设计的多好，一段时间后，总是需要成长与改变。否则软件就会“死亡”。

### (2)设计原则1

&emsp;&emsp;**找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起**。

&emsp;&emsp;这样的概念很简单，几乎是每个设计模式背后的精神所在。**所有的设计模式都提供了一套方法让“系统中的某部分改变不会影响其他部分”。**

### (3)设计原则2

&emsp;&emsp;**针对接口编程，而不是针对实现编程**。

### (4)设计原则3

&emsp;&emsp;**多用组合，少用继承**。

&emsp;&emsp;使用组合建立系统具有很大的弹性，不仅可以将算法族封装成类，更可以在“**运行时动态的改变行为**”，只要组合的行为对象符合正确的接口标准即可以。

### (5)策略模式的定义

&emsp;&emsp;**策略模式定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户**。

### (6)本章的一点补充

> * (1) 大多数的模式和原则，都着眼于软件变化的主题；
> * (2）大多数的模式都**允许系统局部改变独立于其他部分**；

---

## 第2章 观察者模式--让你的对象知悉现状

### (1) 定义

&emsp;&emsp;观察者模式：**定义对象间的一对多的依赖关系，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。**

&emsp;&emsp;主题(Subject)是真正拥有数据的人，观察者是多个主题的依赖者，在数据发生变化时更新，这样比起让许多对象控制同一份数据来，可以的得到更干净的OO设计。

&emsp;&emsp;设计原则：为了交互对象之间的松耦合设计而努力。松耦合的设计之所以能让我们建立有弹性的OO系统，能够应对变化，**是因为对象之间的互相依赖降到了最低**。

### (2) java内置的观察者模式的不足

> * (1)可观察类Observble是一个“类”而不是一个“接口”，更糟糕的是，它甚至没有实现一个接口。这极大的限制了他的复用和使用；
> * (2)Observble将关键的方法保护起来，比如setChanged()，他被定义成protected。这意味着，**除非你继承自Observable，否则你无法创建Observable实例并组合到自己的对象中来，**这个违反了第二个设计原则，**多用组合，少用继承**。

### (3) 挑战设计原则

#### a.设计原则：找出程序中会变化的方面，然后将其和固定不变的方面相分离。

&emsp;&emsp;在观察者模式中，会改变的是主题的状态，以及观察者的数目和类型，用这个模式，你可以依赖于主题状态的对象，都不必改变主题，这就叫提前规划。

#### b.设计原则：针对接口编程，不针对实现编程

&emsp;&emsp;主题与观察者都是用接口，观察者利用主题的接口向主题注册，而主题利用观察者接口通知观察者，这样可以让他们之间运作正常，又同时具有松耦合的优点。

#### c.设计原则：多用组合，少用继承

&emsp;&emsp;**观察者模式利用“组合”将许多观察者组合进主题中，对象之间的这种关系不是通过继承产生的，而是在运行时利用组合的方式而产生的。**

---

## 第3章 装饰者模式--装饰对象

&emsp;&emsp;本章可以称为**给爱用继承的人一个全新的设计眼界**。通过使用对象组合的方式，做到运行时装饰类。

### (1)设计原则

**类应该对扩展开放，对修改关闭。**

### (2) 关于装饰者模式的一些概念

> * (1) **装饰者和被装饰者有相同的超类型；**
> * (2) 你可以用一个或多个装饰者包装同一个对象；
> * (3) 由于装饰者和被装饰者拥有相同的父类，所以可以遵循里斯替换原则，在任何需要原始对象的场合，都可以使用装饰过的对象替代他。
> * (4) **装饰者可以在委托被装饰者的行为之前或者之后，加上自己的行为，以达到特定的目的；**
> * (5) 对象可以在任何时候被装饰，所以可以在运行时动态地，不限量地用你喜欢的装饰者来装饰对象；

### (3) 定义装饰者模式

&emsp;&emsp;**装饰者模式动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案。**

### (4) 以一个奶茶店的运营为例子来看

![装饰者模式类图类图](http://occl9k36n.bkt.clouddn.com/2017_03_25_decorate_pattern.png)

最终的测试代码：

``` java
public class DrinkStore {

	public static void main(String[] args) {
		Drinks drink = new GreenTea();
		System.out.println(drink.getDescription() + ":价格$" + drink.cost());
		
		Drinks drink2 = new Caffe();
		drink2 = new BingTang(drink2);
		drink2 = new NaiXi(drink2);
		System.out.println(drink2.getDescription() + ":价格$" + drink2.cost());
		
		Drinks drink3 = new RedTea();
		drink3 = new NingMeng(drink3);
		System.out.println(drink3.getDescription() + ":价格$" + drink3.cost());
	}

}

```

运行结果：

``` java
绿茶:价格$1.05
咖啡+冰糖+奶昔:价格$2.3400000000000003
红茶+柠檬:价格$0.99

```

关于装饰者模式的一些tips：

> * 继承属于扩展形式之一，但不见得是达到弹性设计的最佳方式；
> * 在我们的设计中，应该允许行为可以被扩展，而无需修改现有代码；
> * **组合和委托可用以在运行时动态的加上新的行为**；
> * 除了继承，装饰者模式也可以让我们扩展行为；
> * **装饰者模式意味着一群装饰者类**，这些类用来包装具体组件；
> * 装饰者会导致程序设计中出现许多小对象，如果过度使用，会让程序变得很复杂；

---

## 第4章 工厂模式--烘烤OO的精华

### (1)简单工厂

原书中的关于简单工厂的使用：

``` java
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
```

&emsp;&emsp;**简单工厂其实不是一个设计模式**，反而比较像是一种编程习惯，但由于经常被使用，有些开发人员的确会把这个编程习惯误认为是“工厂模式”。

### (2)工厂方法

&emsp;&emsp;**现在实例化披萨的操作交给一个具体的方法去执行，此方法就如同是一个工厂。**

改进后的代码：

``` java
public abstract class PizzaStore {

	/**
	 * 现在实例化披萨的操作交给一个具体的方法去执行，
	 * 此方法就如同是一个工厂
	 * @param item
	 * @return
	 */
	abstract Pizza createPizza(String item);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
```


**工厂方法用来处理对象的创建，并将这样的行为封装在子类中。这样，客户端程序中关于超类的代码就和子类的对象创建代码解耦了。**

``` java
abstract Pizza createPizza(String item);
```

&emsp;&emsp;工厂方法模式**通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的**。

定义：

&emsp;&emsp;**工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类**。

通用类图为：

![工厂方法通用类图](http://occl9k36n.bkt.clouddn.com/2017_03_27_FactoryMethodDiagram.png)


一些问题的解答：

(1)利用字符串传入参数化的类型，是不是有点危险？万一拼错了怎么办？

&emsp;&emsp;的确，这样的问题会导致所谓的运行时错误。避免此类问题的技巧：可以创建代表参数类型的对象和使用静态常量，或者Java中支持的enum类型。

(2)**对比工厂方法和简单工厂之间的区别(非常的重要)**

&emsp;&emsp;工厂方法中的子类确实看上去非常像简单工厂。**简单工厂把全部的事情在一个地方处理完了。然而工厂方法确实创建一个框架，让子类决定如何去实现**。简单工厂的做法可以将对象的创建封装起来，但是简单工厂不具备工厂方法的弹性，因为简单工厂不能改变正在创建的产品。

### (3)对象依赖

&emsp;&emsp;当你直接实例化一个对象时，就是依赖它的具体类。

&emsp;&emsp;**依赖倒置原则：要依赖抽象，不要依赖具体类**。这个原则说明了，不能让高层组件依赖底层组件，而且，不管高层或底层组件，“两者”都应该依赖于抽象。以本文的例子来说明：PizzaStore是“高层组件”，而披萨本身是“底层组件”，很清楚地，PizzaStore依赖这些具体披萨类。

如下的几个方针可以帮助我们有效的遵循依赖倒置原则：

> * (1) 变量不可以持有具体类的引用
> * (2) 不要让类派生自具体类
> * (3) 不要覆盖基类中已经实现的方法

### (4)工厂方法与抽象工厂

&emsp;&emsp;抽象工厂的方法经常以工厂方法的方式实现。抽象工厂的任务是定义一个负责创建一组产品的接口。这个接口里的每个方法都负责创建一个具体的产品，同时我们利用抽象工厂的子类来提供这些具体的做法。因此，在抽象工厂中利用工厂方法实现生产方法是相当自然的做法。

抽象工厂的定义：

&emsp;&emsp;**抽象工厂提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。**

对比：

> * (1)工厂方法与抽象工厂都是负责创建对象的，但是**工厂方法使用的是继承，而抽象工厂使用的是组合**，这意味着，利用工厂方法创建对象，需要扩展一个类，并覆盖他的工厂方法。其实整个工厂方法模式，只不过就是通过子类创建对象。用这种方法，客户只需要知道他们所使用的抽象类型就是了，而由子类负责决定具体的类型；
> * (2)抽象工厂提供一个创建一个产品家族的抽象类型，这个类型的子类定义了产品被产生的方法。要想使用在这个工厂，必须先实例化它，然后将它传入一些针对抽象类型所写的代码中。
> * (3)**使用场景：对于抽象工厂，当你需要创建产品家族和想让制造的相关产品集合起来时，可以考虑使用抽象工厂；对于工厂方法，可以帮我们把客户代码从需要实例化的具体类中解耦，或者如果目前还不知道将来需要实例化哪些具体类时，也可以考虑使用工厂方法；**

### (5)本章tips

> * (1)简单工厂并不是设计模式；
> * (2)**工厂方法使用继承，把对象的创建委托给子类，子类实现工厂方法来创建对象**；
> * (3)**抽象工厂使用对象组合，对象的创建被实现在工厂接口所暴露出来的方法中**；

---

## 第5章 单例模式--独一无二的对象

定义：**单件模式确保一个类只有一个实例，并提供一个全局访问点。**

### (1) 单例模式的继承问题

&emsp;&emsp;继承单例类会遇到的一个问题是，构造器是私有的。所以必须修改构造器为protected或者public的。同时修改访问权限之后还有另外一个问题出现，单例的实现是利用静态变量。直接继承会导致所有的的派生类共享同一个实例变量。所以**想要让子类工作顺利，基类必须实现注册表功能**。

---

## 第6章 命令模式--封装调用

&emsp;&emsp;命令模式是封装的一个全新的境界：**把方法调用封装起来**。通过封装方法调用，我们可以把运算块包装成形。所以调用此运算的对象不需要关心事情是如何运行的，只要知道如何使用包装成形的方法来完成它就可以。

### (1) 定义**命令模式**

&emsp;&emsp;**命令模式将请求封装成对象，以便使用不同的请求，队列或日志来参数化其他对象。命令模式也可以支持撤销的操作**。

&emsp;&emsp;命令对象通过在**特定接收者上绑定一组动作来封装一个请求**。要达到这一点，命令对象将动作和接收者包进对象。这个对象只暴露出一个execute()方法。

``` java
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// 创建任务执行者
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		// 定义所有类型的任务
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		// setCommand
		remote.setCommant(lightOn);
		remote.buttonsWasPressed();
		
		// 任务执行
		remote.setCommant(lightOff);
		remote.buttonsWasPressed();
```

### (2) 关于命令模式的tips

> * (1) 命令模式将发送请求的对象和执行请求的对象解耦；
> * (2) 在被解耦的两者之间是通过命令对象进行沟通的。**命令对象封装了接收者和一个或一组动作**；
> * (3) 调用者通过调用命令对象的execute()发出请求，这会使得接收者的动作被调用；
> * (4) 命令可以支持撤销，通过实现一个undo方法

---

## 第7章 适配器模式和外观模式--随遇而安

### (1) 适配器模式

&emsp;&emsp;装饰者模式中，我们把对象包装起来，赋予他们新的职责，而现在是以不同的目的，包装某些对象：让他们的接口看起来不像是自己的而是像别的东西。一个非常形象的使用适配器场景的例子：**在欧洲，如果你想使用美国制造的笔记本电脑，你可能需要一个交流电适配器**。

&emsp;&emsp;一个很好的**适配器原理**示意图：

![适配器原理](http://occl9k36n.bkt.clouddn.com/2017_04_15_adapter_princple.png)

客户和被适配者是解耦的，一个不知道另一个。

&emsp;&emsp;定义适配器模式：**适配器模式将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间**。

通过组合方式实现的适配器模式类图：

![适配器类图](http://occl9k36n.bkt.clouddn.com/2017_04_15_adapter_diagram.png)

### (2) 外观模式

&emsp;&emsp;**外观模式是改变接口的一个新模式，它是为了简化接口，将一个或者数个类的复杂的一切都隐藏在背后，只显露一个干净美好的外观。**

> * **外观没有“封装”子系统的类，外观只提供简化的接口**。所以客户如果觉得有必要，依然可以直接使用子系统的类。这是外观模式一个很好的特征：提供简化的接口的同时，依然将系统完整的功能暴露出来，以供需要的人使用。
> * 外观不只是简化了接口，也将客户从组件的子系统中解耦；
> * **外观模式和适配器模式都可以包装许多类，只不过外观的意图是简化接口，而适配器的意图是将接口转化成不同的接口**。

&emsp;&emsp;**外观模式提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。**

### (3) 本章tips

> * 当需要简化并统一一个很大的接口或者一群复杂的接口时，使用外观；
> * 适配器改变接口以符合客户的期望；
> * 外观将客户从一个复杂的子系统中解耦；
> * 实现一个外观，**需要将子系统组合进外观中，然后将工作委托给子系统执行**；
> * 适配器模式有两种形式：对象适配器和类适配器。类适配器需要用到多重继承；
> * **适配器将一个对象包装起来以改变接口，装饰者将一个对象包装起来以增加新的行为和责任；外观将一群对象包装起来以简化接口**。

| 模式 | 意图 | 
| ------| ------ | 
| 适配器 | 将一个接口转成另一个接口 | 
| 装饰者 | 不改变接口，但加入职责 | 
| 外观 | 让接口更简单 | 

---

## 第8章 模板方法模式--封装算法

&emsp;&emsp;**模板方法模式是在一个方法中定义一个算法的骨架，而将一些算法的步骤延迟到子类中。模板方法使得子类可以在不改变算法架构的情况下，重新定义算法中的某些特定的步骤。**

### (1) 钩子方法

&emsp;&emsp;当你的子类必须提供算法中某个方法或步骤的实现时，就使用抽象方法。**如果算法的这个部分是可选的，就用钩子方法。如果是钩子方法，子类可以选择实现这个钩子，但并不强制。**

### (2) 好莱坞原则

&emsp;&emsp;**别调用(打电话给)我们，我们会调用(打电话给)你**。

&emsp;&emsp;**由超类控制一切，当他们需要时，自然会去调用子类**。

&emsp;&emsp;高层组件对待底层组件的方式是：别调用我们，我们会调用你。底层组件绝对不可以直接调用高层组件。

### (3) JDK中的使用

&emsp;&emsp;最典型的应用场景就是Comparable接口，只有一个方法，comgpareTo()。需要各个类自己去实现，决定如何进行排序。Array类sort()方法的设计者希望能够适用于所有的数组，所以他们定义了一个静态方法，而由被排序的对象内的每个元素自行提供比较大小的算法部分。所以，**这虽然不是教科书上的模板方法，但它的实现仍然符合模板方法的精神。再者，由于不需要通过继承数组就可以使用这个算法，这样使得排序变得更有弹性，更实用。**

### (4) 模板方法与策略模式

| 指标  | 模板方法 | 策略模式 |
| ------| ------ | ------ | 
| 实现 | 通过继承实现 | 通过对象组合，更有弹性，客户可以在运行时改变他们的算法|
| 定义 | 定义一个算法的大纲，由子类定义其中某些步骤的内容 | 定义一个算法家族，并这这些算法可以互换。|
| 依赖| 超类是抽象的，但是必须依赖超类中的方法的实现|不依赖任何人，整个算法自己可以搞定 |

### (5) 模式比较

| 模式 | 意图 | 
| ------| ------ | 
| 模板方法 | 子类决定如何实现算法中的某些步骤 | 
| 策略模式 | 封住可以互换的行为，然后使用委托来决定要采用哪一个行为 |
| 工厂方法 | 由子类决定实例化哪个具体类 |

**重要的结论：工厂方法是模板方法的一种特殊版本**。

---

## 第9章 迭代器与组合模式--管理良好的集合

基于迭代器模式实现的餐厅菜单的最终类图如下：

![迭代器模式类图](http://occl9k36n.bkt.clouddn.com/2017_04_25_iterator_uml.png)

### (1) 模式定义

&emsp;&emsp;**迭代器模式提供一种方法顺序访问一个聚合对象内部的各个元素，而又不暴露其内部的表示。**

&emsp;&emsp;在设计中使用迭代器模式的影响是明显的：**如果你有一个统一的方法访问聚合中的每一个对象，你就可以编写多态的代码和这些聚合搭配**，而不需要关心每个聚合的底层是用什么数据结构存储的。

### (2) 单一职责

**&emsp;&emsp;一个类应该只有一个引起变化的原因。**

&emsp;&emsp;类的每个责任都有改变的潜在区域，超过一个责任，意味着超过一个改变的区域。这个原则告诉我们，尽量让每个类保持单一责任。

&emsp;&emsp;内聚的定义：**内聚是用来度量一个类或模块紧密地达到单一目的或责任**。当一个模块或一个类被设计成只支持一组相关的功能时，我们说他具有高内聚，反之，当被设计成支持一组不相关的功能时，我们说他具有低内聚。

增加底层存储数据使用HashMap的集合：

``` java

public Iterator<MenuItem> createIterator() {
	return menuItems.values().iterator();
}

```

### (3) 组合模式

&emsp;&emsp;组合模式的定义：**组合模式允许你将对象组合成树形结构来表现“整体/部分“的层次结构，组合能让客户以一致的方式处理个别对象以及组合对象。**

&emsp;&emsp;使用组合结构，我们能把相同的操作应用在组合和个别对象上，换句话说，大多数情况下，我们可以忽略对象组合和个别对象之间的差别。

### (4) 实例

类图如下所示：

![组合模式类图](http://occl9k36n.bkt.clouddn.com/2017_04_26_composite_digram.png)

---

## 第10章 状态模式--事物的状态

&emsp;&emsp;**基本常识，策略模式和状态模式是双胞胎，在出生时才分开。策略模式是围绕可以互换的算法来创建成功业务的。然而，状态走的是更崇高的路，它通过改变对象内部的状态来帮助对象控制自己的行为。**

使用新的设计对旧的代码进行重构：

> * (1) 首先，我们定义一个state接口，**在这个接口内，糖果机的每个动作都有一个对应的方法**；
> * (2) 然后为机器的每个状态实现状态类，这些类将负责在对应的状态下进行机器的行为；
> * (3) 最后，我们要摆脱旧的条件代码，取而代之的方式是，将动作委托到状态类；

重构完成之后的类：

``` java
public class GumballMachine {

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	
	// 当前糖果机的状态
	private State currentState;
	private int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		this.count = numberGumballs;
		
		// 初始化当前的状态值
		if (numberGumballs > 0) {
			currentState = noQuarterState;
		} else {
			currentState = soldOutState;
		}
	}
	
	public void insertQuarter() {
		currentState.insertQuarter();
	}
	
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
	
	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}
	
	/**
	 * 机器售出糖果的操作
	 */
	public void releaseBall() {
		System.out.println("机器成功售出一枚糖果...");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	public void refill(int count) {
		this.count += count;
		System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
		currentState.refill();
	}
	
	/**
	 * 切换糖果机至指定的状态
	 * @param state		指定状态值
	 */
	public void setStatue(State state) {
		this.currentState = state;
	}
	
	public State getState() {
        return currentState;
    }
	
	int getCount() {
		return count;
	}

	public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    @Override
    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + currentState + "\n");
		return result.toString();
	}
}

```

### (2) 模式定义

&emsp;&emsp;**状态模式允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。**

&emsp;&emsp;**这个模式将状态封装成为独立的类，并将动作委托到代表当前状态的对象，我们知道行为会随着内部状态的改变而改变。**

&emsp;&emsp;**那么定义中的第二部分呢，一个对象“看起来好像修改了它的类”是什么意思呢？从客户的视角来看，如果说你使用的对象能够完全改变它的行为，那么你会觉得，这个对象实际上是从别的类实例化而来的。然而实际上，你知道我们是使用组合通过简单引用不同的状态对象来造成类改变的假象。**

![状态模式类图](http://occl9k36n.bkt.clouddn.com/2017_05_06_StatePattern.png)

### (3) 模式比较

模式 | 描述
---- | ---
状态模式 | 封装基于状态的行为，并将行为委托到当前状态
策略模式 | 将可以互换的行为封装起来，然后使用委托的方法，决定使用哪一种行为
模板方法 | 由子类决定如何实现算法中的某些步骤

本章要点

> * (1) 状态模式允许一个对象基于内部状态而拥有不同的行为；
> * (2) 状态模式用类表示状态；
> * (3) Context会将行为委托给当前状态对象；
> * (4) **通过将每个状态封装进一个类，我们把以后需要做的任何改变局部化了**；
> * (5) **策略模式和状态模式类图相同，但是他们的意图不同；**
> * (6) 策略模式通常会用行为或算法来配置Context类；
> * (7) 状态模式允许COntext随着状态的改变而改变行为；

---

## 第11章 代理模式--控制对象访问

**代理要做的核心：控制和管理访问。**

### (1) 定义

&emsp;&emsp;**代理模式为另一个对象提供一个替身或占位符以控制这个对象的访问。**

&emsp;&emsp;**使用代理模式创建代表对象，让代表对象控制某对象的访问，被代理的对象可以使远程的对象，创建开销大的对象或需要安全控制的对象。**

几种代理控制访问的方式：

> * (1) 远程代理控制访问远程对象；
> * (2) 虚拟代理控制访问开销大的资源；
> * (3) 保护代理基于权限控制对资源的访问；

类图如下


![代理模式类图](http://occl9k36n.bkt.clouddn.com/2017_05_13_proxy_uml_diagram.png)

### (2) 虚拟代理

&emsp;&emsp;**虚拟代理作为创建开销大的对象的代表，虚拟代理经常直到我们真正需要一个对象的时候才创建它**。当对象在创建前和创建中时，由虚拟对象来扮演对象的替身。对象创建后，代理就会将请求直接委托给对象。

### (3) 保护代理

&emsp;&emsp;Java在java.lang.reflect包中有自己的代理支持，**利用这个包在运行时动态地创建一个代理类，实现一个或者多个接口，并将这些方法转发到你指定的类。因为实际的代理类是在运行时创建的，所以这个Java技术成为：动态代理。**

动态代理的类图如下：

![动态代理类图](http://occl9k36n.bkt.clouddn.com/2017_05_13_proxy_uml_diagram2.png)

&emsp;&emsp;在这个类图中，**InvocationHandler的作用是响应代理的任何调用，你可以吧InvocationHandler想成代理收到方法调用后，请求做实际工作的对象。**

步骤一：创建InvocationHandler

``` java
public class OwnerInvocationHandler implements InvocationHandler {

	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if(method.getName().equals("setHotOrNotRating")) {
				// 不允许自己给自己打分
				throw new IllegalAccessException();
			} else if(method.getName().startsWith("set")) {
				// 其他的set方法自己可以自己设置
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}

}

```

步骤二：创建Proxy类并实例化Proxy对象

``` java
PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}
	
```

给指定的PersonBean对象创建相应的代理对象。

### (4) 小结tips 

> * (1)动态代理之所以被称为动态代理，是因为**运行时才将它的类创建出来，代码开始执行时，还没有proxy类，**他是根据传入的接口集创建的；
> *  (2) **InvocationHandler并不是真正的proxy,他只是一个帮助proxy的类，proxy会把调用转发给他处理，Proxy本身是利用静态的Proxy.newInstance()方法在运行时动态的创建的；**
> * (3) 远程代理管理客户和远程对象之间的访问，虚拟代理控制实例化开销比较大的对象，保护代理基于调用者控制对对象方法的访问；

### (5) 其他代理

> * (1) 防火墙代理：
控制网络资源的访问，保护主题免于“坏客户”的侵害；
> * (2) 智能引用代理：
当主题对象被引用时，进行额外的动作，例如计算一个对象被引用的次数；
> * (3) 缓存代理：
为开销大的运算结果提供暂时的存储，它也允许多个客户共享结果，以减少网络的延迟；
> * (4) 同步代理：
在多线程的情况下为主题对象提供安全的访问；
> * (5) 复杂隐藏代理：
用来影藏一个类的复杂集合的复杂度，并进行访问控制，有时也称为“外观代理”；

---

## 第12章 复合模式--模式的模式

### (1) 概述

> * (1) 模式通常被一起使用，并被组合在同一个设计解决方案中；
> * (2) 复合模式在一个解决方案中**结合两个或多个模式，以解决一般或重复发生的问题；**

### (2) 我们做了什么

我们从一大堆Quackable开始

有一只鹅出事了，它希望自己像一个Quackable，于是我们使用适配器模式，把鹅适配成Quackable。

然后，为了统计咕咕叫的次数，添加了一个QuackCounter的装饰者，用来追踪quack()方法被调用的次数，并将调用委托给它所装饰的Quackable对象；

但是咕咕叫学家担心他们忘了添加QuackCounter的装饰者，于是定义抽象工厂方法，当需要鸭子的时候，向工厂去获取。如果想取得没有被装饰的鸭子，那么从另外一个工厂获取就可以了。

又是鸭子，又是鹅的。又是Quackable的，在管理上有困扰，因此引入组合模式，统一管理，并利用迭代器模式封装遍历的过程。

当任何咕咕叫响起时，咕咕叫学家都希望被告知，于是我们引入了观察者模式。

### (3) 认识模型--视图--控制器

如下图所示：

![认识MVC](http://occl9k36n.bkt.clouddn.com/2017_05_17_view_mvc_condition.png)

更详细一点：

![认识MVC](http://occl9k36n.bkt.clouddn.com/2017_05_17_view_mvc_condition2.png)

各个模块的作用如下：

> * 你是用户，你和视图交互。视图是模型的窗口，当**你对视图做一些事时，视图就告诉控制器你做了什么，控制器会负责处理；**
> * 控制器要求模型改变状态。控制器解读你的动作，如果你按下某个按钮，控制器会理解这个动作的含义，并告知模型如何做出对应的动作；
> * **控制器也可能要求视图做改变**。当控制器从视图接收到某一个动作，结果可能是它也需要告诉视图改变其结果；
> * 当模型状态改变时，模型会通知视图。只要当模型内的东西改变时，模型都会通知视图它的状态改变了；
> * 视图向模型询问状态，视图直接从模型取得它显示的状态。

### (4) 本章要点小结

> * (1) MVC是复合模式，结合了观察者模式，策略模式和组合模式；
> * (2) 模型使用观察者模式，以便观察者更新，同时保持两者之间的解耦；
> * (3) **控制器是视图的策略，视图可以使用不同的控制器实现，得到不同的行为；**
> * (4) 视图使用组合模式实现用户界面，用户界面通常组合了嵌套的组件，像面板，框架和按钮；
> * (5) **适配器模式用来将新的模型适配成已有的视图和控制器；**

---

## 第13章及附录部分 与设计模式相处

### (1) 设计模式分类

> * (1) 创建型模式：**创建型模式涉及到将对象实例化，这类模式都提供一个方法，将客户从所需实例化的对象中解耦；**
> * (2) 行为型模式：只要是行为型模式，都涉及到类和对象如何交互及分配职责；
> * (3) 结构性模式：**把类或对象组合到更大的结构中；**

> * (1) 创建型模式：单例模式，工厂方法，抽象工厂，原型模式，建造者模式Builder)；
> * (2) 结构型模式：装饰者模式，组合模式，代理模式，桥接模式，适配器模式，门面模式，享元模式；
> * (3) 行为类模式：剩余的都是；

### (2) 推荐书籍

[建筑的永恒之道](https://book.douban.com/subject/1177968/)

[建筑模式语言](https://book.douban.com/subject/1157145/)

### (3) Builder生成器模式

&emsp;&emsp;**使用生成器模式，封装一个产品的构造过程，并允许按步骤构造。**

生成器模式的优点 ：

> * 将一个复杂对象的创建过程封装起来；
> * 允许对象通过多个步骤来创建，并且可以改变过程(**这和只有一个步骤的工厂方法不同**)；
> * 向客户隐藏产品内部的实现；
> * 产品的实现可以被替换，因为客户只看到一个抽象的接口；