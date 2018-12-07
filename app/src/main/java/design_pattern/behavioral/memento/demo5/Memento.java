package design_pattern.behavioral.memento.demo5;


/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class Memento {
    private String fileName;
    private StringBuilder content;

    public Memento(String file, StringBuilder content) {
        this.fileName = file;
        //notice the deep copy so that Memento and FileWriteUtil content variables dont't refer to same object.
        this.content = new StringBuilder(content);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public StringBuilder getContent() {
        return content;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }
}
