package com.arturmkrtchyan.mintds.protocol.request;

import java.util.Optional;

public enum Command {

    CREATE,
    EXISTS,
    ADD,
    REMOVE,
    DROP,
    CONTAINS,
    COUNT;

    public static Optional<Command> fromString(final String command) {
        for (Command cmd : Command.values()) {
            if (cmd.name().equalsIgnoreCase(command)) {
                return Optional.of(cmd);
            }
        }
        return Optional.empty();
    }


}
