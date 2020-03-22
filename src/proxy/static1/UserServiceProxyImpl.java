package proxy.static1;

public class UserServiceProxyImpl implements UserService {

    private UserService userService;

    public UserServiceProxyImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void addUser() {
        System.out.println("[INFO] CALL addUser Method!");
        userService.addUser();
    }
}
