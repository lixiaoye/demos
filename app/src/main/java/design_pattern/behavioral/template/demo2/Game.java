package design_pattern.behavioral.template.demo2;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {
        //initialize the game
        initialize();
        //start game
        startPlay();
        //end game
        endPlay();
    }
}
