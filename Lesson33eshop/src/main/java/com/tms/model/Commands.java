package com.tms.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Commands {
    HOME_PAGE_COMMAND("start_page"),
    SIGN_IN_COMMAND("sign-in");

    private static final Map<String, Commands> commandMapping = new HashMap<>();

    static {
        for (Commands type : values()) {
            commandMapping.put(type.getCommand(), type);
        }
    }

    public static Commands fromString(String type) {
        return Optional.ofNullable(commandMapping.get(type))
                       .orElseThrow(() -> new IllegalStateException("Unknown command type"));
    }

    private final String command;

    Commands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
