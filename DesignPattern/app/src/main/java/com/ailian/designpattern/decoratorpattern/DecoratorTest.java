package com.ailian.designpattern.decoratorpattern;

/**
 * Created by Ailian on 17/1/19.
 */

public class DecoratorTest {

    public static void main(String[] args){
        Component component,componentSB,componentBB;
        component = new TextBox();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }

}
