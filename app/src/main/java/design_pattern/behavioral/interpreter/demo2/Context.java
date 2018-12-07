//package design_pattern.behavioral.interpreter.demo2;
//
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
///**
// * Created by LIXIAOYE on 2018/11/23.
// */
//
//public class Context {
//    private static Map<String, List<Row>> tables = new HashMap<>();
//
//    static {
//        List<Row> list = new ArrayList<>();
//        list.add(new Row("John", "Doe"));
//        list.add(new Row("Jan", "Kowalski"));
//        list.add(new Row("Dominic", "Doom"));
//
//        tables.put("people", list);
//    }
//
//    private String table;
//    private String column;
//    private Predicate<String> whereFilter;
//
//    List<String> search() {
//        List<String> result = tables.entrySet()
//                .stream()
//                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
//                .flatMap(entry -> Stream.of(entry.getValue()))
//                .flatMap(Collection::stream)
//                .map(Row::toString)
//                .flatMap(columnMapper)
//                .filter(whereFilter)
//                .collect(Collectors.toList());
//        return result;
//    }
//}
