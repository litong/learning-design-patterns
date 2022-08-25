package org.example.designpatterns.creationaldesignpatterns.singletonpattern.registersingletonpattern.version1;

/**
 * @author : litong
 * @since : 8/25/22, Thu
 **/
public enum Singleton {
    /**
     * 实例
     */
    INSTANCE;

    private Object data;

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
