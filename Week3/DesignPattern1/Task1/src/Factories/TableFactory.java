package src.Factories;

import src.AbstractFactory;
import src.Furniture;
import src.TableFamily.ArtDecoTable;
import src.TableFamily.ModernTable;
import src.TableFamily.VictorianTable;
import src.types;

public class TableFactory implements AbstractFactory {
    @Override
    public Furniture createFurniture(types type) {
        if(type == types.MODERN) {
            return new ModernTable();
        } else if(type == types.VICTORIAN) {
            return new VictorianTable();
        } else if(type == types.ART_DECO) {
            return new ArtDecoTable();
        } else {
            return null;
        }
    }
}
