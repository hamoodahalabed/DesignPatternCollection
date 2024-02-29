package behavioral.command.commands;

import behavioral.command.components.Curtains;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {

    @Override
    public void execute() {
        curtains.openClose();
    }

}