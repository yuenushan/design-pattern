package proxy.dynamic.cglib;

public class AccountService {
    public void addAccount(String name) {
        System.out.println(String.format("Create new account for %s", name));
    }
}
