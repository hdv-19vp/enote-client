package group_02.client.socket;

import group_02.client.models.Enote;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.util.ArrayList;

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

            return res.equals("success");
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

            return res.equals("success");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean saveEnote(String usr, String fileName){
        try {
            dos.writeUTF("saveNote");
            File file = new File("D:\\FileUpload\\" + fileName);
            byte[] bytes = Files.readAllBytes(file.toPath());

            dos.writeUTF(usr);
            dos.writeUTF(fileName);
            dos.writeInt(bytes.length);
            dos.write(bytes);

            String res = dis.readUTF();

            return res.equals("success");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean getEnote(String username, int noteId){
        try {
            dos.writeUTF("getNote");

            dos.writeUTF(username);
            dos.writeInt(noteId);

            byte[] bytes = null;
            int length = dis.readInt();
            if(length > 0) {
                bytes = new byte[length];
                dis.readFully(bytes);
            }
            String filename = dis.readUTF();
            FileUtils.writeByteArrayToFile(new File("D:\\FileDownload\\"+filename.substring(filename.indexOf("e\\")+2)), bytes);

            String res = dis.readUTF();
            return res.equals("success");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Enote> getEnoteList(String username){
        ArrayList<Enote> noteList = new ArrayList<>();
        try {
            dos.writeUTF("getNoteList");

            dos.writeUTF(username);
            int size = dis.readInt();
            for (int i = 0; i < size ; i++) {
                String usr = dis.readUTF();
                int noteId = dis.readInt();
                String filePath = dis.readUTF();
                String fileType = dis.readUTF();
                noteList.add(new Enote(noteId,usr,filePath,fileType));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return noteList;
    }




}
