package design_pattern.behavioral.command.demo5;

/**
 * Created by LIXIAOYE on 2018/11/21.
 */

public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver receiver) {
        this.fileSystemReceiver = receiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
