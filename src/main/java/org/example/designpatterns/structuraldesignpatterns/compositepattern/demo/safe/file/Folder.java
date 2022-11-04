package org.example.designpatterns.structuraldesignpatterns.compositepattern.demo.safe.file;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class Folder extends Directory {

    protected Integer level;
    private List<Directory> dirs;


    public Folder(String name, Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Directory dir : dirs) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
                for (int i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");

                }
            }
            dir.show();
        }
    }

    public boolean add(Directory dir) {
        return this.dirs.add(dir);
    }

    public boolean remove(Directory dir) {
        return this.dirs.remove(dir);
    }

    public Directory get(int index) {
        return this.dirs.get(index);
    }

    public void list() {
        for (Directory dir : dirs) {
            System.out.println(dir.name);
        }
    }
}
