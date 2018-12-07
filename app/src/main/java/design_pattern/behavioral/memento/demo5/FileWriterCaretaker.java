package design_pattern.behavioral.memento.demo5;

/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriterUtil) {
        this.obj = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil) {
        fileWriterUtil.uodoToLastSave(obj);
    }

}
