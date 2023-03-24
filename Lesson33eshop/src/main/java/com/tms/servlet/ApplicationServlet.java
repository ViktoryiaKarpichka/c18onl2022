package com.tms.servlet;

import com.tms.controller.BaseCommandController;
import com.tms.exeptions.CommandException;
import com.tms.model.PagesPath;
import com.tms.utils.CommandControllerFactory;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/eshop")
public class ApplicationServlet extends HttpServlet {

    //совсем беда, по кусочкам вроде что-то понимаешь, но собрать не получается
    //как команда понимает, на какую страницу переходить, не могу найти эту связь. Попыталась вывести хотя бы категории товаров,
    //но не получилось. На старте приложения у меня страница логина и пароля (пока статические данные) и при вводе данных я остаюсь на той же странице а в браузере http://localhost:8080/eshop/?command=start_page
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BaseCommandController baseController = CommandControllerFactory.defineCommand(request);
        try {
            String path = baseController.execute(request);
            RequestDispatcher dispatcher = request.getRequestDispatcher(path);
            dispatcher.forward(request, response);
        } catch (CommandException e) {
            //валидационная ошибка
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            логируем сообщение а потом должны перенаправить на страницу с ошибкой("Извините что-то поломалось!!!"),
            //https://blog.hubspot.com/marketing/http-500-internal-server-error
//            также можно конверсейшен в URL запроса поместить
            request.getRequestDispatcher(PagesPath.SIGN_IN_PAGE.getPath()).forward(request, response);
        }
    }
}
