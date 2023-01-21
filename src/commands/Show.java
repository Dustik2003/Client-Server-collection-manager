package commands;

import worker.MapWorker;

public class Show extends Command {


    @Override
    public void execute() {
        for (Long id : MapWorker.getWorkers().keySet()) {
            System.out.println(id + "=" + MapWorker.getWorkers().get(id).toString());
        }
    }

    public Show() {
        super("������� � ����������� ����� ������ ��� �������� ��������� � ��������� �������������");
    }
}
