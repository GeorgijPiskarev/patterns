package creational.builder;

import creational.builder.builders.DrawingBuilder;
import creational.builder.builders.HouseBuilder;
import creational.builder.houses.Drawing;
import creational.builder.houses.House;

//Директор дает указание строителям по постройке дома определенного типа, либо указания по чертежу дома определенного типа.
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder houseBuilder = new HouseBuilder();
        director.constructBlockHouse(houseBuilder);
        House house = houseBuilder.getResult();
        System.out.println("Построен дом. Тип дома " + house.getType());
        System.out.println();

        DrawingBuilder drawingBuilder = new DrawingBuilder();
        director.constructPanelHouse(drawingBuilder);
        Drawing drawing = drawingBuilder.getResult();
        System.out.println(drawing.print());

        director.constructBrickMonolithicHouse(drawingBuilder);
        Drawing drawing1 = drawingBuilder.getResult();
        System.out.println(drawing1.print());
    }
}
