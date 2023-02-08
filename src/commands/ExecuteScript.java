package commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExecuteScript extends CommandWithArg {
    public ExecuteScript() {
        super("������� � ��������� ������ �� ���������� �����. � ������� ���������� ������� � ����� �� ����, � ������� �� ������ ������������ � ������������� ������.");
    }

    @Override
    public void execute() {
        try {
            setCin(new Scanner(new File(arg)));
        } catch (FileNotFoundException e) {
            System.out.println("!!!The file wasn't found!!!");
            new Exit().execute();
            throw new RuntimeException(e);
        }
        while (this.cin.hasNextLine()) {
            String[] commandName = cin.nextLine().trim().split(" ");
            if (new CommandsDict().getCommandsManger().containsKey(commandName[0])) {
                Command cmd = new CommandsDict().getCommandsManger().get(commandName[0]);
                if (commandName.length > 1) {
                    cmd.setArg(commandName[1]);
                    cmd.setCin(cin);
                }
                if (!arg.equals(cmd.getArg())) {
                    System.out.println(commandName[0]+ ":");
                    System.out.println();
                    cmd.execute();
                    System.out.println("\n");
                } else {
                    System.out.println("!!!File exists command with entered filename!!!");
                }
                History.move(commandName[0]);
            }
        }
    }

}
