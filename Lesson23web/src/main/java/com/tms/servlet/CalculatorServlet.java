package com.tms.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.tms.utils.Calculator.*;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        try {
            Double param1 = getValueFromRequest(req, "param1");
            Double param2 = getValueFromRequest(req, "param2");
            String operation = req.getParameter("operation");
            Double result = calculate(param1, param2, operation);
            println(resp, "Operation result: " + operation + " = " + result);
        } catch (NumberFormatException exception) {
            println(resp, "Не верный формат значений");
        } catch (IllegalStateException exception2) {
            println(resp, "Не верная операция");
        } catch (Exception exception) {
            println(resp, exception.getMessage());
        }
    }

    private Double calculate(Double param1, Double param2, String operation) {
        return switch (operation) {
            case "sum" -> sum(param1, param2);
            case "multiply" -> multiply(param1, param2);
            case "divide" -> divide(param1, param2);
            case "subtraction" -> subtraction(param1, param2);
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }

    private Double getValueFromRequest(HttpServletRequest req, String parameterName) {
        if (parameterName == null) {
            throw new IllegalStateException("parameter" + parameterName + "not set");
        }
        return Double.valueOf(req.getParameter(parameterName));
    }

    private void println(HttpServletResponse response, String message) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(message);
    }
}
