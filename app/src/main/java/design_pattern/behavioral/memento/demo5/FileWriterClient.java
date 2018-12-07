package design_pattern.behavioral.memento.demo5;

/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First Set of Data\n");
        System.out.println(fileWriterUtil + "\n\n");

        //lets save the file
        caretaker.save(fileWriterUtil);
        //now write something else
        fileWriterUtil.write("Second Set of Data\n");

        //checking file contents
        System.out.println(fileWriterUtil + "\n\n");

        //lets undo to last save
        caretaker.undo(fileWriterUtil);

        //cheking file content again
        System.out.println(fileWriterUtil + "\n\n");
    }
}
