package demo.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 该类对应HelloWorld Proxy的具体调用逻辑。
 */
public class HelloWorldHandler implements InvocationHandler {

    //被代理的原始对象
    private Object obj;

    public HelloWorldHandler(Object obj) {
        super();
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //调用sayHelloWorld方法前的动作
        System.out.println("Firstly, open mouth!");
        //调用sayHelloWorld方法
        result = method.invoke(obj, args);
        //调用sayHelloWorld方法后续动作
        System.out.println("At last, close mouth!");

        return result;
    }

}
