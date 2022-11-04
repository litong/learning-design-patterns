package org.example.designpatterns.structuraldesignpatterns.compositepattern.general.transparent;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return null;
    }
}
