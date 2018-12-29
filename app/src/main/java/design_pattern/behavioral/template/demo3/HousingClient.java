package design_pattern.behavioral.template.demo3;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseTemplate = new WoodenHouse();
        //using template method
        houseTemplate.buildHouse();
        System.out.println("***********");

        houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();
/**
 Building foundations with cement,iron rods and sand
 Building Pillars with Wood coating
 Building Wooden Walls
 Building Glass Windows
 House is built.
 ***********
 Building foundations with cement,iron rods and sand
 Building Pillars with glass coating
 Building Glass Walls
 Building Glass Windows
 House is built.
 */
    }
}
