package client;

import domain.GameBlock;
import domain.GameStructure;
import domain.impl.Cube;
import domain.impl.Cylinder;
import domain.impl.Pyramid;

public class Client {
    public static void main(String[] args) {

        GameBlock building = new GameStructure();
        GameBlock cube = new Cube();
        GameBlock cylinder = new Cylinder();
        GameBlock pyramid = new Pyramid();
        GameBlock structure = new GameStructure();

        building.addBlock(cube);
        building.addBlock(cylinder);
        building.addBlock(structure);
        structure.addBlock(pyramid);

        building.setColor("黄色");
        structure.setColor("紫色");
        building.display();
    }
}