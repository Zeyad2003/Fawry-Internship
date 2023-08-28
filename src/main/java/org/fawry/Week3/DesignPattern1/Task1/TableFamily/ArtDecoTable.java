package org.fawry.Week3.DesignPattern1.Task1.TableFamily;

import org.fawry.Week3.DesignPattern1.Task1.Furniture;

public class ArtDecoTable implements Furniture {
    @Override
    public void describe() {
        System.out.println("This is an Art Deco table.");
    }
}
