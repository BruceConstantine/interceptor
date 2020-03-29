# interceptor
这个repository就是实现了JJ课件里的Interceptor(CS4227).

> JJ课件里的拦截器（interceptor）与Struts2里的拦截器不是特别一致。JJ的在《面向企业的架构设计》的卷二里有所提到。
这里虽然是实现的是书中的Interceptor，但是其功能和Strust2框架的interceptor大相径庭。故，可以了解框架的interceptor来了解原理
当我们想要对应用程序的请求或响应进行一些预处理 / 后处理时，使用拦截过滤器设计模式是最好的选择了。在将请求传递给实际目标应用程序之前，会在请求上定义和应用过滤器。

## 介绍
Struts2最强大的特性之一，也可以说是struts2的核心，就是拦截器。它可以让你在Action和result被执行之前或之后进行一些处理。同时，拦截器也可以让你将通用的代码模块化并作为可重用的类。Struts2中的很多特性都是由拦截器来完成的。拦截是AOP的一种实现策略。在Webwork的中文文档的解释为：拦截器是动态拦截Action调用的对象。它提供了一种机制可以使开发者可以定义在一个action执行的前后执行的代码，也可以在一个action执行前阻止其执行。同时也是提供了一种可以提取action中可重用的部分的方式。谈到拦截器，还有一个词大家应该知道——拦截器链（Interceptor Chain，在Struts 2中称为拦截器栈Interceptor Stack）。拦截器链就是将拦截器按一定的顺序联结成一条链。在访问被拦截的方法或字段时，拦截器链中的拦截器就会按其之前定义的顺序被调用。[1]

## 作用及组成
拦截器可以执行身份验证 / 授权 / 记录或跟踪请求，然后将请求传递给相应的处理程序。以下是此类设计模式的实体。
Filter - 在请求处理程序执行请求之前或之后执行特定任务的过滤器。
Filter Chain - 过滤链带有多个过滤器，有助于在目标上按照指定的顺序来执行它们。
Target - 目标对象是请求处理程序
Filter Manager - 过滤器管理器管理过滤器和过滤器链。
Client - 客户端是向 Target 对象发送请求的对象
[2]
    

参考：
[1] [CSDN](https://blog.csdn.net/ooiuy450/article/details/70054613)
[2] [知乎](https://zhuanlan.zhihu.com/p/81137017)
