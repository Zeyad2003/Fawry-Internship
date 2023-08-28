package org.fawry.Week3.DesignPattern1.Task1.Factories;

import org.fawry.Week3.DesignPattern1.Task1.AbstractFactory;
import org.fawry.Week3.DesignPattern1.Task1.Furniture;
import org.fawry.Week3.DesignPattern1.Task1.SofaFamily.ArtDecoSofa;
import org.fawry.Week3.DesignPattern1.Task1.SofaFamily.ModernSofa;
import org.fawry.Week3.DesignPattern1.Task1.SofaFamily.VictorianSofa;
import org.fawry.Week3.DesignPattern1.Task1.types;

public class SofaFactory implements AbstractFactory {
    @Override
    public Furniture createFurniture(types type) {
        if(type == types.MODERN) {
            return new ModernSofa();
        } else if(type == types.VICTORIAN) {
            return new VictorianSofa();
        } else if(type == types.ART_DECO) {
            return new ArtDecoSofa();
        } else {
            return null;
        }
    }
}
