package socket;

public class Main {
    public static void main(String[] args) {
        Client.connect();
        System.out.println(Client.signIn("phantuongvy", "123456"));
        System.out.println(Client.signIn("phanvy", "123456"));
    }
}
