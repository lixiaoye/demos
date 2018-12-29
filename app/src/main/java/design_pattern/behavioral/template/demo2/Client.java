package design_pattern.behavioral.template.demo2;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public class Client {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
        /**
         Cricket Game Initialized!Start playing
         Cricket Game Started.Enjoy the game!
         Cricket Game Finished!

         Football Game Initialized!Start playing
         Football Game Started.Enjoy the game!
         Football Game Finished!
         */
    }
}
