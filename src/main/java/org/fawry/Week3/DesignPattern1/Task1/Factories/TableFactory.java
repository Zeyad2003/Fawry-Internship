package org.fawry.Week3.DesignPattern1.Task1.Factories;

import org.fawry.Week3.DesignPattern1.Task1.AbstractFactory;
import org.fawry.Week3.DesignPattern1.Task1.Furniture;
import org.fawry.Week3.DesignPattern1.Task1.TableFamily.ArtDecoTable;
import org.fawry.Week3.DesignPattern1.Task1.TableFamily.ModernTable;
import org.fawry.Week3.DesignPattern1.Task1.TableFamily.VictorianTable;
import org.fawry.Week3.DesignPattern1.Task1.types;

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
