package org.example.designpatterns.structuraldesignpatterns.compositepattern.general.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class Composite extends Component {
    private List<org.example.designpatterns.structuraldesignpatterns.compositepattern.general.transparent.Component> mComponent;

    public Composite(String name) {
        super(name);
        this.mComponent = new ArrayList<>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (org.example.designpatterns.structuraldesignpatterns.compositepattern.general.transparent.Component component : this.mComponent) {
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    public boolean addChild(org.example.designpatterns.structuraldesignpatterns.compositepattern.general.transparent.Component component) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    public boolean removeChild(org.example.designpatterns.structuraldesignpatterns.compositepattern.general.transparent.Component component) {
        throw new UnsupportedOperationException("removeChild not supported!");
    }

    public org.example.designpatterns.structuraldesignpatterns.compositepattern.general.transparent.Component getChild(int index) {
        throw new UnsupportedOperationException("getChild not supported!");
    }
}
