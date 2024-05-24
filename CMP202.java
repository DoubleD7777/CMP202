public class CMP202 {
    public static void main(String[] args) {}
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 18;
        height = 180;
        name = "Brown";
        name.length();
        password = "User@123";
        if (password.contains("1234") || password.contains("User")) {
            System.out.println("Password is not strong enough");
        }
    }
}