package src.TableFamily;

import src.Furniture;

public class ModernTable implements Furniture {
    @Override
    public void describe() {
        System.out.println("This is a modern table.");
    }
}
