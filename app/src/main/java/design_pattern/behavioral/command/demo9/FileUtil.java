package design_pattern.behavioral.command.demo9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 工具类：文件操作类
 */

public class FileUtil {
    //将命令集合写入日志文件
    public static void writeCommands(ArrayList<Command> commands) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("config.log");
            //创建对象输出流用于将对象写入到文件中
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new
                    BufferedOutputStream(fileOutputStream));
            //将对象写入文件
            objectOutputStream.writeObject(commands);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("命令保存失败！");
            e.printStackTrace();
        }
    }

    //从日志文件中提取命令集合
    public static ArrayList<Command> readCommands() {
        try {
            FileInputStream fileInputStream = new FileInputStream("config.log");
            //创建对象输入流用于从文件中读取对象
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new BufferedInputStream(fileInputStream)
            );
            //将文件中的对象读出并转换为ArrayList类型
            ArrayList<Command> commands = (ArrayList<Command>) objectInputStream.readObject();
            objectInputStream.close();
            return commands;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("命令读取失败！");
            return null;
        }
    }
}






















