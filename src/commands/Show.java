package commands;

import worker.MapWorker;

public class Show extends Command{


    @Override
    public void execute() {
        System.out.println(MapWorker.getWorkers().toString());
    }

    public Show() {
        super("������� � ����������� ����� ������ ��� �������� ��������� � ��������� �������������");
    }
}
