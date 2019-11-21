# 单例模式

## 对比

| 名称| 饿汉模式 | 懒汉模式 | 双重检查锁模式 | 静态内部类实现 | 枚举类实现 |
| -- | -- | -- | -- | -- | -- |
| 可用性 | 可用 | 不推荐使用 | 推荐使用 | 推荐使用 | 推荐使用 |
| 特点 | 不能实现懒加载，可能造成空间浪费 | 不加锁线程不安全；加锁性能差 | 线程安全；延迟加载；效率较高 | 避免了线程不安全，延迟加载，效率高。 | 写法简单；线程安全；只装载一次 | 

## 仓库地址

[Github/vanDusty](https://github.com/vanDusty/Design-Patterns)

## 技术交流

1. [风尘博客：https://www.dustyblog.cn](https://www.dustyblog.cn)
1. [风尘博客-掘金](https://juejin.im/user/5d5ea68e6fb9a06afa328f56/posts)
1. [风尘博客-博客园](https://www.cnblogs.com/vandusty/)
1. [Github](https://github.com/vanDusty)

关注公众号，了解更多：

![风尘博客](https://i.loli.net/2019/08/18/jiXBAot8fEWZd3p.png)