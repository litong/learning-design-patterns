package org.example.designpatterns.structuraldesignpatterns.decoratorpattern.general;

/**
 * @author : litong
 * @since : 11/9/22, Wed
 **/
public class ConcreteComponent extends Component {
    @Override
    void operation() {
        System.out.println("处理业务逻辑");
    }
}
