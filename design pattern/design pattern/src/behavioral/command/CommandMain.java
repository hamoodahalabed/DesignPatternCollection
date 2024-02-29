package behavioral.command;

import behavioral.command.commands.OpenCloseCurtainsCommand;
import behavioral.command.commands.SwitchLightsCommand;
import behavioral.command.components.FloorLamp;
import behavioral.command.components.Light;
import behavioral.command.components.Room;

public class CommandMain {
    public static void main(String[] args) {

        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();

        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        Light myRoomLight = new Light();

        room.setCommand(new SwitchLightsCommand(myRoomLight));
        room.executeCommand();

        System.out.println(myRoomLight.isSwitchedOn());

        System.out.println("==========================================");

        room.setCommand(new SwitchLightsCommand(myRoomLight));
        room.executeCommand();

        System.out.println(myRoomLight.isSwitchedOn());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());

    }
}
