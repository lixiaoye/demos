package Storage;

//输入线程
class Input implements Runnable {
    private Storage storage;
    private int num;

    public Input(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            storage.put(num++);//将num存入数组，每次存入后num自增
        }
    }
}

class Output implements Runnable {

    private Storage storage;

    Output(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            storage.get();//循环取出元素
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Storage storage = new Storage();//创建数据存储类对象
        Input input = new Input(storage);//创建Input对象传入Storage对象
        Output output = new Output(storage);//创建output对象传入Storage对象
        new Thread(input).start();//开启新线程
        new Thread(output).start();//开启新线程

    }
    /**
     * 打印结果：
     在cells[8]中存入数据---1540048
     在cells[9]中存入数据---1540049
     在cells[0]中存入数据---1540050
     在cells[1]中存入数据---1540051
     在cells[2]中存入数据---1540052
     在cells[3]中存入数据---1540053
     在cells[4]中存入数据---1540054
     在cells[5]中存入数据---1540055
     在cells[6]中存入数据---1540056
     在cells[7]中存入数据---1540057
     从cells[8]中取出数据1540048
     从cells[9]中取出数据1540049
     从cells[0]中取出数据1540050
     从cells[1]中取出数据1540051
     从cells[2]中取出数据1540052
     从cells[3]中取出数据1540053
     从cells[4]中取出数据1540054
     从cells[5]中取出数据1540055
     从cells[6]中取出数据1540056
     从cells[7]中取出数据1540057
     在cells[8]中存入数据---1540058
     在cells[9]中存入数据---1540059
     在cells[0]中存入数据---1540060
     在cells[1]中存入数据---1540061
     在cells[2]中存入数据---1540062
     在cells[3]中存入数据---1540063
     在cells[4]中存入数据---1540064
     在cells[5]中存入数据---1540065
     在cells[6]中存入数据---1540066
     在cells[7]中存入数据---1540067
     从cells[8]中取出数据1540058
     从cells[9]中取出数据1540059
     在cells[8]中存入数据---1540068
     在cells[9]中存入数据---1540069
     从cells[0]中取出数据1540060
     从cells[1]中取出数据1540061
     从cells[2]中取出数据1540062
     从cells[3]中取出数据1540063
     从cells[4]中取出数据1540064
     从cells[5]中取出数据1540065
     从cells[6]中取出数据1540066
     从cells[7]中取出数据1540067
     从cells[8]中取出数据1540068
     从cells[9]中取出数据1540069
     在cells[0]中存入数据---1540070
     在cells[1]中存入数据---1540071
     在cells[2]中存入数据---1540072
     在cells[3]中存入数据---1540073
     在cells[4]中存入数据---1540074
     在cells[5]中存入数据---1540075
     在cells[6]中存入数据---1540076
     在cells[7]中存入数据---1540077
     在cells[8]中存入数据---1540078
     在cells[9]中存入数据---1540079
     从cells[0]中取出数据1540070
     从cells[1]中取出数据1540071
     从cells[2]中取出数据1540072
     从cells[3]中取出数据1540073
     从cells[4]中取出数据1540074
     从cells[5]中取出数据1540075
     从cells[6]中取出数据1540076
     从cells[7]中取出数据1540077
     从cells[8]中取出数据1540078
     从cells[9]中取出数据1540079

     */
}
