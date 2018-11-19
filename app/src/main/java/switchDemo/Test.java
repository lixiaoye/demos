package switchDemo;

public class Test {
    public static void main(String[] args) {
        String week = "Friday";
        switch (week) {
            case "Monday":
                System.out.println("星期一");
                break;
            case "Tuesday":
                System.out.println("星期二");
                break;
            case "Wednesday":
                System.out.println("星期三");
                break;
            case "Thursday":
                System.out.println("星期四");
                break;
            case "Friday":
                System.out.println("星期五");
                break;
            case "Saturday":
                System.out.println("星期六");
                break;
            case "Sunday":
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误...");
        }
    }
}
