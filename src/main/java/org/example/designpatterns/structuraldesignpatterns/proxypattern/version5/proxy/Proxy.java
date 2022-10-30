package org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author : litong
 * @since : 9/2/22, Fri
 **/
public class Proxy {

    private static final String ln = "\r\n";

    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        try {
            // 动态生成 Java 文件
            String src = generateSrc(interfaces);

            // Java 文件输出到磁盘，保存为文件 $$Proxy0.java
            String filePath = Proxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            // 把 .java 文件编译成 $Proxy0.class 文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();
            f.delete();

            // 把生成的 .class 文件加载到 JVM 中
            Class proxyClass = loader.findClass("$Proxy0");
            Constructor constructor = proxyClass.getConstructor(InvocationHandler.class);
            // 返回新的代理对象
            return constructor.newInstance(handler);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.proxy;" + ln + ln);
        sb.append("import org.example.designpatterns.structuraldesignpatterns.proxypattern.version5.client.IPerson;" + ln);
        sb.append("import java.lang.reflect.*;" + ln + ln);
        sb.append("public final class $Proxy0 implements ").append(interfaces[0].getName()).append(" {").append(ln).append(ln);
        sb.append("    InvocationHandler handler;" + ln + ln);
        sb.append("    public $Proxy0(InvocationHandler handler) { " + ln);
        sb.append("        this.handler = handler;" + ln);
        sb.append("    }" + ln + ln);

        for (Method method : interfaces[0].getMethods()) {
            Class<?>[] params = method.getParameterTypes();

//            StringBuilder paramNames = new StringBuilder();
//            StringBuilder paramValues = new StringBuilder();
//            StringBuilder paramClasses = new StringBuilder();
//
//            for (int i = 0; i < params.length; i++) {
//                Class clazz = params[i];
//                String type = clazz.getName();
//            }

            sb.append("    @Override" + ln);
            sb.append("    public " + method.getReturnType().getName() + " " + method.getName() + "() { " + ln);
            sb.append("        try { " + ln);
            sb.append("            Method method = " + interfaces[0].getName() + ".class.getMethod(\"" + method.getName() + "\",new Class[]{});" + ln);
            sb.append("            this.handler.invoke(this,method,new Object[]{});" + ln);
            sb.append("            return;" + ln);
            sb.append("        } " + ln);
            sb.append("        catch(Error _ex) { } " + ln);
            sb.append("        catch(Throwable throwable)" + ln);
            sb.append("        {" + ln);
            sb.append("            throw new UndeclaredThrowableException(throwable);" + ln);
            sb.append("        }" + ln);
            sb.append("    }" + ln);
        }

        sb.append("}");

        return sb.toString();
    }
}
