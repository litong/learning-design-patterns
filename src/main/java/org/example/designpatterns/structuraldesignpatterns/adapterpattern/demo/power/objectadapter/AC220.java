package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.power.objectadapter;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class AC220 {
    public int outputAC200V() {
        int output = 220;
        System.out.println("输出电压=" + output + "V");
        return output;
    }
}
