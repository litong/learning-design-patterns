package org.example.designpatterns.creationaldesignpatterns.builderpattern.version1;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public class ConcreteBuilder implements IBuilder {

    private Product product = new Product();

    @Override
    public Product build() {
        return product;
    }
}
