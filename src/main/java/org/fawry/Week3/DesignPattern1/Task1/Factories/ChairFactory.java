package org.fawry.Week3.DesignPattern1.Task1.Factories;

import org.fawry.Week3.DesignPattern1.Task1.AbstractFactory;
import org.fawry.Week3.DesignPattern1.Task1.ChairFamily.ArtDecoChair;
import org.fawry.Week3.DesignPattern1.Task1.ChairFamily.ModernChair;
import org.fawry.Week3.DesignPattern1.Task1.ChairFamily.VictorianChair;
import org.fawry.Week3.DesignPattern1.Task1.Furniture;
import org.fawry.Week3.DesignPattern1.Task1.types;

public class ChairFactory implements AbstractFactory {
    @Override
    public Furniture createFurniture(types type) {
        if(type == types.MODERN) {
            return new ModernChair();
        } else if(type == types.VICTORIAN) {
            return new VictorianChair();
        } else if(type == types.ART_DECO) {
            return new ArtDecoChair();
        } else {
            return null;
        }
    }
}
