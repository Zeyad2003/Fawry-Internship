package src.Factories;

import src.AbstractFactory;
import src.Furniture;
import src.SofaFamily.ArtDecoSofa;
import src.SofaFamily.ModernSofa;
import src.SofaFamily.VictorianSofa;
import src.types;

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
