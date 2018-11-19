package packaging;


public class Test1 {
    public static void main(String[] args) {
//        int a = 20;
//        Integer integer = new Integer(a);
//        System.out.println(integer.toString());//20

//        Integer integer = new Integer(20);
//        int a = 20;
//        int value = integer.intValue() + a;
//        System.out.println(value);//40

      /*  int w = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        for (int i = 0; i < h; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < w; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }*/

//        Integer i = Integer.valueOf("123");
//        Integer i2 = Integer.valueOf("12a");//不合法
//        System.out.println(i);//123
//        System.out.println(i2);//NumberFormatException
        /**
         * Exception in thread "main" java.lang.NumberFormatException: For input string: "12a"
         at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
         at java.lang.Integer.parseInt(Integer.java:580)
         at java.lang.Integer.valueOf(Integer.java:766)
         at packaging.Test1.main(Test1.java:26)
         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
         at java.lang.reflect.Method.invoke(Method.java:498)
         at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
         */

//        int i = Integer.parseInt("123");//合法
//        Integer in = Integer.parseInt("lxy");//不合法

        int num = 20;
        Integer number = num;//自动装箱

        Integer number2 = new Integer(18);
        int number3 = number2;//自动拆箱

    }
}
