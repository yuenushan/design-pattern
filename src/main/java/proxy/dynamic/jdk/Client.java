package proxy.dynamic.jdk;

import proxy.static1.UserService;
import proxy.static1.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(new UserServiceImpl());
        UserService UserServiceProxy = (UserService) myInvocationHandler.getProxy();
        UserServiceProxy.addUser();
    }
}
