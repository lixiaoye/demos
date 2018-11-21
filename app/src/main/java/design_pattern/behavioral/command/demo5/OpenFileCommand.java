package design_pattern.behavioral.command.demo5;

/**
 * Created by LIXIAOYE on 2018/11/21.
 */

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver receiver) {
        this.fileSystemReceiver = receiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
