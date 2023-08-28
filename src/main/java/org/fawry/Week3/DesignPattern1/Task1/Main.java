package org.fawry.Week3.DesignPattern1.Task1;

import org.fawry.Week3.DesignPattern1.Task1.ChairFamily.ArtDecoChair;
import org.fawry.Week3.DesignPattern1.Task1.Factories.*;

public class Main {
    public static void main(String[] args) {
        // Chair Test
        AbstractFactory chairFactory = new ChairFactory();

        Furniture artDecoChair = chairFactory.createFurniture(types.ART_DECO);
        Furniture victorianChair = chairFactory.createFurniture(types.VICTORIAN);
        Furniture modernChair = chairFactory.createFurniture(types.MODERN);

        artDecoChair.describe();
        victorianChair.describe();
        modernChair.describe();

        // Sofa Test
        AbstractFactory sofaFactory = new SofaFactory();

        Furniture artDecoSofa = sofaFactory.createFurniture(types.ART_DECO);
        Furniture victorianSofa = sofaFactory.createFurniture(types.VICTORIAN);
        Furniture modernSofa = sofaFactory.createFurniture(types.MODERN);

        artDecoSofa.describe();
        victorianSofa.describe();
        modernSofa.describe();

        // Table Test
        AbstractFactory tableFactory = new TableFactory();

        Furniture artDecoTable = tableFactory.createFurniture(types.ART_DECO);
        Furniture victorianTable = tableFactory.createFurniture(types.VICTORIAN);
        Furniture modernTable = tableFactory.createFurniture(types.MODERN);

        artDecoTable.describe();
        victorianTable.describe();
        modernTable.describe();
    }
}
