package org.example.designpatterns.structuraldesignpatterns.compositepattern.general.safe;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}
