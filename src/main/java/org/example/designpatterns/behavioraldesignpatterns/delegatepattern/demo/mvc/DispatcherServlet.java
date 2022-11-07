package org.example.designpatterns.behavioraldesignpatterns.delegatepattern.demo.mvc;

import org.example.designpatterns.behavioraldesignpatterns.delegatepattern.demo.mvc.controllers.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class DispatcherServlet extends HttpServlet {

    private final Map<String, Method> handlerMapping = new HashMap<>();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String url = req.getRequestURI();
        Method method = handlerMapping.get(url);
//        method.invoke();
    }

    @Override
    public void init() throws ServletException {

        try {
            handlerMapping.put("/web/getMemberById.json", MemberController.class.getMethod("getMemberById", String.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
