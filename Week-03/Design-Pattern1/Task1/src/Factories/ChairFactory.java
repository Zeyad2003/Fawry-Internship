package src.Factories;

import src.AbstractFactory;
import src.ChairFamily.ArtDecoChair;
import src.ChairFamily.ModernChair;
import src.ChairFamily.VictorianChair;
import src.Furniture;
import src.types;

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
