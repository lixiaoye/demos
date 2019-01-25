// IBookManager.aidl
package lxy.android.com.binderdemo.demo1;

// Declare any non-default types here with import statements
import lxy.android.com.binderdemo.demo1.bean.Book;//导入Book.aidl文件，后缀名不需要！！！！

interface IBookManager {
    List<Book> getBookList();
    void addBook(in Book book);
}
