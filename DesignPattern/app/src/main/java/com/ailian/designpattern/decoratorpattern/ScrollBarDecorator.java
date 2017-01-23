package com.ailian.designpattern.decoratorpattern;

/**
 * Created by Ailian on 17/1/19.
 */

public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        addDecorator();
        super.display();
    }

    private void addDecorator() {
        System.out.println("添加滚动功能。。。");
    }
}
