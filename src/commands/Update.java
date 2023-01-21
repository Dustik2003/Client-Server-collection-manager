package commands;

import worker.MapWorker;

public class Update extends CommandsWithElements {


    public Update() {
        super("�������� �������� �������� ���������, id �������� ����� ��������� ");
    }

    @Override
    public void execute() {
        if (MapWorker.getWorkers().containsKey(Long.parseLong(getArg())))
            MapWorker.getWorkers().replace(Long.parseLong(getArg()), dataLoader());
        else System.out.println("Element with entered id wasn't found");
    }
}
