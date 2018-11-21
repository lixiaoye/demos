package design_pattern.behavioral.command.demo5;

/**
 * Created by LIXIAOYE on 2018/11/21.
 */

public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}
