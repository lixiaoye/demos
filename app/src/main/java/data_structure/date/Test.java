package data_structure.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws ParseException {
       /* Date date1 = new Date();//创建表示当前时间的Date对象
        Date date2 = new Date(999999999999l);//创建表示时间戳的Date对象
        System.out.println(date1);//Tue Aug 21 12:46:33 CST 2018
        System.out.println(date2);//Sun Sep 09 09:46:39 CST 2001*/

       /* Calendar calendar = Calendar.getInstance();//获取当前时间的Calendar对象
        int year = calendar.get(Calendar.YEAR);//获取当前年份
        int month = calendar.get(Calendar.MONTH) + 1;//获取当前月份
        int data_structure.date = calendar.get(Calendar.DATE);//获取当前日
        int hour = calendar.get(Calendar.HOUR);//获取时
        int minute = calendar.get(Calendar.MINUTE);//获取分
        int second = calendar.get(Calendar.SECOND);//获取秒
        System.out.println("当前时间：" + year + "年" + month + "月" + data_structure.date + "日"
                + hour + "时" + minute + "分" + second + "秒");//当前时间：2018年8月21日2时23分7秒*/

        /*Calendar calendar = Calendar.getInstance();
        calendar.set(2018, 8, 21);
        calendar.add(Calendar.DATE, 100);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int data_structure.date = calendar.get(Calendar.DATE);
        System.out.println("提测时间:" + year + "年" + month + "月" + data_structure.date + "日");//提测时间:2018年12月30日*/

      /*  Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());//Tue Aug 21 15:16:07 CST 2018
        calendar.set(Calendar.MONTH, 13);
        System.out.println(calendar.getTime());//Thu Feb 21 15:16:07 CST 2019
        //开启non-lenient模式
        calendar.setLenient(false);
        calendar.set(Calendar.MONTH, 13);
//        System.out.println(calendar.getTime());//Exception in thread "main" java.lang.IllegalArgumentException: MONTH*/

//        Date data_structure.date = new Date();
//        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);//Full格式的日期格式器对象
//        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);//Long格式的日期格式器对象
//        DateFormat mediumFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);//Medium格式的日期格式器对象
//        DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT);//Short格式的日期格式器对象
//        DateFormat mediumFormat2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
//        DateFormat shortFormat2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
//
//        System.out.println("full:" + fullFormat.format(data_structure.date));//full:2018年8月21日 星期二
//        System.out.println("long:" + longFormat.format(data_structure.date));//long:2018年8月21日
//        System.out.println("medium:" + mediumFormat.format(data_structure.date));//medium:2018-8-21
//        System.out.println("short:" + shortFormat.format(data_structure.date));//short:18-8-21
//
//        System.out.println("medium2:" + mediumFormat2.format(data_structure.date));//medium2:2018-8-21 15:32:12
//        System.out.println("short2:" + shortFormat2.format(data_structure.date));//short2:18-8-21 下午3:32
//
//
//        DateFormat df1=DateFormat.getDateInstance(DateFormat.LONG);
//        String d1="2018年8月21日";
//        System.out.println(df1.parse(d1));//将对应格式的字符串解析成Date对象 Tue Aug 21 00:00:00 CST 2018


//        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年MM月dd日：今天是yyyy年的第D天，E");
//        System.out.println(sdf.format(new Date()));//公元2018年08月21日：今天是2018年的第233天，星期二

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MMM/dd");
        String dt = "2018/八月/21";
        //将字符串解析成Date对象
        System.out.println(sdf2.parse(dt));//Tue Aug 21 00:00:00 CST 2018

    }
}
