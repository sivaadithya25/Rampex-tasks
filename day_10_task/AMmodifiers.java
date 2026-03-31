abstract class Login {

    private String password = "123";   
    String username;                  
    protected boolean status;         
    public String role;               

    Login(String username, String role) {
        this.username = username;
        this.role = role;
        this.status = false;
    }

    abstract void login(String input);

    public void showUser() {
        System.out.println("User: " + username);
    }

    protected boolean check(String input) {
        return password.equals(input);
    }
}
class Admin extends Login {

    Admin(String username) {
        super(username, "Admin");
    }

    void login(String input) {
        if (check(input)) {
            status = true;
            System.out.println("Admin login success");
        } else {
            System.out.println("Wrong password");
        }
    }
}
class User extends Login {

    User(String username) {
        super(username, "User");
    }

    void login(String input) {
        if (check(input)) {
            status = true;
            System.out.println("User login success");
        } else {
            System.out.println("Wrong password");
        }
    }
}
class Guest extends Login {

    Guest(String username) {
        super(username, "Guest");
    }

    void login(String input) {
        System.out.println("Guest login without password");
        status = true;
    }
}
public class AccessModifierExample {
    public static void main(String[] args) {

        Admin a = new Admin("siva adithya");
        User u = new User("User1");
        Guest g = new Guest("Guest1");

        a.login("274");
        u.login("wrong");
        g.login("anything");

        a.showUser();
    }
}
