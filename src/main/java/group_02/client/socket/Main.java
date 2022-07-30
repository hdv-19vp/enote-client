package group_02.client.socket;

import group_02.client.models.Enote;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Client.connect();
        String string =  "aaaaa";
        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
        System.out.println(Client.saveEnote("phantuongvy","a.txt",bytes));
    }
}
