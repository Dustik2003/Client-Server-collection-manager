package commands;

import worker.MapWorker;

public class Info extends Command {
    public Info() {
        super(" ������� � ����������� ����� ������ ���������� � ��������� (���, ���� �������������, ���������� ��������� � �.�.)");
    }

    @Override
    public void execute() {
        System.out.println("Type of collection: LinkedHashMap");
        System.out.println("Date of initialization: "+MapWorker.date);
        System.out.println("Count of elements: "+MapWorker.getWorkers().keySet().size());
    }
}
