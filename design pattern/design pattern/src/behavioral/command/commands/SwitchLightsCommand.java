package behavioral.command.commands;

import behavioral.command.components.Light;

public record SwitchLightsCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.switchLights();
    }

}