package design_pattern.behavioral.memento.demo5;

/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String file) {
        this.fileName = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void uodoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.getFileName();
        this.content = memento.getContent();
    }
}
