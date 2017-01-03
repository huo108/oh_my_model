原型模式(Prototype  Pattern)：使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式。

![](https://github.com/huo108/oh_my_model/blob/master/screenshot/prototype.gif)

原型模式的工作原理很简单：将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝自己来实现创建过程。

浅克隆和深克隆的主要区别在于是否支持引用类型的成员变量的复制.

1.浅克隆:

在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；

![](https://github.com/huo108/oh_my_model/blob/master/screenshot/shadowclone.gif)

2.深克隆:

在深克隆中，无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，深克隆将原型对象的所有引用对象也复制一份给克隆对象。

![](https://github.com/huo108/oh_my_model/blob/master/screenshot/deepclone.gif)
