package org.example.designpatterns.structuraldesignpatterns.proxypattern.version2;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class Zhanglaosan implements IPerson {

    private IPerson zhangsan = new Zhangsan();

    public Zhanglaosan(IPerson zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public void findLove() {
        System.out.println("开始物色");
        zhangsan.findLove();
        System.out.println("开始交往");
    }
}
