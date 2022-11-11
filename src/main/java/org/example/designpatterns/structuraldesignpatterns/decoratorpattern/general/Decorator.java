package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.general;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public abstract class Decorator extends Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void operation() {
        component.operation();
    }
}
