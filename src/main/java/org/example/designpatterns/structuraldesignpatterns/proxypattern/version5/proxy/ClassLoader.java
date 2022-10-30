package org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.proxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author : litong
 * @since : 9/2/22, Fri
 **/
public class ClassLoader extends java.lang.ClassLoader {

    private File classPathFile;

    public ClassLoader() {
        String classPath = ClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = ClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            FileInputStream in = null;
            ByteArrayOutputStream out = null;
            try {
                in = new FileInputStream(classFile);
                out = new ByteArrayOutputStream();
                byte[] buff = new byte[1024];
                int len;
                while ((len = in.read(buff)) != -1) {
                    out.write(buff, 0, len);
                }
                return defineClass(className, out.toByteArray(), 0, out.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
