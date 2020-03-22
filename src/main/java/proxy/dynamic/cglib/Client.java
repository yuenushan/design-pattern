package proxy.dynamic.cglib;

public class Client {
    public static void main(String[] args) {
        TargetInterceptor targetInterceptor = new TargetInterceptor();
        AccountService proxy = targetInterceptor.getProxy(AccountService.class);
        proxy.addAccount("david");
    }
}
