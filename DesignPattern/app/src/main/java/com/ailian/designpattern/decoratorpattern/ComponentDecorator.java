package com.ailian.designpattern.decoratorpattern;

/**
 * Created by Ailian on 17/1/19.
 */

public class ComponentDecorator extends Component{

    Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
