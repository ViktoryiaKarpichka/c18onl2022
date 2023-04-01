package com.tms.utils;

import com.tms.controller.BaseCommandController;
import com.tms.controller.CategoryController;
import com.tms.controller.HomeController;
import com.tms.model.Commands;
import com.tms.model.RequestParams;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.http.HttpServletRequest;

public class CommandControllerFactory {

    private static final Map<String, BaseCommandController> COMMANDS = new ConcurrentHashMap<>();

    static {
        COMMANDS.put(Commands.HOME_PAGE_COMMAND.getCommand(), new HomeController());
        COMMANDS.put(Commands.SIGN_IN_COMMAND.getCommand(), new CategoryController());

    }

    public static BaseCommandController defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParams.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Commands.SIGN_IN_COMMAND.getCommand();//registration categoryServlet
        }
        return COMMANDS.get(commandKey);
    }
}
