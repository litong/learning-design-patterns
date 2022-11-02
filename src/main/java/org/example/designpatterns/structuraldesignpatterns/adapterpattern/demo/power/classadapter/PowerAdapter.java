package org.example.designpatterns.structuraldesignpatterns.adapterpattern.demo.power.classadapter;

/**
 * @author : litong
 * @since : 11/1/22, Tue
 **/
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        int adapterInput = super.outputAC200V();
        int adapterOutput = adapterInput / 44;
        System.out.println("适用Adapter输入AC" + adapterInput + "V，输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
