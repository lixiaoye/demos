//package design_pattern.behavioral.interpreter.demo2;
//
//import java.util.List;
//
///**
// * Created by LIXIAOYE on 2018/11/26.
// */
//
//public class From implements Expression{
//    private String table;
//    private Where where;
//
//    @Override
//    public List<String> interpret(Context ctx) {
//        ctx.setTable(table);
//        if (where==null){
//            return ctx.search();
//        }
//        return where.interpret(ctx);
//    }
//}
