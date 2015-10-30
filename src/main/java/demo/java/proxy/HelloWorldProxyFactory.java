package demo.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理工厂类
 */
public class HelloWorldProxyFactory {

    /**
     * 获得HelloWorld的代理对象。
     */
    public static HelloWorld getProxy() {
        //接口的实现类
        HelloWorld helloWorld = new HelloWorldImpl();
        //proxy的调用类
        InvocationHandler handler = new HelloWorldHandler(helloWorld);

        //生成proxy
        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(
                helloWorld.getClass().getClassLoader(),
                helloWorld.getClass().getInterfaces(),
                handler);

        return proxy;
    }
}
