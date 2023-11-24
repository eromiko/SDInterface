package sdig.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import sdig.model.DataInfo;
import sdig.service.GetPersonInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/txtotal")
public class TxTotalServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static ObjectMapper MAPPER = new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GetPersonInfo c = new GetPersonInfo();
        try {
            List<DataInfo> list = c.getTxCount();
            String jsonArray = MAPPER.writeValueAsString(list);
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().print(jsonArray);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
