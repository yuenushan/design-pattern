package proxy.static1;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxyImpl(new UserServiceImpl());
        userService.addUser();
    }
}
