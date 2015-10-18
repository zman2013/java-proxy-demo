package demo.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Demo {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorldImpl();

        InvocationHandler handler = new HelloWorldHandler(helloWorld);

        /* @formatter:off */
        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(
                helloWorld.getClass().getClassLoader(),
                helloWorld.getClass().getInterfaces(),
                handler);
        /* @formatter:on */

        proxy.sayHelloWorld();
    }
}
