package design_pattern.behavioral.command.demo5;

/**
 * Since we can use System class to get the operating system information,
 * we will use this or else we can use Factory pattern to return appropriate
 * type based on the input.
 */

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:" + osName);
        if (osName.contains("Windows")) {
            return new WindowFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
