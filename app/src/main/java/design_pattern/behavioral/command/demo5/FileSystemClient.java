package design_pattern.behavioral.command.demo5;

/**
 * Created by LIXIAOYE on 2018/11/21.
 */

public class FileSystemClient {
    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        //Creating invoker and associating with Command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        //perform action on invoker object
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();
    }
}
