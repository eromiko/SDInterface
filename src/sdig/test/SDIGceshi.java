package sdig.test;

import sdig.service.GetPersonInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ceshiServlet")
public class SDIGceshi extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GetPersonInfo getPersonInfo = new GetPersonInfo();
        String personCount = null;
        try {
            personCount = String.valueOf(getPersonInfo.getPersonCount());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.getWriter().write(personCount);
    }
}
