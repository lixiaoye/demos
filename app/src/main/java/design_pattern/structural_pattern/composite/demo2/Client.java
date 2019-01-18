package design_pattern.structural_pattern.composite.demo2;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class Client {
    public static void main(String[] args) {
        //构造一个目录对象表示C盘根目录
        Dir diskC = new Folder("C");
        //C盘根目录下有一个文件ImbaMallLog.txt
        diskC.addDir(new File("ImbaMallLog.txt"));
        //C盘根目录下还有3个字目录Windows,PerfLogs,Program File
        Dir dirWin = new Folder("Windows");
        //Windows目录下有文件explorer.exe
        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);
        //PerfLogs目录
        Dir dirPer = new Folder("PerfLogs");
        //PerfLogs目录下有文件null.txt
        dirPer.addDir(new File("null.txt"));
        diskC.addDir(dirPer);
        //Program File目录
        Dir dirPro = new Folder("Program File");
        dirPro.addDir(new File("ftp.txt"));
        diskC.addDir(dirPro);
        //打印出文件结构
        diskC.print();
    }
    /**
     * C(ImbaMallLog.txt, Windows(explorer.exe), PerfLogs(null.txt), Program File(ftp.txt))
     */
}
