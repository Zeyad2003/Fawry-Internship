package org.fawry.Week3.DesignPattern1.Task1.ChairFamily;

import org.fawry.Week3.DesignPattern1.Task1.Furniture;

public class ModernChair implements Furniture {
    @Override
    public void describe() {
        System.out.println("This is a Modern chair.");
    }
}
