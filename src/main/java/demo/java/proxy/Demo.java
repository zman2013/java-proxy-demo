package demo.java.proxy;


public class Demo {

    public static void main(String[] args) {

        HelloWorld proxy = HelloWorldProxyFactory.getProxy();

        proxy.sayHelloWorld();
    }
}
