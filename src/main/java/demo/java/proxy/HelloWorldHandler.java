package demo.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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

        System.out.println("I'll do something first!");

        result = method.invoke(obj, args);

        System.out.println("I'll do something else at the end!");

        return result;
    }

}
