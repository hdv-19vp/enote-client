package group_02.client.socket;

public class Main {
    public static void main(String[] args) {
        Client.connect();
        System.out.println(Client.getEnote("phantuongvy",5));
    }
}
