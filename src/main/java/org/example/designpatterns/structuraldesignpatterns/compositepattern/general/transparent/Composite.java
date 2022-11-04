package org.example.designpatterns.structuraldesignpatterns.compositepattern.general.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 树节点
 *
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class Composite extends Component {
    private List<Component> mComponent;

    public Composite(String name) {
        super(name);
        this.mComponent = new ArrayList<>();
    }


    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component : this.mComponent) {
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    @Override
    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    @Override
    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("removeChild not supported!");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("getChild not supported!");
    }
}
