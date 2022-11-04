package org.example.designpatterns.structuraldesignpatterns.compositepattern.demo.safe.file;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("========== 安全的组合模式 ==========");

        File qq = new File("QQ.exe");
        File wx = new File("微信.exe");

        Folder office = new Folder("办公软件", 2);

        File word = new File("Word.exe");
        File ppt = new File("PowerPoint.exe");
        File excel = new File("Excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder root = new Folder("D盘", 1);
        root.add(qq);
        root.add(wx);
        root.add(office);

        root.show();
        root.list();
    }
}
