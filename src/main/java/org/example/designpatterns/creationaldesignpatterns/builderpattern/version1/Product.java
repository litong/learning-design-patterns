package org.example.designpatterns.creationaldesignpatterns.builderpattern.version1;

import lombok.Data;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
@Data
public class Product {
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
