package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.power.objectadapter;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 source) {
        this.ac220 = source;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC200V();
        int adapterOutput = adapterInput / 44;
        System.out.println("适用Adapter输入AC" + adapterInput + "V，输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
