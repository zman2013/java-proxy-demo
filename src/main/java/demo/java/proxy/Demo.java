package demo.java.proxy;

import demo.java.proxy.helloworld.HelloWorld;
import demo.java.proxy.helloworld.HelloWorldProxyFactory;



public class Demo {

    public static void main(String[] args) {

        HelloWorld proxy = HelloWorldProxyFactory.getProxy();

        proxy.sayHelloWorld();
    }
}
