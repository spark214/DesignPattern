# 观察者模式
购花网站系统中，购花者可以进行选购鲜花，网站安排相应的配送人员进行配送。其中有一个业务场景描述如下：
1、	当一个新的消费者准备进入系统时，首先该消费者需要进行注册，成为正式用户之后才可以登录系统。当该消费者输入用户名、密码和邮箱地址信息进行注册后，网站将向该消费者发送一封表示欢迎的电子邮件。
2、	当该网站有新的鲜花品种上线发布时，系统将发送新商品信息到注册之后的消费者邮箱
3、	当该消费者不想继续关注该鲜花购物网站时，可以自己发送请求不需要该网站继续发送相应的鲜花信息到自己的邮箱。

## 1、观察者模式适用的场景是什么？
1、 对一个对象状态的更新，需要其他对象同步更新，而且其他对象的数量动态可变。 
2、 对象仅需要将自己的更新通知给其他对象而不需要知道其他对象的细节。
