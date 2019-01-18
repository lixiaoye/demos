package design_pattern.structural_pattern.flyweight.demo2;


/**
 * Created by LIXIAOYE on 2019/1/11.
 */

public class FlyweightPatternDemo {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();

        }
    }

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomY() {
        return (int) (Math.random() * 100);
    }
/**
 * Creating circle of color:Black
 Circle :draw()[color:Black,x:8y:58,radius:100
 Creating circle of color:Blue
 Circle :draw()[color:Blue,x:41y:39,radius:100
 Creating circle of color:White
 Circle :draw()[color:White,x:80y:8,radius:100
 Creating circle of color:Green
 Circle :draw()[color:Green,x:39y:37,radius:100
 Circle :draw()[color:Blue,x:37y:73,radius:100
 Circle :draw()[color:White,x:55y:78,radius:100
 Circle :draw()[color:Blue,x:84y:21,radius:100
 Circle :draw()[color:White,x:11y:4,radius:100
 Circle :draw()[color:White,x:6y:8,radius:100
 Circle :draw()[color:White,x:38y:65,radius:100
 Creating circle of color:Red
 Circle :draw()[color:Red,x:62y:45,radius:100
 Circle :draw()[color:Black,x:43y:96,radius:100
 Circle :draw()[color:White,x:30y:34,radius:100
 Circle :draw()[color:Red,x:19y:76,radius:100
 Circle :draw()[color:Black,x:43y:86,radius:100
 Circle :draw()[color:Blue,x:31y:31,radius:100
 Circle :draw()[color:Green,x:64y:29,radius:100
 Circle :draw()[color:Green,x:44y:84,radius:100
 Circle :draw()[color:White,x:41y:62,radius:100
 Circle :draw()[color:Black,x:16y:89,radius:100
 */
}
