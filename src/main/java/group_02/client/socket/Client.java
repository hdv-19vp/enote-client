package group_02.client.socket;

import java.io.*;
import java.net.Socket;

public class Client {
    public final static String SERVER_IP = "127.0.0.1";
    public final static int SERVER_PORT = 7;
    public static Socket socket = null;
    public static DataInputStream dis = null;
    public static DataOutputStream dos = null;

    public static boolean connect() {
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT); // Connect to server
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            System.out.println("Connected: " + socket);

            return true;
        } catch (IOException e) {
//            e.printStackTrace();

            return false;
        }
    }

    public static boolean signIn(String usr, String pwd){
        try {
            dos.writeUTF("signIn");
            dos.writeUTF(usr);
            dos.writeUTF(pwd);
            String res = dis.readUTF();

            return  res.equals("thanh cong");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean signUp(String usr, String pwd){
        try {
            dos.writeUTF("signUp");
            dos.writeUTF(usr);
            dos.writeUTF(pwd);
            String res = dis.readUTF();

            return  res.equals("thanh cong");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
