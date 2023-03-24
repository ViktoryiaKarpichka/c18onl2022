package com.tms.controller;

import com.tms.exeptions.CommandException;
import javax.servlet.http.HttpServletRequest;

public interface BaseCommandController {

    String execute(HttpServletRequest request) throws CommandException;
}
