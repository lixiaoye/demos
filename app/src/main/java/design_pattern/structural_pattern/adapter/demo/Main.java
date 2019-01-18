package design_pattern.structural_pattern.adapter.demo;


/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        //wrap a bird in a birdAdapter so that it behaves like toy duck.
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        System.out.println("Sparrow....");
        sparrow.fly();
        sparrow.makeSound();
        System.out.println("ToyDuck...");
        toyDuck.squeak();

        //toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
    /**
     Sparrow....
     Flying
     Chirp Chirp
     ToyDuck...
     Squeak
     BirdAdapter...
     Chirp Chirp
     */
}
