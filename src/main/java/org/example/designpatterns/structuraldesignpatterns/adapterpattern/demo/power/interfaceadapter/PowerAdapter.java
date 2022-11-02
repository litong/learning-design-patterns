package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.power.interfaceadapter;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class PowerAdapter implements DC {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC200V();
        int adapterOutput = adapterInput / 44;
        System.out.println("适用Adapter输入AC" + adapterInput + "V，输出DC" + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
