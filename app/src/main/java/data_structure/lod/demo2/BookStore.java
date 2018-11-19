package data_structure.lod.demo2;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by LIXIAOYE on 2018/11/2.
 */

public class BookStore {
    private final static ArrayList<IBook> bookList=new ArrayList<>();
    static {
        //静态代码块初始化数据，实际项目中一般是由持久层完成
        bookList.add(new OffNovelBook("百年孤独",7500,"加西亚·马尔克斯"));
        bookList.add(new OffNovelBook("面纱",3200,"毛姆"));
        bookList.add(new OffNovelBook("飘",12000,"玛格丽特·米切尔"));
        bookList.add(new OffNovelBook("傲慢与偏见",4500,"简·奥斯汀"));
//        bookList.add(new NovelBook("百年孤独",7500,"加西亚·马尔克斯"));
//        bookList.add(new NovelBook("面纱",3200,"毛姆"));
//        bookList.add(new NovelBook("飘",12000,"玛格丽特·米切尔"));
//        bookList.add(new NovelBook("傲慢与偏见",4500,"简·奥斯汀"));
    }

    public static void main(String[] args) {
        NumberFormat formatter=NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        System.out.println("-----书店卖出去的书籍记录如下：----------");
        for (IBook book:bookList) {
            System.out.println("书籍名称："+book.getName()+"\t书籍作者："+book.getAuthor()+"\t书籍价格："+formatter.format(book.getPrice()/100)+"元");
        }
    }
    /**
     *
     -----书店卖出去的书籍记录如下：----------
     书籍名称：百年孤独	书籍作者：加西亚·马尔克斯	书籍价格：￥75.00元
     书籍名称：面纱	书籍作者：毛姆	书籍价格：￥32.00元
     书籍名称：飘	书籍作者：玛格丽特·米切尔	书籍价格：￥120.00元
     书籍名称：傲慢与偏见	书籍作者：简·奥斯汀	书籍价格：￥45.00元
     ********打折后*******************
     -----书店卖出去的书籍记录如下：----------
     书籍名称：百年孤独	书籍作者：加西亚·马尔克斯	书籍价格：￥67.00元
     书籍名称：面纱	书籍作者：毛姆	书籍价格：￥25.00元
     书籍名称：飘	书籍作者：玛格丽特·米切尔	书籍价格：￥108.00元
     书籍名称：傲慢与偏见	书籍作者：简·奥斯汀	书籍价格：￥40.00元
     */
}


























