package commands;

public class Exit extends Command {
    public Exit() {
        super("������� � ��������� ������ �� ���������� �����. � ������� ���������� ������� � ����� �� ����, � ������� �� ������ ������������ � ������������� ������.");
    }

    @Override
    public String execute() {
        return "java eto p****";
    }
}
