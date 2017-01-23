package com.ailian.designpattern.decoratorpattern;

/**
 * Created by Ailian on 17/1/19.
 */

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        addBlackBorder();
        super.display();
    }

    private void addBlackBorder() {
        System.out.println("添加黑边框功能。。。");
    }
}
